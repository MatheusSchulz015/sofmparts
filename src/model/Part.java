/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.dao.DAO;

/**
 *
 * @author matheus.souza
 */
public class Part extends DAO
{
    protected int id;
    protected String nome;
    protected double preco;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNomePeca() {
        return nome;
    }

    public void setNomePeca(String nomePeca) {
        this.nome = nomePeca;
    }

    public double getPrecoPeca() {
        return preco;
    }

    public void setPrecoPeca(double precoPeca) {
        this.preco = precoPeca;
    }
}
