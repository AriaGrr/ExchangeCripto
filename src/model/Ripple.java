/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class Ripple extends Moedas implements Tarifacao{
//    @Override
//    public double calcularCompra(Valor orcamento){
//        return orcamento.getValor() * 0.01;
//    }
//    @Override
//    public double calcularVenda(Valor orcamento){
//        return orcamento.getValor() * 0.01;
//    }

    public double calcularCompra(double orcamento){
        return orcamento * 0.01;
    }

    public double calcularVenda(double orcamento){
        return orcamento * 0.01;
    }
    public Ripple(int ID_crypto, String nome, double cotacao, double compra, double venda) {
//        super("Ripple", cotacao);
        super(3, "Ripple", cotacao, compra, venda);
    }

    public Ripple() {
    }
    
}
