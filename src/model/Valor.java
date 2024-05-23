/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa um valor monetário e, opcionalmente, uma senha associada.
 * 
 * Esta classe é utilizada para representar valores monetários e, opcionalmente, 
 * pode armazenar uma senha associada. O uso da senha dependeria do contexto 
 * em que a classe é utilizada.
 *
 * A classe `Valor` possui os seguintes atributos:
 *  * `valor`: Valor monetário (double).
 *  * `senha`: Senha associada ao valor (String, opcional).
 *
 * @author Marjorie Luize Martins Costa
 */
public class Valor {
    private double valor;
    private String senha;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
    * Construtor da classe `Valor` que recebe o valor monetário como parâmetro.
    *
    * @param valor Valor monetário.
    */
    public Valor(double valor) {
        this.valor = valor;
    }

    public Valor() {
    }   

    /**
    * Construtor da classe `Valor` que recebe a senha como parâmetro 
    * (atribui null ao valor monetário).
    *
    * @param senha Senha associada ao valor.
    */
    public Valor(String senha) {
        this.senha = senha;
    }
}
