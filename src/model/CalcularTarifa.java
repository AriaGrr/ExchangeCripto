
package model;

/**
 * Realiza o cálculo de tarifas para compra e venda de ativos que implementam a interface `Tarifacao`.
 * 
 * Esta classe fornece métodos para calcular as taxas associadas à compra e venda de ativos financeiros. 
 * Ela espera que o ativo implementado possua métodos para calcular as respectivas taxas (`calcularCompra` e `calcularVenda`).
 *
 * @author Marjorie Luize Martins Costa
 */
public class CalcularTarifa {
    /**
    * Calcula a taxa para a compra de um ativo que implementa a interface `Tarifacao`.
    * 
    * Este método recebe o valor do orçamento disponível para a compra (`o`) e uma referência para um objeto que implementa a interface `Tarifacao` (`i`).
    * Através do objeto `i`, o método delega o cálculo da taxa específica para o ativo implementado.
    * 
    * @param o Valor do orçamento disponível para a compra.
    * @param i Objeto que implementa a interface `Tarifacao` representando o ativo financeiro.
    */
    public void compra(double o, Tarifacao i){
        double res = i.calcularCompra(o);
        System.out.println(res);
    }
    /**
    * Calcula a taxa para a venda de um ativo que implementa a interface `Tarifacao`.
    * 
    * Este método recebe o valor do ativo a ser vendido (`o`) e uma referência para um objeto que implementa a interface `Tarifacao` (`i`).
    * Através do objeto `i`, o método delega o cálculo da taxa específica para o ativo implementado.
    * 
    * @param o Valor do ativo a ser vendido.
    * @param i Objeto que implementa a interface `Tarifacao` representando o ativo financeiro.
    */
    public void venda(double o, Tarifacao i){
        double res = i.calcularVenda(o);
        System.out.println(res);
    }
}
