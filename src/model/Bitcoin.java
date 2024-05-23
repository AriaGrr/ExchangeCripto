
package model;

/**
 * Representa a criptomoeda Bitcoin.
 * 
 * Esta classe herda da classe `Moedas` e implementa a interface `Tarifacao`.
 * 
 * A classe `Bitcoin` define os atributos e métodos específicos da criptomoeda Bitcoin, 
 * incluindo o cálculo de taxas para compra e venda.
 *
 * @author Marjorie Luize Martins Costa
 */
public class Bitcoin extends Moedas implements Tarifacao{
    /**
    * Calcula a taxa para a compra de Bitcoin.
    * 
    * Este método calcula uma taxa de 2% sobre o valor do orçamento disponível para compra.
    *
    * @param orcamento Valor do orçamento disponível para compra de Bitcoin.
    * @return Valor da taxa de compra de Bitcoin.
    */
    @Override
    public double calcularCompra(double orcamento){
        return orcamento * 0.02;
    }
    /**
    * Calcula a taxa para a venda de Bitcoin.
    * 
    * Este método calcula uma taxa de 3% sobre o valor do Bitcoin a ser vendido.
    *
    * @param orcamento Valor do Bitcoin a ser vendido.
    * @return Valor da taxa de venda de Bitcoin.
    */
    @Override
    public double calcularVenda(double orcamento){
        return orcamento * 0.03;
    }

    /**
    * Construtor da classe `Bitcoin` que recebe todos os atributos como parâmetros.
    *
    * @param ID_crypto Código identificador da criptomoeda Bitcoin no banco de dados.
    * @param nome Nome da criptomoeda (Bitcoin).
    * @param cotacao Cotação atual do Bitcoin.
    * @param compra Valor da última compra de Bitcoin.
    * @param venda Valor da última venda de Bitcoin.
    */
    public Bitcoin(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(1, "Bitcoin", cotacao, compra, venda);
    }

    /**
    * Construtor padrão da classe `Bitcoin` sem parâmetros.
    */
    public Bitcoin() {
    }
    
}
