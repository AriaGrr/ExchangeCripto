/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 * Representa um registro de extrato na carteira do usuário.
 * 
 * Esta classe representa um registro de movimentação financeira na carteira de um usuário. 
 * Cada registro (extrato) guarda informações como:
 *  * Identificador único da transação
 *  * Identificador da carteira associada
 *  * Identificador da criptomoeda envolvida (se aplicável)
 *  * Tipo de movimentação (compra, venda, etc.)
 *  * Valor da transação
 *  * Taxa cobrada
 *  * Valor em Reais (se aplicável)
 *  * Quantidade de Bitcoin (BTC)
 *  * Quantidade de Ethereum (ETH)
 *  * Quantidade de Ripple (XRP)
 *  * Data e hora da transação
 *
 * @author Marjorie Luize Martins Costa
 */
public class Extrato {
    int ID_transacao, ID_carteira, ID_crypto;
    String tipo;
    double valor, taxa, reais, btc, eth, xrp;
    Timestamp timestamp;

    public Extrato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getID_transacao() {
        return ID_transacao;
    }

    public void setID_transacao(int ID_transacao) {
        this.ID_transacao = ID_transacao;
    }

    public int getID_carteira() {
        return ID_carteira;
    }

    public void setID_carteira(int ID_carteira) {
        this.ID_carteira = ID_carteira;
    }

    public int getID_crypto() {
        return ID_crypto;
    }

    public void setID_crypto(int ID_crypto) {
        this.ID_crypto = ID_crypto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }

    public double getBtc() {
        return btc;
    }

    public void setBtc(double btc) {
        this.btc = btc;
    }

    public double getEth() {
        return eth;
    }

    public void setEth(double eth) {
        this.eth = eth;
    }

    public double getXrp() {
        return xrp;
    }

    public void setXrp(double xrp) {
        this.xrp = xrp;
    }

    public Timestamp getData() {
        return timestamp;
    }

    public void setData(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * Construtor da classe `Extrato` que recebe todos os atributos como parâmetros.
    *
    * @param ID_transacao Identificador único da transação.
    * @param ID_carteira Identificador da carteira associada à transação.
    * @param ID_crypto Identificador da criptomoeda envolvida na transação (se aplicável).
    * @param tipo Tipo de movimentação financeira (compra, venda, etc.).
    * @param valor Valor da transação.
    * @param taxa Taxa cobrada pela transação.
    * @param reais Valor da transação em Reais (se aplicável).
    * @param btc Quantidade de Bitcoin (BTC) envolvida na transação.
    * @param eth Quantidade de Ethereum (ETH) envolvida na transação.
    * @param xrp Quantidade de Ripple (XRP) envolvida na transação.
    * @param timestamp Data e hora da transação.
    */
    public Extrato(int ID_transacao, int ID_carteira, int ID_crypto, String tipo, double valor, double taxa, double reais, double btc, double eth, double xrp, Timestamp timestamp) {
        this.ID_transacao = ID_transacao;
        this.ID_carteira = ID_carteira;
        this.ID_crypto = ID_crypto;
        this.tipo = tipo;
        this.valor = valor;
        this.taxa = taxa;
        this.reais = reais;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
        this.timestamp = timestamp;
    }

    /**
    * Construtor da classe `Extrato` que recebe alguns atributos como parâmetros (sem ID da transação e ID da criptomoeda).
    *
    * @param ID_carteira Identificador da carteira associada à transação.
    * @param tipo Tipo de movimentação financeira (compra, venda, etc.).
    * @param valor Valor da transação.
    * @param taxa Taxa cobrada pela transação.
    * @param reais Valor da transação em Reais (se aplicável).
    * @param btc Quantidade de Bitcoin (BTC) envolvida na transação.
    * @param eth Quantidade de Ethereum (ETH) envolvida na transação.
    * @param xrp Quantidade de Ripple (XRP) envolvida na transação.
    * @param timestamp Data e hora da transação.
    */
    public Extrato(int ID_carteira, int ID_crypto, String tipo, double valor, double taxa, double reais, double btc, double eth, double xrp, Timestamp timestamp) {
        this.ID_carteira = ID_carteira;
        this.ID_crypto = ID_crypto;
        this.tipo = tipo;
        this.valor = valor;
        this.taxa = taxa;
        this.reais = reais;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
        this.timestamp = timestamp;
    }

    /**
    * Gera uma representação textual do extrato.
    *
    * @return String representando o extrato com informações formatadas.
    */
    public String printExtrato() {
    return "Tipo: " + tipo + 
         " ; Valor: " + formatDouble(valor) + 
         " ; Taxa: " + formatDouble(taxa) + 
         " ; Reais: " + formatDouble(reais) + 
         "\nData: " + timestamp + 
         " ; BTC: " + formatDouble(btc) + 
         " ; ETH: " + formatDouble(eth) + 
         " ; XRP: " + formatDouble(xrp) + "\n";
    }

    /**
    * Formata um valor double para duas casas decimais.
    *
    * @param value Valor double a ser formatado.
    * @return String representando o valor formatado com duas casas decimais.
    */
    public String formatDouble(double value) {
      return String.format("%.2f", value);
    }
}
