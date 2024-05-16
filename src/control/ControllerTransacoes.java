/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JOptionPane;
import view.Consultar;
import view.Transacao;

/**
 *
 * @author marjo
 */
public class ControllerTransacoes {
    private Transacao transacao;
    private Consultar consultar;

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Consultar getConsultar() {
        return consultar;
    }

    public void setConsultar(Consultar consultar) {
        this.consultar = consultar;
    }
    
    public void controlTransacao(String tipo){
        String moeda;
        String qtd = transacao.getTXTvalor().getText();
        try {
            float valor_float = Float.parseFloat(qtd); 
            //System.out.println("Valor convertido: " + valor_float);
        } catch (NumberFormatException e) { 
            //System.out.println("Erro: Impossível converter '" + qtd + "' para float.");
            JOptionPane.showMessageDialog(transacao,"Valor invalido");
        }
        if(transacao.getRBbitcoin().isSelected()){
            moeda = "Bitcoin";
        } else if (transacao.getRBripple().isSelected()){
            moeda = "Ripple";
        }else if (transacao.getRBethereum().isSelected()){
            moeda = "Ethereum";
        }
        
    }
}
