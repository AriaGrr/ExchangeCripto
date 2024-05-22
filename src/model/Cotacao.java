/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.math.BigDecimal;
import java.util.Random;
/**
 *
 * @author marjo
 */
public class Cotacao {
    double Cbtc, Ceth, Cxrp, num1, num2, num3;

    public double getCbtc() {
        return Cbtc;
    }

    public void setCbtc(double Cbtc) {
        this.Cbtc = Cbtc;
    }

    public double getCeth() {
        return Ceth;
    }

    public void setCeth(double Ceth) {
        this.Ceth = Ceth;
    }

    public double getCxrp() {
        return Cxrp;
    }

    public void setCxrp(double Cxrp) {
        this.Cxrp = Cxrp;
    }
//    double cotacao1, cotacao2, cotacao3, num1, num2, num3;
//    double cotacao, num;
//
//    public double getCotacao() {
//        return cotacao;
//    }
//
//    public void setCotacao(double cotacao) {
//        this.cotacao = cotacao;
//    }
//
//    public double getNum() {
//        return num;
//    }
//
//    public void setNum(double num) {
//        this.num = num;
//    }
//
//    public int getRes() {
//        return res;
//    }
//
//    public void setRes(int res) {
//        this.res = res;
//    }
//    int res;
    int res1, res2, res3;

    public int getRes1() {
        return res1;
    }

    public void setRes1(int res1) {
        this.res1 = res1;
    }

    public int getRes2() {
        return res2;
    }

    public void setRes2(int res2) {
        this.res2 = res2;
    }

    public int getRes3() {
        return res3;
    }

    public void setRes3(int res3) {
        this.res3 = res3;
    }

//    public double getCotacao1() {
//        return cotacao1;
//    }
//
//    public void setCotacao1(double cotacao1) {
//        this.cotacao1 = cotacao1;
//    }
//
//    public double getCotacao2() {
//        return cotacao2;
//    }
//
//    public void setCotacao2(double cotacao2) {
//        this.cotacao2 = cotacao2;
//    }
//
//    public double getCotacao3() {
//        return cotacao3;
//    }
//
//    public void setCotacao3(double cotacao3) {
//        this.cotacao3 = cotacao3;
//    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }
    
//    public double arredondar(double x) {
//    return Math.round(x * 100) / 100.0;
//    }
//    
//    public double arredondar(double x){
//        double numberToRound = x;
//        BigDecimal bigDecimal = new BigDecimal(numberToRound);
//        BigDecimal roundedBigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
//        double roundedNumber = roundedBigDecimal.doubleValue();
//        return roundedNumber;
//        
//          }
    
    public void gerarNum(){
        Random random = new Random();
        double max = 5;
        double min = 0;
        setNum1(random.nextDouble(max - min + 1));
        setNum2(random.nextDouble(max - min + 1));
        setNum3(random.nextDouble(max - min + 1));
    }
    
    public void gerarRes(){
        Random random = new Random();
        setRes1(random.nextInt(2));
        setRes2(random.nextInt(2));
        setRes3(random.nextInt(2));
    }
//    public void gerarRes(){
//        Random random = new Random();
//        int positivo = 1;
//        int negativo = 2;
//        setRes(random.nextInt(positivo - negativo + 1) + negativo);
//    }
//    
//    public void gerarNum(){
//        Random random = new Random();
//        double max = 5;
//        double min = 0;
//        setNum(random.nextDouble(max - min + 1));
//    }
//    
    public void gerarCotacao(Ethereum eth, Bitcoin btc, Ripple xrp){
        double x, y, z;
        x = getNum1()/100;
        y = getNum2()/100;
        z = getNum3()/100;
//        System.out.println(getNum1());
//        System.out.println(getNum2());
//        System.out.println(getNum3());
        double a, b, c;
        a = eth.getCotacao();
        b = btc.getCotacao();
        c = xrp.getCotacao();
        double r, t, u;
        r = a * x;
        t = b * y;
        u = c * z;
        int p, o, i;
        p = getRes1();
        o = getRes2();
        i = getRes3();
        
        if(p == 1){
            setCeth(a + r);
            eth.setCotacao(Ceth);
        } else if(p == 0){
            setCeth(a - r);
            eth.setCotacao(Ceth);
        }
        
        
        if(o == 1){
            setCbtc(b + t);
            btc.setCotacao(Cbtc);
        } else if(o == 0){
            setCbtc(b - t);
            btc.setCotacao(Cbtc);
        }
                
        if(i == 1){
            setCxrp(c + u);
            xrp.setCotacao(Cxrp);
        } else if(i == 0){
            setCxrp(c - u);
            xrp.setCotacao(Cxrp);
        }
    }
    
    public void Cotacao(Ethereum eth, Bitcoin btc, Ripple xrp){
        gerarRes();
//        System.out.println(getRes1());
//        System.out.println(getRes2());
//        System.out.println(getRes3());
        gerarNum();
        gerarCotacao(eth, btc, xrp);
        
    }
    
//    public void gerarCotacao(){
//        
//    }
//    
//    public void Cotacao(Moedas moedas){
//        gerarRes();
//        gerarNum();
//        gerarCotacao();
//        
//    }
}
