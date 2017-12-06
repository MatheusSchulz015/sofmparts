/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.awt.BorderLayout;
import java.awt.List;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Client;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author aluno
 */

public class DAO
{
    public Connection connection=null;
    public Statement statement=null;
    public ResultSet results=null;
    private String id = null;
    ConnectionClass conn = new ConnectionClass();
 public Connection connection(){
   String user = "root";
   String password = "";
   String server = "jdbc:mysql://localhost:3306/sofm";
   String driver = "com.mysql.jdbc.Driver";
   try{
       Class.forName(driver);
       this.connection = DriverManager.getConnection(server, user, password); 
       this.statement =(Statement) this.connection.createStatement();
    
   }catch(Exception e){
       JOptionPane.showMessageDialog(null,"Erro"+e.getMessage());
  }  
 return connection;
         }
 
 public boolean isconnected(){
     if(connection!=null){
         return true;
     }
return false;
 }
 
 
 
//   public void listaFields() { 
//            String table = this.getClass().getSimpleName().toLowerCase();
//       String query = "insert into "+table+" (";
//       try {
//            Class cls = Class.forName(this.getClass().getName());
//            Field fieldlist[] = cls.getDeclaredFields();
//            
//            
//            
//            for (int i 
//              = 0; i < fieldlist.length; i++){
//               Field fld = fieldlist[i];
//               System.out.println("nome do compo = " + fld.getName()+" tipo = "+fld.getType());
//               query +=" "+fld.getName().toLowerCase();
//            }
//          }
//          catch (Throwable e) {
//             System.err.println(e);
//          }
//       
//       JOptionPane.showMessageDialog(null, query);
//}
 String table = this.getClass().getSimpleName().toLowerCase(); //nome da tabela que é igual ao nome da classe
  public void save()
  {   
    Class c = this.getClass();
        try{
          c.newInstance();
        }catch(Exception e)
        {
            
        }
     String query = "insert into "+table+" (";
      String values =" ('";
      String t = null;
      String collum=table+" (";
      Class<Integer> integer = int.class;
      Class<String> string = String.class;
       try {
            Class cls = Class.forName(this.getClass().getName());
            Field fieldlist[] = cls.getDeclaredFields();
            String id=null;
            Statement stmt = connection().createStatement();
            
            for (int i = 0; i < fieldlist.length; i++)
            {
               Field fld = fieldlist[i];
               fld.setAccessible(true);
               id = String.valueOf(fld.get(this));
               //teste.remove(fieldlist[0]);
               //System.out.println("nome do compo = " + fld.getName()+" tipo = "+fld.getType());
               if(!fld.getName().equalsIgnoreCase("id"))
               {
                   
                collum += fld.getName().toLowerCase()+",";
               // JOptionPane.showMessageDialog(null, fld.get(this));
                values+= String.valueOf(fld.get(this))+"','";
               }
                
            }
            collum+=")";
            collum = collum.replaceAll("\\,\\)", "\\)");
            values+=")";
            values = values.replaceAll("\\,\\)", "\\)");
            
            query = "insert into "+collum + "values "+values;
             query = query.replaceAll("\\,\\'\\)", "\\)");
            stmt.execute(query);
          }
          catch (Throwable e) {
             System.err.println(e);
          }
       
       
       JOptionPane.showMessageDialog(null, query);
}
  
  public void find(int id)
  {
    
  }

  
  public void update(ArrayList<String> dados,int id)
  {       
      String params ="";
      String query = "update peca set ";
      try {
            Class cls = Class.forName(this.getClass().getName());
            Field fieldlist[] = cls.getDeclaredFields();
            for (int i = 0; i < fieldlist.length; i++)
            {
                Field fld = fieldlist[i];
                fld.setAccessible(true);
                params="parametro"+i+", ";
                //teste.remove(fieldlist[0]);
               //System.out.println("nome do compo = " + fld.getName()+" tipo = "+fld.getType());
               if(!fld.getName().equalsIgnoreCase("id"))
               {
                   query+=fld.getName().toLowerCase()+"="+params;
               // JOptionPane.showMessageDialog(null, fld.get(this));
                
               }
                
            }
          }
          catch (Throwable e) {
             System.err.println(e);
          }
         StringBuilder b = new StringBuilder(query);
         b.replace(query.lastIndexOf(","), query.lastIndexOf(",") + 1, "" );
         query = b.toString();
         query+= "where id="+1;
         JOptionPane.showMessageDialog(null, query);
          
  }
  public void where() //retorna cliente pesquisado
  {
     
      
  }
  
  public void delete()
  {
      String query = "delete * from "+table+" where id=";
      if (id!=null)
      {
          query+=id;
      }else
      {
          
      }
  }
  
