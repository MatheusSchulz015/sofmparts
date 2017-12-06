/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import model.Client;
import model.Part;
import net.proteanit.sql.DbUtils;
import view.venderPeca;

/**
 *
 * @author aluno
 */
public class PedidoController {
    venderPeca frameVenda;
    Part part = new Part();
    Client client;
    public PedidoController(venderPeca framebusca)
    {
        
        this.frameVenda = framebusca;
    }  
    
    public void buscarPeca()
    {
         this.frameVenda.tablePeca.setModel(DbUtils.resultSetToTableModel(this.part.pegaDados()));
    }
    
    public void buscarCliente()
    {
        this.frameVenda.tablecliente.setModel(DbUtils.resultSetToTableModel(this.client.pegaDados()));
        //this.client.pegaDados(this.frameVenda.tablecliente);
    }
}
