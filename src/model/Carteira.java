/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marjo
 */
public class Carteira {
    Moedas moedas;
    private int ID_carteira, ID_user;
    private double reais, btc, eth, xrp;

    public int getID_user() {
        return ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
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

    public int getID_carteira() {
        return ID_carteira;
    }

    public void setID_carteira(int ID_carteira) {
        this.ID_carteira = ID_carteira;
    }

    public Moedas getMoedas() {
        return moedas;
    }

    public void setMoedas(Moedas moedas) {
        this.moedas = moedas;
    }
    

    public Carteira() {
    }

    public Carteira(int ID_carteira, int ID_user, double reais, double btc, double eth, double xrp) {
        this.ID_carteira = ID_carteira;
        this.ID_user = ID_user;
        this.reais = reais;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
    }

    public Carteira(Moedas moedas, int ID_carteira, int ID_user, double reais, double btc, double eth, double xrp) {
        this.moedas = moedas;
        this.ID_carteira = ID_carteira;
        this.ID_user = ID_user;
        this.reais = reais;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
    }

}
