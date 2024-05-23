/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 * Define a interface `Tarifacao`.
 * 
 * Esta interface define o contrato para classes que calculam taxas de 
 * compra e venda. Classes que implementam esta interface devem fornecer 
 * implementações para os métodos `calcularCompra` e `calcularVenda`.
 *
 * @author Marjorie Luize Martins Costa
 */
public interface Tarifacao {
    /**
    * Calcula a taxa de compra com base no orçamento disponível.
    *
    * @param orcamento Orçamento disponível para a compra.
    * @return Valor da taxa de compra.
    */
    double calcularCompra(double orcamento);
    /**
    * Calcula a taxa de venda com base no orçamento disponível.
    *
    * @param orcamento Orçamento disponível para a venda.
    * @return Valor da taxa de venda.
    */
    double calcularVenda(double orcamento);
}
