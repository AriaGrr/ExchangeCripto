
package model;

/**
 * Representa a moeda Real.
 * 
 * Esta classe representa a moeda Real, herdando da classe `Moedas` e 
 * implementando a interface `Tarifacao`. Como se trata da moeda base, 
 * as taxas de compra e venda são definidas como zero.
 *
 * @author Marjorie Luize Martins Costa
 */
public class Real extends Moedas implements Tarifacao{

    /**
    * Implementa o método `calcularCompra` da interface `Tarifacao`.
    * Como se trata da moeda base, a taxa de compra é zero.
    *
    * @param orcamento Orçamento disponível para a compra (sempre ignorado).
    * @return Valor da taxa de compra (sempre zero).
    */
    @Override
    public double calcularCompra(double orcamento){
        return orcamento * 0.0;
    }

    /**
    * Implementa o método `calcularVenda` da interface `Tarifacao`.
    * Como se trata da moeda base, a taxa de venda é zero.
    *
    * @param orcamento Orçamento disponível para a venda (sempre ignorado).
    * @return Valor da taxa de venda (sempre zero).
    */
    @Override
    public double calcularVenda(double orcamento){
        return orcamento * 0.0;
    }

    /**
    * Construtor da classe `Real` que recebe todos os atributos como parâmetros.
    *
    * @param ID_crypto Identificador único da moeda Real (ID).
    * @param nome Nome da moeda (Real).
    * @param cotacao Cotação atual do Real (sempre 1).
    * @param compra Valor da última compra do Real (sempre 1).
    * @param venda Valor da última venda do Real (sempre 1).
    */
    public Real(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(4, "Real", cotacao, compra, venda);
    }

    /**
    * Construtor padrão da classe `Real` (sem parâmetros, atributos inicializados com valores padrão).
    */
    public Real() {
    }
    
}
