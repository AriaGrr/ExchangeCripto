
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marjo
 */
public class Conexao {
     public Connection getConnection() throws SQLException{
       Connection conexao = DriverManager.getConnection(
        // Endereço do banco de dados, nome do usuario e senha
       "jdbc:postgresql://localhost:5432/banco",
       "postgres", "082627");
       return conexao;
    }   
}
