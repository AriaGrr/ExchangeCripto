/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class Ethereum extends Moedas implements Tarifacao{
    @Override
    public double calcularCompra(Orcamento orcamento){
        return orcamento.getValor() * 0.01;
    }
    @Override
    public double calcularVenda(Orcamento orcamento){
        return orcamento.getValor() * 0.02;
    }

    public Ethereum(String nome, double cotacao) {
        super("Ethereum", cotacao);
    }

    public Ethereum() {
    }
    
}
