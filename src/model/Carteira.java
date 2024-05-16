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
    private int ID_carteira;
    private double reais, btc, eth, xrd;


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

    public double getXrd() {
        return xrd;
    }

    public void setXrd(double xrd) {
        this.xrd = xrd;
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

//    public int getID_user() {
//        return ID_user;
//    }
//
//    public void setID_user(int ID_user) {
//        this.ID_user = ID_user;
//    }

    public Carteira(int ID_carteira, double reais, double btc, double eth, double xrd, Moedas moedas) {
        
        this.ID_carteira = ID_carteira;
        this.reais = reais;
        this.btc = btc;
        this.eth = eth;
        this.xrd = xrd;
        this.moedas = moedas;
    }




    
}
