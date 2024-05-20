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
    public double calcularCompra(double orcamento){
        return orcamento * 0.02;
    }
    @Override
    public double calcularVenda(double orcamento){
        return orcamento * 0.03;
    }

    public Bitcoin(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(1, "Bitcoin", cotacao, compra, venda);
    }

    public Bitcoin() {
    }
    
}
