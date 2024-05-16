
package control;

import DAO.Conexao;
import DAO.UsuariosDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carteira;
import model.Investidor;
import model.Pessoa;
import view.Login;
import view.Menu;

/**
 *
 * @author marjo
 */
public class ControllerLogin {
    private Login view;
    
    public ControllerLogin(Login view){
        this.view = view;
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
   }
    

