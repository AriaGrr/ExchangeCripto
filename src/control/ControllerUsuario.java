
package control;

import model.Investidor;
import model.Pessoa;
import view.Menu;

/**
 *
 * @author marjo
 */
public class ControllerUsuario {
    private Investidor investidor;
    private Menu view;
    
    public ControllerUsuario(Menu view, Investidor investidor) {
        this.view = view;
        this.investidor = investidor;
    }
}
