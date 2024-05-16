/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class CalcularTarifa {
    public void compra(Orcamento o, Tarifacao i){
        double res = i.calcularCompra(o);
        System.out.println(res);
    }
    public void venda(Orcamento o, Tarifacao i){
        double res = i.calcularVenda(o);
        System.out.println(res);
    }
}
