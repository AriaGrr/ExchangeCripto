
package model;

/**
 * Representa a carteira de investimentos de um usuário.
 * 
 * Esta classe armazena informações sobre a carteira de um usuário, incluindo:
 *  * Identificador da carteira
 *  * Identificador do usuário associado
 *  * Saldo em Reais
 *  * Saldo em Bitcoin (BTC)
 *  * Saldo em Ethereum (ETH)
 *  * Saldo em Ripple (XRP)
 *  * Referência para um objeto `Moedas` (opcional)
 *
 * A classe `Carteira` possui construtores para inicializar a carteira com 
 *  * nenhum parâmetro (carteira vazia)
 *  * todos os atributos como parâmetros
 *  * um objeto `Moedas`, os identificadores e os saldos em Reais, BTC, ETH e XRP
 *
 * @author Marjorie Luize Martins Costa
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
    
    /**
    * Construtor padrão da classe `Carteira` (carteira vazia).
    */
    public Carteira() {
    }

    /**
    * Construtor da classe `Carteira` que recebe todos os atributos como parâmetros.
    *
    * @param ID_carteira Identificador único da carteira no banco de dados.
    * @param ID_user Identificador do usuário associado à carteira.
    * @param reais Saldo em Reais na carteira do investidor.
    * @param btc Saldo em Bitcoin (BTC) na carteira do investidor.
    * @param eth Saldo em Ethereum (ETH) na carteira do investidor.
    * @param xrp Saldo em Ripple (XRP) na carteira do investidor.
    */
    public Carteira(int ID_carteira, int ID_user, double reais, double btc, double eth, double xrp) {
        this.ID_carteira = ID_carteira;
        this.ID_user = ID_user;
        this.reais = reais;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
    }

    /**
    * Construtor da classe `Carteira` que recebe um objeto `Moedas`, os identificadores e os saldos em Reais, BTC, ETH e XRP.
    *
    * @param moedas Objeto `Moedas` associado à carteira (opcional).
    * @param ID_carteira Identificador único da carteira no banco de dados.
    * @param ID_user Identificador do usuário associado à carteira.
    * @param reais Saldo em Reais na carteira do investidor.
    * @param btc Saldo em Bitcoin (BTC) na carteira do investidor.
    * @param eth Saldo em Ethereum (ETH) na carteira do investidor.
    * @param xrp Saldo em Ripple (XRP) na carteira do investidor.
    */
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
