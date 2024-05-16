/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import model.Carteira;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Carteira;
import model.Investidor;
import model.Pessoa;

/**
 *
 * @author marjo
 */
public class CarteirasDAO {
    private Connection conn;
    
    public CarteirasDAO(Connection conn){
        this.conn = conn;
    }
    public ResultSet consultar (Investidor investidor) throws SQLException{
        String sql = "select * from carteiras where ID_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, investidor.getID_user);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }   
}
