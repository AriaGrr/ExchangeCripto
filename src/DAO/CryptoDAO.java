/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Bitcoin;
import model.Ethereum;
import model.Moedas;
import model.Pessoa;
import model.Ripple;

/**
 *
 * @author marjo
 */
public class CryptoDAO {
    private Connection conn;
    
    public CryptoDAO(Connection conn){
        this.conn = conn;
    }
//    public ResultSet consultar (Moedas moedas) throws SQLException{
//        String sql = "select * from crypto where nome = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, moedas.getNome());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
     public ResultSet consultarBitcoin (Bitcoin bitcoin) throws SQLException{
        String sql = "select * from crypto where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, bitcoin.getNome());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    public ResultSet consultarRipple (Ripple ripple) throws SQLException{
        String sql = "select * from crypto where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, ripple.getNome());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    public ResultSet consultarEthereum (Ethereum ethereum) throws SQLException{
        String sql = "select * from crypto where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, ethereum.getNome());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
//    public ResultSet consultar (Moedas moedas) throws SQLException{
//        String sql = "select * from crypto";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
    public void atualizar (Moedas moedas) throws SQLException{
        String sql = "update crypto set cotacao = ? where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, moedas.getCotacao());
        statement.setString(2, moedas.getNome());
        statement.execute();
        conn.close();
    }
    
    
}
