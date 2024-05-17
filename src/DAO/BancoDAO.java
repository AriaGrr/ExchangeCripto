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
import model.Investidor;
import model.Moedas;
import model.Pessoa;
import model.Ripple;

/**
 *
 * @author marjo
 */
public class BancoDAO {
    private Connection conn;
    
    public BancoDAO(Connection conn){
        this.conn = conn;
    }
//    public ResultSet consultarPessoa (Pessoa pessoa) throws SQLException{
//        String sql = "select * from usuarios where cpf = ? and senha = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, pessoa.getCpf());
//        statement.setString(2, pessoa.getSenha());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
    public ResultSet consultarInvestidor (Investidor investidor) throws SQLException{
        String sql = "select * from carteiras where ID_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, investidor.getID_user);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    } 
   
//    public ResultSet consultarBitcoin (Bitcoin bitcoin) throws SQLException{
//        String sql = "select * from crypto where nome = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, bitcoin.getNome());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
//    public ResultSet consultarRipple (Ripple ripple) throws SQLException{
//        String sql = "select * from crypto where nome = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, ripple.getNome());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
//    public ResultSet consultarEthereum (Ethereum ethereum) throws SQLException{
//        String sql = "select * from crypto where nome = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, ethereum.getNome());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
    
    public ResultSet consultar (Moedas moedas) throws SQLException{
        String sql = "select * from crypto where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, moedas.getNome());
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

    public ResultSet consultarTransacoes () throws SQLException{
        String sql = "select * from transacoes where ID_carteira = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
//   public ResultSet adicionarTransacao (Transacao transacao) throws SQLException{
//        String sql = "insert into transacoes ("", ID_carteira, tipo, valor, data, ID_crypto, taxa, reais, btc, eth, xrp) values ('" +
//                banco.get() + "', '" +
//                banco.get() + "', '" +
//                banco.get() + "')";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        conn.close();
//    }

}
