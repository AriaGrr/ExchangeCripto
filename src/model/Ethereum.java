
package model;

/**
 * Representa a criptomoeda Ethereum.
 * 
 * Esta classe herda da classe `Moedas` e implementa a interface `Tarifacao`.
 * 
 * A classe `Ethereum` define os atributos e métodos específicos da criptomoeda Ethereum, 
 * incluindo o cálculo de taxas para compra e venda.
 *
 * @author Marjorie Luize Martins Costa
 */
public class Ethereum extends Moedas implements Tarifacao{

    /**
    * Calcula a taxa para a compra de Ethereum.
    * 
    * Este método calcula uma taxa de 1% sobre o valor do orçamento disponível para compra.
    *
    * @param orcamento Valor do orçamento disponível para compra de Ethereum.
    * @return Valor da taxa de compra de Ethereum.
    */
   @Override
    public double calcularCompra(double orcamento){
        return orcamento * 0.01;
    }

    /**
    * Calcula a taxa para a venda de Ethereum.
    * 
    * Este método calcula uma taxa de 2% sobre o valor do Ethereum a ser vendido.
    *
    * @param orcamento Valor do Ethereum a ser vendido.
    * @return Valor da taxa de venda de Ethereum.
    */
    @Override
    public double calcularVenda(double orcamento){
        return orcamento * 0.02;
    }

    /**
    * Construtor da classe `Ethereum` que recebe todos os atributos como parâmetros.
    *
    * @param ID_crypto Código identificador da criptomoeda Ethereum no banco de dados.
    * @param nome Nome da criptomoeda (Ethereum).
    * @param cotacao Cotação atual do Ethereum.
    * @param compra Valor da última compra de Ethereum.
    * @param venda Valor da última venda de Ethereum.
    */
    public Ethereum(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(2, "Ethereum", cotacao, compra, venda);
    }

    public Ethereum() {
    }
    
}
