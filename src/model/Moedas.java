/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class Moedas{
    private String nome;
    private int ID_crypto;
    private double cotacao, compra, venda;

    public int getID_crypto() {
        return ID_crypto;
    }

    public void setID_crypto(int ID_crypto) {
        this.ID_crypto = ID_crypto;
    }

    public Moedas(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        this.ID_crypto = ID_crypto;
        this.nome = nome;
        this.cotacao = cotacao;
        this.compra = compra;
        this.venda = venda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public Moedas() {
    }
    
    
}
