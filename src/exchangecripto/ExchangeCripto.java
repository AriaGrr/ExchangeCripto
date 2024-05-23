
package exchangecripto;

import view.Login;

/**
 * Ponto de entrada da aplicação ExchangeCripto.
 * 
 * Esta classe é a classe principal da aplicação e seu método `main` é o ponto de partida da execução.
 * 
 * O método `main` cria uma instância da classe `Login` e define sua visibilidade como `true` para exibi-la na tela.
 * A classe `Login` presumivelmente é responsável por iniciar o processo de autenticação do usuário.
 *
 * @author Marjorie Luize Martins Costa
 */
public class ExchangeCripto {

    public static void main(String[] args) {
        // Cria e exibe a janela de login
        new Login().setVisible(true);
    }

}
