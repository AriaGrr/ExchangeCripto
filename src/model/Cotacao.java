/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Random;
/**
 * Simula a geração de cotações para moedas virtuais.
 * 
 * Esta classe simula a geração de novas cotações para moedas virtuais (Ethereum, Bitcoin e Ripple).
 * A simulação considera variações aleatórias em porcentagem sobre as cotações atuais.
 *
 * @author Marjorie Luize Martins Costa
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
  
    /**
    * Simula a geração de novas cotações para as moedas Ethereum, Bitcoin e Ripple.
    * 
    * Este método:
    *  1. Gera números aleatórios para variação percentual (entre 0 e 1).
    *  2. Gera resultados aleatórios (0 ou 1) para definir adição (+) ou subtração (-) na variação.
    *  3. Calcula as novas cotações baseadas nas cotações atuais das moedas, variações percentuais e resultados aleatórios.
    *  4. Atualiza as cotações simuladas (`Ceth`, `Cbtc`, `Cxrp`) e os objetos `Ethereum`, `Bitcoin`, `Ripple` (se fornecidos).
    *
    * @param eth Objeto `Ethereum` representando a moeda Ethereum (cotação atual).
    * @param btc Objeto `Bitcoin` representando a moeda Bitcoin (cotação atual).
    * @param xrp Objeto `Ripple` representando a moeda Ripple (cotação atual).
    */
    public void gerarCotacao(Ethereum eth, Bitcoin btc, Ripple xrp){
        double x, y, z;
        x = getNum1()/100;
        y = getNum2()/100;
        z = getNum3()/100;

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
        gerarNum();
        gerarCotacao(eth, btc, xrp);   
    }

}
