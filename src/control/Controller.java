/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.BancoDAO;
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

    public void LoginUsuario(){
        
        Carteira carteira = new Carteira();
        Investidor investidor = new Investidor (0, null, view.getTXTcpf().getText(), 
        view.getTXTsenha().getText(), carteira);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultarInvestidor(investidor);
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

//public Controller(Menu menu, Investidor investidor) {
//        this.menu = menu;
//        this.investidor = investidor;
//    }
    public Controller(Login view){
        this.view = view;
    }
    
    public Controller (Investidor investidor){
        this.investidor = investidor;
    }
//    public Controller(Menu menu, Investidor investidor) {
//        this.menu = menu;
//        this.investidor = investidor;
//    }
//    public Controller(Movimentar movimentar, Investidor investidor) {
//        this.movimentar = movimentar;
//        this.investidor = investidor;
//    }
    public void atualizarMoedas(){
    
}
    
    public void adicionarTransacao(){
        String tipo = "a";
    }

    public void adicionarMovimentacao(){
        //String tipo = movimentar.getLBLtipo().getText();
        //double valor = movimentar.getTXTvalor().getText();
        
    }
    
//        public void salvarAluno(){
//        String nome = view.getTxtEntradaNome().getText();
//        String usuario = view.getTxtEntradaUsuario().getText();
//        String senha = view.getTxtEntradaSenha().getText();
//        Aluno aluno = new Aluno (nome, usuario, senha);
//        Conexao conexao = new Conexao();
//        try{
//            Connection conn = conexao.getConnection();
//            AlunoDAO dao = new AlunoDAO(conn);
//            dao.inserir(aluno);
//            JOptionPane.showMessageDialog(view, "Usuario cadastrado!");
//        } catch (SQLException e){
//            JOptionPane.showMessageDialog(view, "Usuario não cadastrado.");
//        }
//    }
    
    public void conferirSenha(Investidor investidor){
        
        try{
//            
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(senha, "Senha incorreta.");
//        }
    }
//     public void LoginAluno(){
//        Aluno aluno = new Aluno (null, view.getEntradaUsuario().getText(), 
//        view.getEntradaSenha().getText());
//        
//        Conexao conexao = new Conexao();
//        try {
//            Connection conn = conexao.getConnection();
//            AlunoDAO dao = new AlunoDAO(conn);
//            ResultSet res = dao.consultar(aluno);
//            if(res.next()){
//                JOptionPane.showMessageDialog(view,"Login feito!");
//                String nome = res.getString("nome");
//                String usuario = res.getString("usuario");
//                String senha = res.getString("senha");
//                UsuarioFrame viewUsuario = new UsuarioFrame(new Aluno(nome, usuario, senha));
////                UsuarioFrame viewUsuario = new UsuarioFrame();
//                viewUsuario.setVisible(true);
//                view.setVisible(false);
//            } else {
//                JOptionPane.showMessageDialog(view,"Login não foi efetuado.");
//            }
//        } catch(SQLException e){
//                JOptionPane.showMessageDialog(view,"Erro de conexão");
//        }
}
