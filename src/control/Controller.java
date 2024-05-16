/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.Conexao;
import DAO.UsuariosDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carteira;
import model.Investidor;
import view.Consultar;
import view.Login;
import view.Menu;
import view.Movimentar;
import view.Senha;
import view.Transacao;

/**
 *
 * @author marjo
 */
public class Controller {
    private Login view;
    private Consultar consultar;
    private Menu menu;
    private Movimentar movimentar;
    private Senha senha;
    private Transacao transacao;
    private Investidor investidor;
    
    public Login getView() {
        return view;
    }

    public void setView(Login view) {
        this.view = view;
    }

    public Consultar getConsultar() {
        return consultar;
    }

    public void setConsultar(Consultar consultar) {
        this.consultar = consultar;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Movimentar getMovimentar() {
        return movimentar;
    }

    public void setMovimentar(Movimentar movimentar) {
        this.movimentar = movimentar;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }
    

    
//   public void LoginUsuario(){
//        Pessoa pessoa = new Pessoa (null, view.getTXTcpf().getText(), 
//        view.getTXTsenha().getText());
//        
//        Conexao conexao = new Conexao();
//        try {
//            Connection conn = conexao.getConnection();
//            UsuariosDAO dao = new UsuariosDAO(conn);
//            ResultSet res = dao.consultar(pessoa);
//            if(res.next()){
//                JOptionPane.showMessageDialog(view,"Login feito!");
//                String nome = res.getString("nome");
//                String cpf = res.getString("cpf");
//                String senha = res.getString("senha");
//                Menu viewMenu = new Menu(new Pessoa(nome, cpf, senha));
//                viewMenu.setVisible(true);
//                view.setVisible(false);
//            } else {
//                JOptionPane.showMessageDialog(view,"Login não foi efetuado.");
//            }
//        } catch(SQLException e){
//                JOptionPane.showMessageDialog(view,"Erro de conexão");
//        }
//    }
public void LoginUsuario(){
        
        Carteira carteira = new Carteira();
        Investidor investidor = new Investidor (0, null, view.getTXTcpf().getText(), 
        view.getTXTsenha().getText(), carteira);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            UsuariosDAO dao = new UsuariosDAO(conn);
            ResultSet res = dao.consultar(investidor);
            if(res.next()){
                JOptionPane.showMessageDialog(view,"Login feito!");
                int ID_user = res.getInt("ID_user");
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                Menu viewMenu = new Menu(new Investidor(ID_user, nome, cpf, senha, carteira));
                viewMenu.setVisible(true);
                view.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(view,"Login não foi efetuado.");
            }
        } catch(SQLException e){
                JOptionPane.showMessageDialog(view,"Erro de conexão");
        }
    }

public Controller(Menu menu, Investidor investidor) {
        this.menu = menu;
        this.investidor = investidor;
    }
}
