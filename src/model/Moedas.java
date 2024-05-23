
package model;

/**
 * Representa uma criptomoeda.
 * 
 * Esta classe representa uma criptomoeda, armazenando informações como:
 *  * Identificador único da criptomoeda (ID)
 *  * Nome da criptomoeda
 *  * Cotação atual
 *  * Valor da última compra
 *  * Valor da última venda
 *
 * @author Marjorie Luize Martins Costa
 */
public class Moedas{
    private String nome;
    private int ID_crypto;
    private double cotacao, compra, venda;

    public int getID_crypto() {
        return ID_crypto;
    }

    public void setID_crypto(int ID_crypto) {
        this.ID_crypto = ID_crypto;
    }

    /**
    * Construtor da classe `Moedas` que recebe todos os atributos como parâmetros.
    *
    * @param ID_crypto Identificador único da criptomoeda (ID).
    * @param nome Nome da criptomoeda.
    * @param cotacao Cotação atual da criptomoeda.
    * @param compra Valor da última compra da criptomoeda.
    * @param venda Valor da última venda da criptomoeda.
    */
    public Moedas(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        this.ID_crypto = ID_crypto;
        this.nome = nome;
        this.cotacao = cotacao;
        this.compra = compra;
        this.venda = venda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public Moedas() {
    }

}
