/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class Real extends Moedas implements Tarifacao{
    @Override
    public double calcularCompra(Orcamento orcamento){
        return orcamento.getValor() * 0.0;
    }
    @Override
    public double calcularVenda(Orcamento orcamento){
        return orcamento.getValor() * 0.0;
    }

    public Real(String nome, double cotacao) {
        super("Real", cotacao);
    }

    public Real() {
    }
    
}
