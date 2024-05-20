/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

/**
 *
 * @author marjo
 */
public class Extrato {
    int ID_transacao, ID_carteira, ID_crypto;
    String tipo;
    double valor, taxa, reais, btc, eth, xrp;
    Timestamp timestamp;

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
    public String printExtrato (){
        return "Tipo: " + tipo + "; Valor: " + valor + "; Taxa: " + taxa + "; Reais: " + reais +";\n Data: " + timestamp + "; BTC: " + btc + "; ETH: " + eth +"; XRP: " + xrp + "\n";
    }
}
