/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ConnectionClass
{
    protected Connection con = null;
    private Statement stmt=null;
    
    
    public Connection connection()
    {
   String user = "root";
   String password = "";
   String server = "jdbc:mysql://localhost:3306/sofm";
   String driver = "com.mysql.jdbc.Driver";
   try{
       Class.forName(driver);
       this.con = DriverManager.getConnection(server, user, password); 
       this.stmt =(Statement) this.con.createStatement();
       
   }catch(Exception e){
       JOptionPane.showMessageDialog(null,"Erro"+e.getMessage());
  }
   return con;
 }
   public boolean isConnected(){
     if(con!=null){
         return true;
     }  
     return false;
}
  
}
