
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.Bitcoin;
import model.Carteira;
import model.Ethereum;
import model.Extrato;
import model.Investidor;
import model.Moedas;
import model.Ripple;

/**
 * Classe DAO (Data Access Object) para interagir com as tabelas do banco de dados relacionadas a contas de usuários, carteiras e criptomoedas.
 * 
 * @author Marjorie Luize Martins Costa
 */

public class BancoDAO {
    private Connection conn;
    
    /**
     * Construtor que estabelece uma conexão com o banco de dados.
     * 
     * @param conn Objeto de conexão com o banco de dados.
     */
    public BancoDAO(Connection conn){
        this.conn = conn;
    }
    
    /**
     * Consulta o banco de dados para validar as credenciais do investidor (CPF e senha).
     * 
     * @param investidor Objeto `Investidor` contendo o CPF e a senha para validação.
     * @return Um objeto `ResultSet` contendo dados recuperados da tabela 'usuarios' se as credenciais forem válidas, caso contrário null.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public ResultSet consultarInvestidor(Investidor investidor) throws SQLException{
        String sql = "select * from usuarios where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.setString(2, investidor.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    } 
      
    /**
     * Recupera dados da tabela 'carteiras' com base no ID do investidor fornecido.
     * 
     * @param carteira Objeto `Carteira` contendo o ID do investidor.
     * @return Um objeto `ResultSet` contendo dados recuperados da tabela 'carteiras', caso contrário null.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public ResultSet consultarCarteira(Carteira carteira) throws SQLException{
        String sql = "select * from carteiras where id_carteira = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, carteira.getID_user());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
   
    /**
     * Recupera dados da tabela 'crypto' com base no ID da criptomoeda fornecido.
     * 
     * @param moedas Objeto `Moedas` (provavelmente uma subclasse representando uma criptomoeda específica) contendo o ID.
     * @return Um objeto `ResultSet` contendo dados recuperados da tabela 'crypto', caso contrário null.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public ResultSet consultarCotacao(Moedas moedas) throws SQLException{
        String sql = "select * from crypto where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, moedas.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    /**
     * Atualiza o campo 'cotacao' (preço) na tabela 'crypto' para Bitcoin.
     * 
     * @param bitcoin Objeto `Bitcoin` contendo o novo valor do preço.
     * @return Um objeto `ResultSet`, embora provavelmente vazio neste cenário de atualização. Pode ser nulo dependendo da implementação do driver JDBC.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public ResultSet cotacaoBitcoin(Bitcoin bitcoin) throws SQLException{
        String sql = "update crypto set cotacao = ? where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, bitcoin.getCotacao());
        statement.setInt(2, bitcoin.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    /**
     * Atualiza o campo 'cotacao' (preço) na tabela 'crypto' para Ripple.
     * 
     * @param ripple Objeto `Ripple` contendo o novo valor do preço.
     * @return Um objeto `ResultSet`, embora provavelmente vazio neste cenário de atualização. Pode ser nulo dependendo da implementação do driver JDBC.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public ResultSet cotacaoRipple(Ripple ripple) throws SQLException{
        String sql = "update crypto set cotacao = ? where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, ripple.getCotacao());
        statement.setInt(2, ripple.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet(); 
        return resultado;
    }
    
    /**
     * Atualiza o campo 'cotacao' (preço) na tabela 'crypto' para Ethereum.
     * 
     * @param ethereum Objeto `Ethereum` contendo o novo valor do preço.
     * @return Um objeto `ResultSet`, embora provavelmente vazio neste cenário de atualização. Pode ser nulo dependendo da implementação do driver JDBC.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public ResultSet cotacaoEthereum(Ethereum ethereum) throws SQLException{
        String sql = "update crypto set cotacao = ? where id_crypto = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, ethereum.getCotacao());
        statement.setInt(2, ethereum.getID_crypto());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    
    /**
     * Atualiza o campo 'reais' na tabela 'carteiras' para a carteira de um investidor específico.
     * 
     * @param carteira Objeto `Carteira` contendo o ID do investidor e o novo valor 'reais'.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public void atualizarReais(Carteira carteira) throws SQLException{
        String sql = "update carteiras set reais = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getReais());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
        conn.close();
    }
    
    /**
     * Atualiza o campo 'btc' (quantidade de Bitcoin) na tabela 'carteiras' para a carteira de um investidor específico.
     * 
     * @param carteira Objeto `Carteira` contendo o ID do investidor e o novo valor 'btc'.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public void atualizarBitcoin(Carteira carteira) throws SQLException{
        String sql = "update carteiras set btc = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getBtc());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
    }   
    
    /**
     * Atualiza o campo 'eth' (quantidade de Ethereum) na tabela 'carteiras' para a carteira de um investidor específico.
     * 
     * @param carteira Objeto `Carteira` contendo o ID do investidor e o novo valor 'eth'.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public void atualizarEthereum(Carteira carteira) throws SQLException{
        String sql = "update carteiras set eth = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getEth());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
    } 
    
    /**
     * Atualiza o campo 'xrp' (quantidade de Ripple) na tabela 'carteiras' para a carteira de um investidor específico.
     * 
     * @param carteira Objeto `Carteira` contendo o ID do investidor e o novo valor 'xrp'.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
    public void atualizarRipple(Carteira carteira) throws SQLException{
        String sql = "update carteiras set xrp = ? where id_user = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getXrp());
        statement.setInt(2, carteira.getID_user());
        statement.execute();
    } 

    /**
     * Insere uma nova transação na tabela 'transacoes'.
     * 
     * @param extrato Objeto `Extrato` contendo os detalhes da transação (ID da carteira, tipo, valor, data, ID da criptomoeda, taxa, quantidades de reais, BTC, ETH e XRP).
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
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

    /**
     * Consulta o banco de dados para recuperar todas as transações associadas à carteira de um investidor.
     * 
     * @param investidor Objeto `Investidor` contendo a carteira do investidor.
     * @return Uma lista `ArrayList` de objetos `Extrato` representando as transações recuperadas.
     * @throws SQLException Se ocorrer um erro ao interagir com o banco de dados.
     */
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