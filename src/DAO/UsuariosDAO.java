/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Pessoa;

/**
 *
 * @author marjo
 */
public class UsuariosDAO {
    private Connection conn;
    
    public UsuariosDAO(Connection conn){
        this.conn = conn;
    }
    public ResultSet consultar (Pessoa pessoa) throws SQLException{
        String sql = "select * from usuarios where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.setString(2, pessoa.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
}
