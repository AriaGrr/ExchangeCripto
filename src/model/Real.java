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

    public double calcularCompra(double orcamento){
        return orcamento * 0.0;
    }

    public double calcularVenda(double orcamento){
        return orcamento * 0.0;
    }

    public Real(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(4, "Real", cotacao, compra, venda);
    }

    public Real() {
    }
    
}
