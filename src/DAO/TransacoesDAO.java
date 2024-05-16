/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Moedas;

/**
 *
 * @author marjo
 */
public class TransacoesDAO {
    private Connection conn;
    
    public TransacoesDAO(Connection conn){
        this.conn = conn;
    }
//    public ResultSet consultar () throws SQLException{
//        String sql = "select * from transacoes where ID_carteira = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
}
