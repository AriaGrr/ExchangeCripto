/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.Conexao;
import DAO.CryptoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Bitcoin;
import model.Ethereum;
import model.Moedas;
import model.Ripple;
import view.Consultar;
import view.Menu;

/**
 *
 * @author marjo
 */
public class ControllerCrypto {
    private Consultar view;
    private Ethereum eth;
    private Bitcoin btc;
    private Ripple xrp;
    private Moedas moedas;
    
//    public ControllerCrypto(Consultar view, Moedas moedas) {
//        this.view = view;
//        this.moedas = moedas;
//    } 
    public ControllerCrypto(Consultar view){
        this.view = view;
    }
    
    public void atualizar(){
        
        double b, x, t;
        b = btc.getCotacao();
        x = xrp.getCotacao();
        t = eth.getCotacao();
        double novaBitcoin = b;
        double novaRipple = x;
        double novaEthereum = t;
        Conexao conexao = new Conexao();
        eth = new Ethereum("", novaEthereum);
        btc = new Bitcoin("", novaBitcoin);
        xrp = new Ripple("", novaRipple);
        try{
            Connection conn = conexao.getConnection();
            CryptoDAO dao = new CryptoDAO(conn);
            dao.atualizar(eth);
            dao.atualizar(btc);
            dao.atualizar(xrp);
            JOptionPane.showMessageDialog(view, "Cotações atualizadas!");
            view.getTXTexibir().setText("");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(view, "Falha de conexão");
        }
//    public void atualizar(){
//        double cotacao = 
//        String usuario = view.getLblUsuario().getText();
//        Moedas moedas = new Moedas("", cotacao);
//        Conexao conexao = new Conexao();
//        try{
//            Connection conn = conexao.getConnection();
//            CryptoDAO dao = new CryptoDAO(conn);
//            dao.atualizar(moedas);
//            JOptionPane.showMessageDialog(view, "Moedas atualizadas!");
//        } catch (SQLException e){
//            JOptionPane.showMessageDialog(view, "Falha de conexão");
//        }
//    }
    }
    
//    String cpf = procura.getTEXT6().getText();
//        procura.getEXIBIR().setText("");
//        for(Usuario u: usuarios){
//            if(cpf.equals(u.getCpf())){
//                procura.getEXIBIR().setText(u.printUsuario());
//            }
//        }
}
