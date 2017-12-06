/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;
import model.Part;
import view.cadastrarPeca;
import view.venderPeca;

/**
 *
 * @author matheus.souza
 */
public class PartController
{   
    Part peca = new Part();
    cadastrarPeca framePeca;
    venderPeca frameVenda;
    public PartController(JFrame frameVenda)
    {
        
    }
      public static void main(String[] args)
  {
//        SwingUtilities.invokeLater(new Runnable() {
//            
//            public void run() {
//             PartController ldgn = new PartController();
//                
//                    ldgn.listar();
//                
//            }
//            
//        });
    }
      public void buscaPeca()
      {
          TableColumn col = new TableColumn();
          col.setWidth(400);
          this.frameVenda.getTablePeca().addColumn(col);
      }
//       public boolean verificaCampo() {
//        String Nomefantasia = "Nome Fantasia *",Observacao = "Observaçao *", Celular = "Celular *", Cep = "Cep *", Cnpj = "Cnpj *", Email = "Email *", Endereco = "Endereço *", Fax = "Fax *", Nome = "Nome *", Razaosc = "Razão Social *", Site = "Site *", Telefone = "Telefone *";
//        if (this.framePeca.getCampo_Nome2().getText().isEmpty()) {
//            this.framePeca.getNome().setText(Nomefantasia);
//        }
//        if (this.framePeca.getCampo_Celular().getText().isEmpty()) {
//            this.framePeca.getCelular().setText(Celular);
//        }
//        if (this.framePeca.getCampo_Cep().getText().isEmpty()) {
//                this.framePeca.getCep().setText(Cep);
//        }
//        if (this.framePeca.getCampo_Cnpj().getText().isEmpty()) {
//            this.framePeca.getCnpj().setText(Cnpj);
//        }
//        if (this.framePeca.getCampo_Email().getText().isEmpty()) {
//            this.framePeca.getEmail().setText(Email);
//        }
//        if (this.framePeca.getCampo_Endereco().getText().isEmpty()) {
//            this.framePeca.getEndereco().setText(Endereco);
//        }
//        if (this.framePeca.getCampo_Fax().getText().isEmpty()) {
//            this.framePeca.getFax().setText(Fax);
//        }
//        if (this.framePeca.getCampo_Celular().getText().isEmpty()) {
//            this.framePeca.getCelular().setText(Celular);
//        }
//        if (this.framePeca.getCampo_Razaosc().getText().isEmpty()) {
//            this.framePeca.getRazaosc().setText(Razaosc);
//        }
//        if (this.framePeca.getCampo_Site().getText().isEmpty()) {
//            this.framePeca.getSite().setText(Site);
//        }
//        if (this.framePeca.getCampo_Telefone().getText().isEmpty()) {
//            this.framePeca.getTelefone().setText(Telefone);
//        }
//        if ((this.frameClient.getNome().getText().isEmpty()) 
//                || (this.frameClient.getCampo_Celular().getText().isEmpty())
//                || (this.frameClient.getCampo_Cep().getText().isEmpty()) 
//                || (this.frameClient.getCampo_Cnpj().getText().isEmpty())
//                || (this.frameClient.getCampo_Email().getText().isEmpty())
//                || (this.frameClient.getCampo_Endereco().getText().isEmpty())
//                || (this.frameClient.getCampo_Fax().getText().isEmpty())
//                || (this.frameClient.getCampo_Celular().getText().isEmpty())
//                || (this.frameClient.getCampo_Razaosc().getText().isEmpty())
//                || (this.frameClient.getCampo_Site().getText().isEmpty())
//                || (this.frameClient.getCampo_Telefone().getText().isEmpty())) {
//            
//           return false;
//        }else{
//            return true;
//        }
//    }
    public void cadastrarPeca()
    {
        this.peca = peca;
        ArrayList<String> dados = new ArrayList<>();
        this.peca.setNomePeca("asdsadsa");
        this.peca.setPrecoPeca(70);
        this.peca.save();
        
    }
    
    public void listar() {
        try{
        peca.all();
    }catch(Exception e){
            System.out.println(e.getStackTrace());
    }
}
}
