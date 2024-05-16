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
    private double cotacao;
            //, compra, venda;

    public Moedas(String nome, double cotacao){
//            , double compra, double venda) {
        this.nome = nome;
        this.cotacao = cotacao;
//        this.compra = compra;
//        this.venda = venda;
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

//    public double getCompra() {
//        return compra;
//    }
//
//    public void setCompra(double compra) {
//        this.compra = compra;
//    }
//
//    public double getVenda() {
//        return venda;
//    }
//
//    public void setVenda(double venda) {
//        this.venda = venda;
//    }

    public Moedas() {
    }
    
    
}
