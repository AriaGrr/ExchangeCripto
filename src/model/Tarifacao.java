/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public interface Tarifacao {
    double calcularCompra(Valor valor);
    double calcularVenda(Valor valor);
}
