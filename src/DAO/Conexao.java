
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta classe provê uma conexão com o banco de dados.
 * 
 * @author Marjorie Luize Martins Costa
 */
public class Conexao {
    /**
     * Obtém uma conexão com o banco de dados.
     * 
     * @return Um objeto `Connection` representando a conexão estabelecida.
     * @throws SQLException Se ocorrer um erro ao tentar conectar com o banco de dados.
     */
     public Connection getConnection() throws SQLException{
       Connection conexao = DriverManager.getConnection(
        // Endereço do banco de dados, nome do usuario e senha
       "jdbc:postgresql://localhost:5432/banco",
       "postgres", "082627");
       return conexao;
    }   
}
