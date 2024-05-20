/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import model.Bitcoin;
import model.Carteira;
import model.Ethereum;
import model.Extrato;
import model.Investidor;
import model.Moedas;
import model.Pessoa;
import model.Ripple;
import model.Valor;
import view.Transacao;

/**
 *
 * @author marjo
 */
public class BancoDAO {
    private Connection conn;
    
    public BancoDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultarInvestidor(Investidor investidor) throws SQLException{
        String sql = "select * from usuarios where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.setString(2, investidor.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    } 
    
//    public ResultSet consultarCarteira(Investidor investidor) throws SQLException{
//        String sql = "select * from carteiras where ID_user = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setInt(1, investidor.getID_user());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
//   
    public ResultSet consultarCarteira(Carteira carteira) throws SQLException{
        String sql = "select * from carteiras where id_carteira = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, carteira.getID_user());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
   
    public ResultSet consultarCotacao(Moedas moedas) throws SQLException{
        String sql = "select * from crypto where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, moedas.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
//    public ResultSet atualizarCotacao(Moedas moedas) throws SQLException{
//        String sql = "update crypto set cotacao = ? where id_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setDouble(1, moedas.getCotacao());
//        statement.setInt(2, moedas.getID_crypto());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        conn.close();
//        return resultado;
//    }
    public ResultSet cotacaoBitcoin(Bitcoin bitcoin) throws SQLException{
        String sql = "update crypto set cotacao = ? where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, bitcoin.getCotacao());
        statement.setInt(2, bitcoin.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        
        return resultado;
    }
    public ResultSet cotacaoRipple(Ripple ripple) throws SQLException{
        String sql = "update crypto set cotacao = ? where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, ripple.getCotacao());
        statement.setInt(2, ripple.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        
        return resultado;
    }
    public ResultSet cotacaoEthereum(Ethereum ethereum) throws SQLException{
        String sql = "update crypto set cotacao = ? where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, ethereum.getCotacao());
        statement.setInt(2, ethereum.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        
        return resultado;
    }
//    public ResultSet consultarCotacao(Ethereum eth) throws SQLException{
//        String sql = "select * from crypto where ID_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setInt(1, eth.getID_crypto());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
//    
//    public ResultSet consultarCotacao(Bitcoin btc) throws SQLException{
//        String sql = "select * from crypto where ID_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setInt(1, btc.getID_crypto());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
//    
//    public ResultSet consultarCotacao(Ripple xrd) throws SQLException{
//        String sql = "select * from crypto where ID_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setInt(1, xrd.getID_crypto());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
//    
//    public void atualizarCotacao(Ethereum eth) throws SQLException{
//        String sql = "update crypto set cotacao = ? where ID_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setDouble(1, eth.getCotacao());
//        statement.setInt(2, eth.getID_crypto());
//        statement.execute();
//        conn.close();
//    }
//    public void atualizarCotacao(Ripple xrd) throws SQLException{
//        String sql = "update crypto set cotacao = ? where ID_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setDouble(1, xrd.getCotacao());
//        statement.setInt(2, xrd.getID_crypto());
//        statement.execute();
//        conn.close();
//    }
//    public void atualizarCotacao(Bitcoin btc) throws SQLException{
//        String sql = "update crypto set cotacao = ? where ID_crypto = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setDouble(1, btc.getCotacao());
//        statement.setInt(2, btc.getID_crypto());
//        statement.execute();
//        conn.close();
//    }
//        public void atualizarCarteira(Carteira carteira, int i) throws SQLException{
//        String sql = "update carteiras set ? = ? where id_user = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        if (i == 1){
//            statement.setString(1, "reais");
//            statement.setDouble(2, carteira.getReais());
//        } else if (i == 2){
//            statement.setString(1, "btc");
//            statement.setDouble(2, carteira.getBtc());
//        }else if (i == 3){
//            statement.setString(1, "eth");
//            statement.setDouble(2, carteira.getEth());
//        }else if (i == 4){
//            statement.setString(1, "xrd");
//            statement.setDouble(2, carteira.getXrd());
//        }
//        statement.setInt(3, carteira.getID_user());
//        statement.execute();
//        conn.close();
//    }
    public void atualizarReais(Carteira carteira) throws SQLException{
        String sql = "update carteiras set reais = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
//        if (i == 1){
//            statement.setString(1, "reais");
//            statement.setDouble(2, carteira.getReais());
//        } else if (i == 2){
//            statement.setString(1, "btc");
//            statement.setDouble(2, carteira.getBtc());
//        }else if (i == 3){
//            statement.setString(1, "eth");
//            statement.setDouble(2, carteira.getEth());
//        }else if (i == 4){
//            statement.setString(1, "xrd");
//            statement.setDouble(2, carteira.getXrd());
//        }
        statement.setDouble(1, carteira.getReais());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
        conn.close();
    }
    public void atualizarBitcoin(Carteira carteira) throws SQLException{
        String sql = "update carteiras set btc = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getBtc());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
//        conn.close();
    }   
    
    public void atualizarEthereum(Carteira carteira) throws SQLException{
        String sql = "update carteiras set eth = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getEth());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
//        conn.close();
    } 
    
    public void atualizarRipple(Carteira carteira) throws SQLException{
        String sql = "update carteiras set xrp = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getXrp());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
//        conn.close();
    } 
    
//    public void inserirTransacao(Extrato extrato)throws SQLException{
////        String sql = "insert into transacoes (id_carteira, tipo, valor, data, id_crypto, taxa, reais, btc, eth, xrp) values ('" +
////                extrato.getID_carteira() + "', '" +
////                extrato.getTipo() + "', '" +
////                extrato.getValor() + "', '" +
////                extrato.getData() + "', '" +
////                extrato.getID_crypto() + "', '" +
////                extrato.getTaxa() + "', '" +
////                extrato.getReais() + "', '" +
////                extrato.getBtc() + "', '" +
////                extrato.getEth() + "', '" +
////                extrato.getXrp() + "', '";
//        String sql = "insert into transacoes (id_carteira, tipo, valor, data, id_crypto, taxa, reais, btc, eth, xrp) values ('" +
//                extrato.getID_carteira() + "', '" +
//                extrato.getTipo() + "', '" +
//                extrato.getValor() + "', '" +
////                java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(zonedDateTime.toInstant());
////                String formattedTimezone = zonedDateTime.getZone().getId();
//                extrato.getData() + "', '" +
//                extrato.getID_crypto() + "', '" +
//                extrato.getTaxa() + "', '" +
//                extrato.getReais() + "', '" +
//                extrato.getBtc() + "', '" +
//                extrato.getEth() + "', '" +
//                extrato.getXrp() + "')";
////        String sql = "insert into transacoes id_carteira = ?, tipo = ?, valor = ?, id_crypto = ?, taxa = ?, reais = ?, btc = ?, eth = ?, xrp = ?"; 
//        PreparedStatement statement = conn.prepareStatement(sql);
////        statement.setInt(1, extrato.getID_carteira());
////        statement.setString(2, extrato.getTipo());
////        statement.setDouble(3, extrato.getValor());
//////        statement.setZonedDateTime(4, extrato.getData());
//////        ZonedDateTime zonedDateTime = extrato.getData();
//////        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(zonedDateTime.toInstant());
//////        statement.setTimestamp(4, timestamp);
////        statement.setInt(4, extrato.getID_crypto());
////        statement.setDouble(5, extrato.getTaxa());
////        statement.setDouble(6, extrato.getReais());
////        statement.setDouble(7, extrato.getBtc());
////        statement.setDouble(8, extrato.getEth());
////        statement.setDouble(9, extrato.getXrp());
//        statement.execute();
////        conn.close();
//    }
//    
////    public ResultSet consultarTransacoes(Investidor investidor) throws SQLException{
////        String sql = "select * from transacoes where ID_user = ?";
////        PreparedStatement statement = conn.prepareStatement(sql);
////        statement.setInt(1, investidor.getID_user());
////        statement.execute();
////        ResultSet resultado = statement.getResultSet();
////        return resultado;
////    }
    public void inserirTransacao(Extrato extrato)throws SQLException{
        String sql = "insert into transacoes (id_carteira, tipo, valor, data, id_crypto, taxa, reais, btc, eth, xrp) values ('" +
                extrato.getID_carteira() + "', '" +
                extrato.getTipo() + "', '" +
                extrato.getValor() + "', '" +
                extrato.getData() + "', '" +
                extrato.getID_crypto() + "', '" +
                extrato.getTaxa() + "', '" +
                extrato.getReais() + "', '" +
                extrato.getBtc() + "', '" +
                extrato.getEth() + "', '" +
                extrato.getXrp() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();

    }
    
//    public ResultSet consultarTransacoes(Investidor investidor) throws SQLException{
//        String sql = "select * from transacoes where ID_user = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setInt(1, investidor.getID_user());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;
//    }
    public ArrayList<Extrato> consultarTransacoes(Investidor investidor) throws SQLException {
        String sql = "select * from transacoes where id_carteira = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, investidor.getCarteira().getID_carteira());
        ResultSet resultSet = statement.executeQuery();

        ArrayList<Extrato> extratos = new ArrayList<>();
        while (resultSet.next()) {
          
          int ID_carteira = resultSet.getInt("id_carteira"); 
          //int ID_transacao = resultSet.getInt("id_transacao");
          int ID_crypto = resultSet.getInt("id_crypto");
          String tipo = resultSet.getString("tipo"); 
          double val = resultSet.getDouble("valor"); 
          Timestamp timestamp = resultSet.getTimestamp("data"); 
          double taxa = resultSet.getDouble("taxa");
          double bt = resultSet.getDouble("btc");
          double reais = resultSet.getDouble("reais");
          double et = resultSet.getDouble("eth");
          double xr = resultSet.getDouble("xrp");
          
          Extrato extrato = new Extrato( ID_carteira, ID_crypto, tipo, val, taxa, reais, bt, et, xr, timestamp);
          extratos.add(extrato);
        }

        resultSet.close(); // Fechar o ResultSet
        return extratos;
      }
}