  public ArrayList<String> all() throws ClassNotFoundException{
      ArrayList<String> dados = new ArrayList<>();
     Connection con = conn.connection();
      Statement stmt = null;
      ResultSet rs= null;
      Class cls = Class.forName(this.getClass().getName());
            Field fieldlist[] = cls.getDeclaredFields();
            
      try {
          stmt = (Statement) con.createStatement();
          rs = stmt.executeQuery("select * from peca");
          int i =0;
          
          for (int j = 0; j < fieldlist.length; j++) {
              rs = stmt.executeQuery("select * from peca");
              Field fld = fieldlist[j];
              fld.setAccessible(true);
            
              if (fld.getGenericType().equals(String.class)) //verificando tipo do dado da variavel
              {  
                 try
                { 
                     while(rs.next())
                    {
                      dados.add(String.valueOf(rs.getString(fld.getName().toLowerCase())));
                    }
                    rs= null;
                }catch(Exception e)
                 {
                     System.out.println(e.getMessage());
                 }
                  JOptionPane.showMessageDialog(null, "variavel Tipo String");
                 //pegando a coluna no banco com o mesmo nome e tipo da variavel
                 
              }else if(fld.getGenericType().equals(int.class))
              {
                  try{ while( rs.next())
                  {
                      dados.add(String.valueOf(rs.getInt(fld.getName().toLowerCase())));
                  }
                  rs= null;
                 }catch(Exception e)
                 {
                     System.out.println(e.getMessage());
                 }
              }else if(fld.getGenericType().equals(double.class))
              {
                  try
                  { 
                      while( rs.next())
                    {
                      dados.add(String.valueOf(rs.getDouble(fld.getName().toLowerCase())));
                    }
                  rs= null;
                 }catch(Exception e)
                 {
                     System.out.println(e.getMessage());
                 }
                 
              }
             
          
         
          }
          
          for (int j = 0; j < dados.size(); j++) {
              System.out.println(dados.get(j));
          }
      } catch (Exception e) {
          System.out.println(e.getMessage());
          //JOptionPane.showMessageDialog();;
      }
         
      return dados; 
  }
  
  
  public ResultSet pegaDados()
  { 
      ResultSet rs = null;
      String table = this.getClass().getSimpleName().toLowerCase();
      try{
      statement = (Statement) conn.connection().createStatement();
       rs = statement.executeQuery("select * from "+table); 
      //jtable.setModel(DbUtils.resultSetToTableModel(rs));
      }catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
   return rs;
  }
  public JTable todos()
  {
      JTable jtable = null;
      Connection con = null;
           Statement stmt=null;
           ResultSet rs = null;
            String user = "root";
            String password = "";
            String server = "jdbc:mysql://localhost:3306/sofm";
            String driver = "com.mysql.jdbc.Driver";
               try{
       con = DriverManager.getConnection("jdbc:mysql://localhost/sofm","root","");
       stmt = con.createStatement();
       String query = "select * from client";
       rs = stmt.executeQuery(query);
       ResultSetMetaData rsmt = rs.getMetaData();
       int c = rsmt.getColumnCount();
       Vector column = new Vector(c);
       for(int i = 1; i <= c; i++)
       {
           column.add(rsmt.getColumnName(i));
       }
       Vector data = new Vector();
       Vector row = new Vector();
       while(rs.next())
       {
           row = new Vector(c);
           for(int i = 1; i <= c; i++){
               row.add(rs.getString(i));
           }
           data.add(row);
       }
       JFrame frame = new JFrame();
       frame.setSize(500,120);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
         jtable = new JTable(data,column);
        JScrollPane jsp = new JScrollPane(jtable);
       
               
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "ERROR");
   }finally{
       try{
       stmt.close();
       rs.close();
       con.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERROR CLOSE");
       }
   }
               return jtable;
  }
//  
//  public String toString() {
//  StringBuilder result = new StringBuilder();
//  String newLine = System.getProperty("line.separator");
//
//  result.append( this.getClass().getName() );
//  result.append( " Object {" );
//  result.append(newLine);
//
//  //determine fields declared in this class only (no fields of superclass)
//  Field[] fields = this.getClass().getDeclaredFields();
//
//  //print field names paired with their values
//  for ( Field field : fields  ) {
//    result.append("  ");
//    try {
//      result.append( field.getName() );
//      result.append(": ");
//      //requires access to private field:
//      result.append( field.get(this) );
//    } catch ( IllegalAccessException ex ) {
//      System.out.println(ex);
//    }
//    result.append(newLine);
//  }
//  result.append("}");
//
//  return result.toString();
//}
}
