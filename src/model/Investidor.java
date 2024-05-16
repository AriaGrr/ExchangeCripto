
package model;

/**
 *
 * @author marjo
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

//    public int getID_user() {
//        return ID_user;
//    }
//
//    public void setID_user(int ID_user) {
//        this.ID_user = ID_user;
//    }

    public Investidor(int ID_user, String nome, String cpf, String senha, Carteira carteira) {
        super(nome, cpf, senha);
        this.carteira = carteira;
        this.ID_user = ID_user;
    }

    public Investidor(Carteira carteira, int ID_user) {
        this.carteira = carteira;
        this.ID_user = ID_user;
    }

    public Investidor() {
    }
    
}
