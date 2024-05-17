/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class Bitcoin extends Moedas implements Tarifacao{
    @Override
    public double calcularCompra(Valor orcamento){
        return orcamento.getValor() * 0.02;
    }
    @Override
    public double calcularVenda(Valor orcamento){
        return orcamento.getValor() * 0.03;
    }

    public Bitcoin(String nome, double cotacao) {
        super("Bitcoin", cotacao);
    }

    public Bitcoin() {
    }
    
}
