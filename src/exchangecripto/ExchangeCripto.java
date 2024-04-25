/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exchangecripto;

import javax.swing.UIManager;
import view.Loguin;

/**
 *
 * @author marjo
 */
public class ExchangeCripto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { 
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel("Flatlaf Cupertino Dark");
        } catch(Exception ignored){}

        new Loguin().setVisible(true);
    }

}
