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

    public double calcularCompra(double orcamento){
        return orcamento * 0.01;
    }

    public double calcularVenda(double orcamento){
        return orcamento * 0.02;
    }

    public Ethereum(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(2, "Ethereum", cotacao, compra, venda);
    }

    public Ethereum() {
    }
    
}
