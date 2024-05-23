
package model;

/**
 * Representa a criptomoeda Ripple.
 * 
 * Esta classe representa a criptomoeda Ripple, herdando da classe `Moedas` e 
 * implementando a interface `Tarifacao`.
 *
 * A classe `Ripple` possui os seguintes métodos:
 *  * `calcularCompra(double orcamento)`: Calcula a taxa de compra do Ripple (1%).
 *  * `calcularVenda(double orcamento)`: Calcula a taxa de venda do Ripple (1%).
 *
 * @author Marjorie Luize Martins Costa
 */
public class Ripple extends Moedas implements Tarifacao{

    /**
    * Implementa o método `calcularCompra` da interface `Tarifacao`.
    * Calcula a taxa de compra do Ripple (1% do orçamento disponível).
    *
    * @param orcamento Orçamento disponível para a compra.
    * @return Valor da taxa de compra (1% do orçamento).
    */
    @Override
    public double calcularCompra(double orcamento){
        return orcamento * 0.01;
    }

    
    /**
    * Implementa o método `calcularVenda` da interface `Tarifacao`.
    * Calcula a taxa de venda do Ripple (1% do orçamento disponível).
    *
    * @param orcamento Orçamento disponível para a venda.
    * @return Valor da taxa de venda (1% do orçamento).
    */
    @Override
    public double calcularVenda(double orcamento){
        return orcamento * 0.01;
    }
    
    /**
    * Construtor da classe `Ripple` que recebe todos os atributos como parâmetros.
    *
    * @param ID_crypto Identificador único da criptomoeda Ripple (ID).
    * @param nome Nome da criptomoeda (Ripple).
    * @param cotacao Cotação atual do Ripple.
    * @param compra Valor da última compra do Ripple.
    * @param venda Valor da última venda do Ripple.
    */
    public Ripple(int ID_crypto, String nome, double cotacao, double compra, double venda) {
        super(3, "Ripple", cotacao, compra, venda);
    }

    /**
    * Construtor padrão da classe `Ripple` (sem parâmetros, atributos inicializados com valores padrão).
    */
    public Ripple() {
    }
    
}
