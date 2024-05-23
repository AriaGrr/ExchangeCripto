
package model;

/**
 * Representa um investidor cadastrado no sistema.
 * 
 * Esta classe herda da classe `Pessoa` e representa um investidor cadastrado no sistema. 
 * Um investidor possui os seguintes atributos:
 *  * Carteira associada (pode ser nula se o investidor ainda não a criou)
 *  * Identificador único do usuário (ID)
 * 
 * A classe `Investidor` também possui métodos para:
 *  * Obter e definir a carteira associada
 *  * Obter e definir o identificador único do usuário (ID)
 *  * Construtores para criar instâncias da classe com diferentes combinações de parâmetros
 *
 * @author Marjorie Luize Martins Costa
 */
public class Investidor extends Pessoa{
    Carteira carteira;
    private int ID_user;
    public int getID_user;

    public int getID_user() {
        return ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    /**
    * Construtor da classe `Investidor` que recebe todos os atributos como parâmetros.
    *
    * @param ID_user Identificador único do usuário (ID).
    * @param nome Nome do investidor.
    * @param cpf CPF do investidor.
    * @param senha Senha do investidor.
    * @param carteira Carteira associada ao investidor (pode ser nula).
    */
    public Investidor(int ID_user, String nome, String cpf, String senha, Carteira carteira) {
        super(nome, cpf, senha);
        this.carteira = carteira;
        this.ID_user = ID_user;
    }

    /**
    * Construtor da classe `Investidor` que recebe a carteira e o ID do usuário como parâmetros.
    *
    * @param carteira Carteira associada ao investidor (pode ser nula).
    * @param ID_user Identificador único do usuário (ID).
    */
    public Investidor(Carteira carteira, int ID_user) {
        this.carteira = carteira;
        this.ID_user = ID_user;
    }

    public Investidor() {
    }
    
}
