/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Client;
import net.proteanit.sql.DbUtils;
import view.buscarCliente;
import view.cadastrarCliente;
import view.loading;
import view.venderPeca;

/**
 *
 * @author aluno
 */
public class ClientController {
    Client client = new Client();
    cadastrarCliente frameClient;
    buscarCliente frameBusca;
    
    public Client index(){
        return null;
    }
    
    public ClientController(JFrame frameClient)
    {
        if (frameClient instanceof cadastrarCliente) {
            this.frameClient = (cadastrarCliente) frameClient;
        }
        
    }
    
        public ClientController(buscarCliente framebusca)
    {
        
        this.frameBusca = framebusca;
    }
        
      
    
    
    public boolean verificaCampo() {
        String Nomefantasia = "Nome Fantasia *",Observacao = "Observaçao *", Celular = "Celular *", Cep = "Cep *", Cnpj = "Cnpj *", Email = "Email *", Endereco = "Endereço *", Fax = "Fax *", Nome = "Nome *", Razaosc = "Razão Social *", Site = "Site *", Telefone = "Telefone *";
        if (this.frameClient.getCampo_Nome().getText().isEmpty()) {
            this.frameClient.getNome().setText(Nomefantasia);
        }
        if (this.frameClient.getCampo_Celular().getText().isEmpty()) {
            this.frameClient.getCelular().setText(Celular);
        }
        if (this.frameClient.getCampo_Cep().getText().isEmpty()) {
                this.frameClient.getCep().setText(Cep);
        }
        if (this.frameClient.getCampo_Cnpj().getText().isEmpty()) {
            this.frameClient.getCnpj().setText(Cnpj);
        }
        if (this.frameClient.getCampo_Email().getText().isEmpty()) {
            this.frameClient.getEmail().setText(Email);
        }
        if (this.frameClient.getCampo_Endereco().getText().isEmpty()) {
            this.frameClient.getEndereco().setText(Endereco);
        }
        if (this.frameClient.getCampo_Fax().getText().isEmpty()) {
            this.frameClient.getFax().setText(Fax);
        }
        if (this.frameClient.getCampo_Celular().getText().isEmpty()) {
            this.frameClient.getCelular().setText(Celular);
        }
        if (this.frameClient.getCampo_Razaosc().getText().isEmpty()) {
            this.frameClient.getRazaosc().setText(Razaosc);
        }
        if (this.frameClient.getCampo_Site().getText().isEmpty()) {
            this.frameClient.getSite().setText(Site);
        }
        if (this.frameClient.getCampo_Telefone().getText().isEmpty()) {
            this.frameClient.getTelefone().setText(Telefone);
        }
        if ((this.frameClient.getNome().getText().isEmpty()) 
                || (this.frameClient.getCampo_Celular().getText().isEmpty())
                || (this.frameClient.getCampo_Cep().getText().isEmpty()) 
                || (this.frameClient.getCampo_Cnpj().getText().isEmpty())
                || (this.frameClient.getCampo_Email().getText().isEmpty())
                || (this.frameClient.getCampo_Endereco().getText().isEmpty())
                || (this.frameClient.getCampo_Fax().getText().isEmpty())
                || (this.frameClient.getCampo_Celular().getText().isEmpty())
                || (this.frameClient.getCampo_Razaosc().getText().isEmpty())
                || (this.frameClient.getCampo_Site().getText().isEmpty())
                || (this.frameClient.getCampo_Telefone().getText().isEmpty())) {
            
           return false;
        }else{
            return true;
        }
    }
    
    public void cadastrarClient()
    {
        this.client = client;
        ArrayList<String> dados = new ArrayList<>();
        dados.add("peca3");
        dados.add("30.0");
        client.setCelular(this.frameClient.getCampo_Celular().getText());
        client.setCep(this.frameClient.getCampo_Cep().getText());
        client.setCnpj(this.frameClient.getCampo_Cnpj().getText());
        client.setEmail(this.frameClient.getCampo_Email().getText());
        client.setEndereco(this.frameClient.getCampo_Endereco().getText());
        client.setFax(this.frameClient.getCampo_Fax().getText());
        client.setRazaosc(this.frameClient.getCampo_Razaosc().getText());
        client.setSite(this.frameClient.getCampo_Site().getText());
        client.setTelefone(this.frameClient.getCampo_Telefone().getText());
        client.setNome("NOME CLiente");
        client.setObs(this.frameClient.getCampo_Observacao().getText());
        this.client.save();
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
    }
    
    public void buscarClient()
    {
       this.frameBusca.jTable1.setModel(DbUtils.resultSetToTableModel(this.client.pegaDados()));
    }   
}