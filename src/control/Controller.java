
package control;

import java.sql.Timestamp;
import DAO.BancoDAO;
import DAO.Conexao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Bitcoin;
import model.Carteira;
import model.Cotacao;
import model.Ethereum;
import model.Extrato;
import model.Investidor;
import model.Real;
import model.Ripple;
import model.Valor;
import view.Consultar;
import view.Login;
import view.Menu;
import view.Movimentar;
import view.Senha;
import view.Transacao;

/**
 * Classe principal para controlar o aplicativo de negociação de criptomoedas.
 * 
 * Essa classe gerencia a interação do usuário com o aplicativo, 
 * incluindo autenticação, consulta de saldo, movimentações financeiras e transações com criptomoedas.
 *
 * @author Marjorie Luize Martins Costa
 */
public class Controller {
    private Login view;
    private Consultar consultar;
    private Menu menu;
    private Movimentar movimentar;
    private Senha senha;
    private Transacao transacao;
    private Investidor investidor;
    private Valor valor;
    
    private Ethereum eth;
    private Real real;
    private Ripple xrp;
    private Bitcoin btc;

    /**
    * Obtém o saldo em Ethereum da carteira do investidor.
    * 
    * @return Objeto `Ethereum` representando o saldo em Ethereum.
    */
    public Ethereum getEth() {
        return eth;
    }

    /**
    * Define o saldo em Ethereum da carteira do investidor.
    * 
    * @param eth Objeto `Ethereum` representando o novo saldo em Ethereum.
    */
    public void setEth(Ethereum eth) {
        this.eth = eth;
    }

    /**
    * Obtém o saldo em Real da carteira do investidor.
    * 
    * @return Objeto `Real` representando o saldo em Real.
    */
    public Real getReal() {
        return real;
    }

    /**
    * Define o saldo em Real da carteira do investidor.
    * 
    * @param real Objeto `Real` representando o novo saldo em Real.
    */
    public void setReal(Real real) {
        this.real = real;
    }

    /**
    * Obtém o saldo em Ripple da carteira do investidor.
    * 
    * @return Objeto `Ripple` representando o saldo em Ripple.
    */
    public Ripple getXrp() {
        return xrp;
    }
    
    /**
    * Define o saldo em Ripple da carteira do investidor.
    * 
    * @param xrp Objeto `Ripple` representando o novo saldo em Ripple.
    */
    public void setXrp(Ripple xrp){
        this.xrp = xrp;
    }

    /**
    * Obtém o saldo em Bitcoin da carteira do investidor.
    * 
    * @return Objeto `Bitcoin` representando o saldo em Bitcoin.
    */
    public Bitcoin getBtc() {
        return btc;
    }

    /**
    * Define o saldo em Bitcoin da carteira do investidor.
    * 
    * @param btc Objeto `Bitcoin` representando o novo saldo em Bitcoin.
    */
    public void setBtc(Bitcoin btc) {
        this.btc = btc;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }
    
    public Login getView() {
        return view;
    }

    public void setView(Login view) {
        this.view = view;
    }

    public Consultar getConsultar() {
        return consultar;
    }

    public void setConsultar(Consultar consultar) {
        this.consultar = consultar;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Movimentar getMovimentar() {
        return movimentar;
    }

    public void setMovimentar(Movimentar movimentar) {
        this.movimentar = movimentar;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Controller() {
    }

    public Controller(Login view) {
        this.view = view;
    }

    public Controller(Investidor investidor) {
        this.investidor = investidor;
    }

    public Controller(Login view, Consultar consultar, Menu menu, Movimentar movimentar, Senha senha, Transacao transacao, Investidor investidor, Valor valor) {
        this.view = view;
        this.consultar = consultar;
        this.menu = menu;
        this.movimentar = movimentar;
        this.senha = senha;
        this.transacao = transacao;
        this.investidor = investidor;
        this.valor = valor;
    }

    public Controller(Senha senha, Investidor investidor) {
        this.senha = senha;
        this.investidor = investidor;
    }

    public Controller(Menu menu, Investidor investidor) {
        this.menu = menu;
        this.investidor = investidor;
    }

    public Controller(Consultar consultar, Investidor investidor) {
        this.consultar = consultar;
        this.investidor = investidor;
    }

    public Controller(Movimentar movimentar, Investidor investidor) {
        this.movimentar = movimentar;
        this.investidor = investidor;
    }

    public Controller(Transacao transacao, Investidor investidor) {
        this.transacao = transacao;
        this.investidor = investidor;
    }
    
    
    public void LoginUsuario(){
        
        String cp= view.getTXTcpf().getText();
        String se = view.getTXTsenha().getText();
        
        if (se.length() > 6) {
    
            JOptionPane.showMessageDialog(view,"Senha inválida: A senha não pode ter mais de 6 dígitos.");
        }
        if (cp.length() > 11){
    
            JOptionPane.showMessageDialog(view,"Senha inválida: A senha não pode ter mais de 6 dígitos.");
        }
        String regex = "[\\-\\.]"; 
        if (cp.matches(regex)) {
            
            JOptionPane.showMessageDialog(view,"CPF inválido: O CPF não pode conter hifens (-) ou pontos (.).");
        }
        Carteira carteira = new Carteira(0,0,0,0,0,0);
        investidor = new Investidor (0, null, view.getTXTcpf().getText(), 
        view.getTXTsenha().getText(), carteira);
        
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultarInvestidor(investidor);
            if(res.next()){
                JOptionPane.showMessageDialog(view,"Login feito!");
                int ID_user = res.getInt("id_user");
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String sen = res.getString("senha");
                
                carteira = new Carteira(0,ID_user,0,0,0,0);
                ResultSet r = dao.consultarCarteira(carteira);
                
                if(r.next()){
                    int ID_c = r.getInt("id_carteira");
                    //System.out.println(ID_c);
                    int ID_u = r.getInt("id_user");
                    //System.out.println(ID_u);
                    double s = r.getDouble("reais");
                    //System.out.println(s);
                    double b = r.getDouble("btc");
                    //System.out.println(b);
                    double e = r.getDouble("eth");
                    //System.out.println(e);
                    double x = r.getDouble("xrp");
                    //System.out.println(x);
                    setarMoedas();
                    Menu viewMenu = new Menu(new Investidor(ID_user, nome, cpf, sen, new Carteira(ID_c, ID_user, s, b, e, x)), real, btc, eth, xrp);
                    viewMenu.setVisible(true);
                    view.setVisible(false);
                    
                    } else {
                JOptionPane.showMessageDialog(view,"Erro na carteira.");
            }
            } else {
                JOptionPane.showMessageDialog(view,"Login não foi efetuado.");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexão");
                e.printStackTrace(); // Opcional para exibir detalhes do erro no console
        } finally {
          try {
            if (conn != null) {
              conn.close();
            }
          } catch (SQLException e) {
            e.printStackTrace();
        }
      }
    }

    public void Validar(Investidor investidor, int j, int t, Real real, Ethereum eth, Bitcoin btc, Ripple xrp){
        valor = new Valor(senha.getTXTsenha().getText());
        String s = investidor.getSenha();
        String s2 = valor.getSenha();
       
        if (s2.length() > 6) {
    
            JOptionPane.showMessageDialog(senha,"Senha inválida: A senha não pode ter mais de 6 dígitos.");
        }
        if(s.equals(s2)){
            JOptionPane.showMessageDialog(senha,"Senha correta.");
            senha.setVisible(false);
            if(j == 1){
                Movimentar viewMovimentar = new Movimentar(investidor, t);
                viewMovimentar.setVisible(true);
            } else if (j == 2){
                Transacao viewTransacao = new Transacao(investidor, t, real, eth, btc, xrp);
                viewTransacao.setVisible(true);
            }else if (j == 3){
                Consultar viewConsultar = new Consultar(investidor, t,  real,  eth,  btc,  xrp);
                viewConsultar.setVisible(true);
            }   
        } else {
            JOptionPane.showMessageDialog(senha,"Senha incorreta.");
        }
    }

    public void Movimentar(Investidor investidor, int i){
        
        String valor = movimentar.getTXTvalor().getText();
        double v = Double.parseDouble(valor);
        double saldo = investidor.getCarteira().getReais();
        double atual;
        String tipo = null;
//        if (i == 1){
//            
//            atual = saldo + v;
//            investidor.getCarteira().setReais(atual);
//        } else if (i == 2){
//            
//            if (v > saldo){
//                JOptionPane.showMessageDialog(movimentar, "Saldo insuficiente.");
//            } else if(v <= saldo){
//                atual = saldo - v;
//                investidor.getCarteira().setReais(atual);
//            }
//        }
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            if (i == 1){
                tipo = "Depósito";
                atual = saldo + v;
                investidor.getCarteira().setReais(atual);
                adicionarTransacao( investidor.getCarteira().getID_carteira(), 4, tipo, v, 0, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                } else if (i == 2){
                tipo = "Saque";
                if (v > saldo){
                JOptionPane.showMessageDialog(movimentar, "Saldo insuficiente.");
                } else if(v <= saldo){
                    atual = saldo - v;
                    investidor.getCarteira().setReais(atual);
                    adicionarTransacao( investidor.getCarteira().getID_carteira(), 4, tipo, v, 0, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                }
            }
            
            
            dao.atualizarReais(investidor.getCarteira());
            String x= String.format("%.2f", investidor.getCarteira().getReais());
            JOptionPane.showMessageDialog(movimentar, "Saldo Reais atualizado: " + x);
            movimentar.setVisible(false);
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(movimentar, "Falha de conexão");
            e.printStackTrace(); // Opcional para exibir detalhes do erro no console
        } finally {
          try {
            if (conn != null) {
              conn.close();
            }
          } catch (SQLException e) {
            e.printStackTrace();
        }
      }
    }
    
    /**
    * Busca e exibe o saldo do investidor na interface gráfica.
    * 
    * Este método recupera o saldo do investidor a partir do banco de dados e exibe os valores de Reais, Bitcoin, Ethereum e Ripple na tela.
    * 
    * O método realiza as seguintes ações:
    *  1. Estabelece uma conexão com o banco de dados.
    *  2. Cria um objeto `BancoDAO` para interagir com o banco de dados.
    *  3. Executa a consulta `dao.consultarCarteira` passando a carteira do investidor como parâmetro.
    *  4. Verifica se a consulta retornou algum resultado (`if(r.next())`):
    *     - Se houver resultado, recupera os valores para "reais", "btc", "eth" e "xrp" do `ResultSet`.
    *     - Cria um objeto `Date` para recuperar a data e hora atuais.
    *     - Converte a data e hora para um objeto `Timestamp`.
    *     - Limpa o campo de texto da interface gráfica (`consultar.getTXTexibir()`) utilizado para exibir o saldo.
    *     - Exibe o saldo formatado na interface gráfica, incluindo data e hora da consulta, valor em Reais, Bitcoin, Ethereum e Ripple.
    *  5. Caso não haja resultado da consulta, exibe uma mensagem informativa através do `JOptionPane`.
    *  6. Fecha a conexão com o banco de dados (dentro do bloco `finally`).
    *
    * @param investidor Objeto `Investidor` que representa o investidor para o qual se deseja exibir o saldo.
    */
    public void Saldo(Investidor investidor){
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet r = dao.consultarCarteira(investidor.getCarteira());
            if(r.next()){
                    double s = r.getDouble("reais");
                    //System.out.println(s);
                    double b = r.getDouble("btc");
                    //System.out.println(b);
                    double e = r.getDouble("eth");
                    //System.out.println(e);
                    double x = r.getDouble("xrp");
                    //System.out.println(x);
                    Date date = new Date();
                    Timestamp timestamp = new Timestamp(date.getTime());
                    consultar.getTXTexibir().setText("");
                    consultar.getTXTexibir().setText("\n"+timestamp+"\n"
                            + "\nReais: " + s
                            + "\n\nBitcoin: " + b
                            + "\n\nEthereum: " + e
                            + "\n\nRipple: " + x);
                    
                    } else {
                JOptionPane.showMessageDialog(consultar,"Erro na carteira.");
            }

        } catch (SQLException e){
            JOptionPane.showMessageDialog(consultar, "Falha de conexão");
        e.printStackTrace(); // Opcional para exibir detalhes do erro no console
        } finally {
          try {
            if (conn != null) {
              conn.close();
            }
          } catch (SQLException e) {
            e.printStackTrace();
        }
      } 
    }
    
    /**
    * Realiza uma transação de compra ou venda de criptomoedas (Bitcoin, Ethereum ou Ripple) para um investidor.
    * 
    * Este método recebe como parâmetros um objeto `Investidor`, um indicador de compra ou venda (`i`), um objeto `Real` representando o valor da transação, e objetos `Ethereum`, `Bitcoin` e `Ripple` representando as criptomoedas envolvidas.
    * 
    * O método realiza as seguintes ações:
    *  1. Determina a moeda a ser transacionada com base na seleção do usuário na interface gráfica.
    *  2. Obtém o valor da transação digitado pelo usuário e converte para um valor double.
    *  3. Recupera o saldo atual do investidor em Reais.
    *  4. Calcula as variáveis `cotacao`, `qtd`, `crypto`, `atual` e `taxa` de acordo com a transação (compra ou venda).
    *  5. Valida se o saldo do investidor é suficiente para realizar a transação, incluindo a taxa.
    *  6. Atualiza o saldo das criptomoedas e Reais na carteira do investidor.
    *  7. Salva a transação no banco de dados utilizando o método `adicionarTransacao`.
    *  8. Atualiza o saldo em Reais na carteira do investidor no banco de dados.
    *  9. Exibe mensagens informativas ao usuário sobre o resultado da transação.
    *  10. Fecha a conexão com o banco de dados (dentro do bloco `finally`).
    *
    * @param investidor Objeto `Investidor` que representa o investidor que realiza a transação.
    * @param i Indicador de compra ou venda: 1 para compra, 2 para venda.
    * @param re Objeto `Real` que representa o valor da transação em Reais.
    * @param et Objeto `Ethereum` (opcional, utilizado em transações com Ethereum).
    * @param bt Objeto `Bitcoin` (opcional, utilizado em transações com Bitcoin).
    * @param xr Objeto `Ripple` (opcional, utilizado em transações com Ripple).
    */
    public void Transacao(Investidor investidor, int i, Real re, Ethereum et, Bitcoin bt, Ripple xr){

        int c = 0;
        if(transacao.getRBbitcoin().isSelected()){

            c = 1;
        } else if(transacao.getRBethereum().isSelected()) {

            c = 2;
        } else if(transacao.getRBripple().isSelected()) {

            c = 3;
        } else{
            JOptionPane.showMessageDialog(transacao, "Moeda não selecionada.");
        }
        String valor = transacao.getTXTvalor().getText();
        double v = Double.parseDouble(valor);
        double saldo = investidor.getCarteira().getReais();
        double atual, cotacao, qtd, crypto;
        double taxa = 0;
        String tipo = null;
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
        if (i == 1){
            // Comprar
            
            if (c ==1){
                tipo = "Comprar Bitcoin";
                taxa = bt.calcularCompra(v);
                cotacao = bt.getCotacao();
                qtd = v / cotacao;
                atual = saldo - v - taxa;

                if (atual <= saldo){
                    if (atual > 0) {
                    crypto = investidor.getCarteira().getBtc();
                    investidor.getCarteira().setBtc(crypto+qtd);

                    investidor.getCarteira().setReais(atual);

                    dao.atualizarBitcoin(investidor.getCarteira());
                    String x= String.format("%.2f", investidor.getCarteira().getBtc());
                    JOptionPane.showMessageDialog(transacao, "Saldo Bitcoin atualizado: " + x);
                    adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                }else {
                    JOptionPane.showMessageDialog(transacao, "Saldo insuficiente para cobrir a taxa!");
                }
                } else {
                    JOptionPane.showMessageDialog(transacao, "Erro!");
                }
            }else if(c == 2){
                tipo = "Comprar Ethereum";
                taxa = et.calcularCompra(v);
                cotacao = et.getCotacao();
                qtd = v / cotacao;
                atual = saldo - v - taxa;
                if (atual <= saldo){
                    if (atual > 0) {
                    crypto = investidor.getCarteira().getEth();
                    investidor.getCarteira().setEth(crypto+qtd);

                    investidor.getCarteira().setReais(atual);

                    dao.atualizarBitcoin(investidor.getCarteira());
                    String x= String.format("%.2f", investidor.getCarteira().getEth());
                    JOptionPane.showMessageDialog(transacao, "Saldo Ethereum atualizado: " + x);
                    adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                }else {

                    JOptionPane.showMessageDialog(transacao, "Saldo insuficiente para cobrir a taxa!");
                }

                } else {
                    JOptionPane.showMessageDialog(transacao, "Erro!");
                }
            }else if(c == 3){
                tipo = "Comprar Ripple";
                taxa = xr.calcularCompra(v);
                cotacao = xr.getCotacao();
                qtd = v / cotacao;
                atual = saldo - v - taxa;
                if (atual > 0) {
                    crypto = investidor.getCarteira().getXrp();
                    investidor.getCarteira().setXrp(crypto+qtd);

                    investidor.getCarteira().setReais(atual);

                    dao.atualizarBitcoin(investidor.getCarteira());
                    String x= String.format("%.2f", investidor.getCarteira().getXrp());
                    JOptionPane.showMessageDialog(transacao, "Saldo Ripple atualizado: " + x);
                    adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                }else {

                    JOptionPane.showMessageDialog(transacao, "Saldo insuficiente para cobrir a taxa!");
                }

                } else {
                    JOptionPane.showMessageDialog(transacao, "Erro!");
                }
            
        } else if (i == 2){
            // vender
            
            if (c == 1){
                tipo = "Vender Bitcoin";
                taxa = bt.calcularVenda(v);
                cotacao = bt.getCotacao();
                qtd = v / cotacao;
                crypto = investidor.getCarteira().getBtc();
                
                if (qtd <= crypto){
                    atual = saldo +v - taxa;
                
                investidor.getCarteira().setBtc(crypto-qtd);
                
                investidor.getCarteira().setReais(atual);
                
                dao.atualizarBitcoin(investidor.getCarteira());
                String x= String.format("%.2f", investidor.getCarteira().getBtc());
                JOptionPane.showMessageDialog(transacao, "Saldo Bitcoin atualizado: " + x);
                adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                } else if (qtd >crypto){
                    JOptionPane.showMessageDialog(transacao, "Bitcoin insuficiente para a venda!");
                } else {
                    JOptionPane.showMessageDialog(transacao, "Erro!");
                }
                
            }else if(c == 2){
                tipo = "Vender Ethereum";
                taxa = et.calcularVenda(v);
                cotacao = et.getCotacao();
                qtd = v / cotacao;
                crypto = investidor.getCarteira().getEth();
                if (qtd <= crypto){
                atual = saldo +v - taxa;
                investidor.getCarteira().setEth(crypto-qtd);
                
                investidor.getCarteira().setReais(atual);
                
                dao.atualizarEthereum(investidor.getCarteira());
                String x= String.format("%.2f", investidor.getCarteira().getEth());
                JOptionPane.showMessageDialog(transacao, "Saldo Ethereum atualizado: " + x);
                adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                } else if (qtd >crypto){
                    JOptionPane.showMessageDialog(transacao, "Ethereum insuficiente para a venda!");
                } else {
                    JOptionPane.showMessageDialog(transacao, "Erro!");
                }
            }else if(c == 3){
                tipo = "Vender Ripple";
                taxa = xr.calcularVenda(v);
                cotacao = xr.getCotacao();
                qtd = v / cotacao;
                crypto = investidor.getCarteira().getXrp();
                if (qtd <= crypto){
                investidor.getCarteira().setXrp(crypto-qtd);
                atual = saldo +v - taxa;
                investidor.getCarteira().setReais(atual);
                
                dao.atualizarRipple(investidor.getCarteira());
                String x= String.format("%.2f", investidor.getCarteira().getXrp());
                JOptionPane.showMessageDialog(transacao, "Saldo Ripple atualizado: " + x);
                adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                } else if (qtd >crypto){
                    JOptionPane.showMessageDialog(transacao, "Ripple insuficiente para a venda!");
                } else {
                    JOptionPane.showMessageDialog(transacao, "Erro!");
                }
            }
            
        }
                
//                adicionarTransacao( investidor.getCarteira().getID_carteira(), c,tipo, v, taxa, investidor.getCarteira().getReais(), investidor.getCarteira().getBtc(),investidor.getCarteira().getEth(), investidor.getCarteira().getXrp());
                dao.atualizarReais(investidor.getCarteira());
                String x= String.format("%.2f", investidor.getCarteira().getReais());
                JOptionPane.showMessageDialog(transacao, "Saldo Reais atualizado: " + x);

                transacao.setVisible(false);

            } catch (SQLException e){
                JOptionPane.showMessageDialog(transacao, "Falha de conexão");
                e.printStackTrace(); // Opcional para exibir detalhes do erro no console
            } finally {
              try {
                if (conn != null) {
                  conn.close();
                }
              } catch (SQLException e) {
                e.printStackTrace();
            
          }
        }
    }
    
    /**
    * Busca e define as cotações das moedas (Bitcoin, Ethereum, Ripple e Real) do banco de dados.
    * 
    * Este método realiza as seguintes ações:
    *  1. Cria objetos para representar as moedas (Bitcoin, Ethereum, Ripple e Real), inicialmente com valores zerados.
    *  2. Estabelece uma conexão com o banco de dados através da classe `Conexao`.
    *  3. Cria um objeto `BancoDAO` para interagir com o banco de dados.
    *  4. Para cada moeda (Bitcoin, Ethereum, Ripple e Real):
    *     - Executa a consulta `dao.consultarCotacao` passando o objeto da moeda como parâmetro.
    *     - Verifica se a consulta retornou algum resultado (`if(r.next())`):
    *        - Se houver resultado, recupera os valores das colunas "id_crypto", "nome", "cotacao", "compra" e "venda" do `ResultSet`.
    *        - Cria um novo objeto da moeda específica (Bitcoin, Ethereum, Ripple ou Real) utilizando os valores recuperados do banco de dados.
    *     - Caso não haja resultado da consulta, exibe uma mensagem informativa através do `JOptionPane`.
    *  5. Fecha a conexão com o banco de dados (dentro do bloco `finally`).
    *
    */
    public void setarMoedas(){
        Bitcoin bitcoin = new Bitcoin(1, "Bitcoin", 0, 0, 0);
        Ethereum ethereum = new Ethereum(2, "Ethereum", 0, 0, 0);
        Ripple ripple = new Ripple(3, "Ripple", 0, 0, 0);
        Real reais = new Real(4, "Reais", 0, 0, 0);
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet r = dao.consultarCotacao(bitcoin);
            if(r.next()){
                int ID_c = r.getInt("id_crypto");
                System.out.println(ID_c);
                String n = r.getString("nome");
                System.out.println(n);
                double b = r.getDouble("cotacao");
                System.out.println(b);
                double e = r.getDouble("compra");
                System.out.println(e);
                double x = r.getDouble("venda");
                System.out.println(x);
                btc = new Bitcoin (ID_c, n, b, e, x);
                
            } else {
                JOptionPane.showMessageDialog(view,"Bitcoin não atualizado.");
            }
            ResultSet res = dao.consultarCotacao(ethereum);
            if(res.next()){
                int ID_c = res.getInt("id_crypto");
                System.out.println(ID_c);
                String n = res.getString("nome");
                System.out.println(n);
                double b = res.getDouble("cotacao");
                System.out.println(b);
                double e = res.getDouble("compra");
                System.out.println(e);
                double x = res.getDouble("venda");
                System.out.println(x);
                eth = new Ethereum(ID_c, n, b, e, x);
                
            } else {
                JOptionPane.showMessageDialog(view,"Ethereum não atualizado.");
            }
            ResultSet resu = dao.consultarCotacao(ripple);
            if(resu.next()){
                int ID_c = resu.getInt("id_crypto");
                System.out.println(ID_c);
                String n = resu.getString("nome");
                System.out.println(n);
                double b = resu.getDouble("cotacao");
                System.out.println(b);
                double e = resu.getDouble("compra");
                System.out.println(e);
                double x = resu.getDouble("venda");
                System.out.println(x);
                xrp = new Ripple(ID_c, n, b, e, x);
                
            } else {
                JOptionPane.showMessageDialog(view,"Ripple não atualizado.");
            }
            ResultSet resul = dao.consultarCotacao(reais);
            if(resul.next()){
                int ID_c = resul.getInt("id_crypto");
                System.out.println(ID_c);
                String n = resul.getString("nome");
                System.out.println(n);
                double b = resul.getDouble("cotacao");
                System.out.println(b);
                double e = resul.getDouble("compra");
                System.out.println(e);
                double x = resul.getDouble("venda");
                System.out.println(x);
                real = new Real(ID_c, n, b, e, x);
                
            } else {
                JOptionPane.showMessageDialog(view,"Real não atualizado.");
            }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view,"Erro nas moedas!");
                    e.printStackTrace(); // Opcional para exibir detalhes do erro no console
            } finally {
              try {
                if (conn != null) {
                  conn.close();
                }
          } catch (SQLException e) {
            
            e.printStackTrace();
          }
        }
    }   
    
    /**
    * Atualiza as cotações das criptomoedas (Bitcoin, Ethereum e Ripple) e salva no banco de dados.
    * 
    * Este método realiza as seguintes ações:
    *  1. Recupera as cotações atuais de cada criptomoeda (Bitcoin, Ethereum e Ripple) através dos métodos `getCotacao`.
    *  2. Arredonda cada cotação para duas casas decimais utilizando o método `arredondar`.
    *  3. Atualiza o valor da cotação nos objetos `Bitcoin`, `Ethereum` e `Ripple` utilizando os métodos `setCotacao`.
    *  4. Exibe as cotações arredondadas no console (opcional para fins de debug).
    *  5. Estabelece uma conexão com o banco de dados através da classe `Conexao`.
    *  6. Cria um objeto `BancoDAO` para interagir com o banco de dados.
    *  7. Salva as cotações atualizadas no banco de dados utilizando os métodos `cotacaoBitcoin`, `cotacaoEthereum` e `cotacaoRipple` do objeto `dao`.
    *  8. Recupera a data e hora atuais e converte para um objeto `Timestamp`.
    *  9. Atualiza o campo de texto (`TXTexibir`) do componente `consultar` com as cotações atualizadas e a data/hora.
    *  10. Trata possíveis exceções do tipo `SQLException` caso haja problemas de conexão com o banco de dados.
    *  11. Fecha a conexão com o banco de dados (dentro do bloco `finally`).
    *
    * @param bt Objeto Bitcoin que contém a cotação a ser atualizada.
    * @param et Objeto Ethereum que contém a cotação a ser atualizada.
    * @param xr Objeto Ripple que contém a cotação a ser atualizada.
    */
    public void atualizarCotacao(Bitcoin bt, Ethereum et, Ripple xr){
        Cotacao cotacao = new Cotacao();
        System.out.println(et.getCotacao());
        System.out.println(bt.getCotacao());
        System.out.println(xr.getCotacao());
        cotacao.Cotacao(et, bt, xr);
        
        double x;
        x = et.getCotacao();
        x = arredondar(x);
        et.setCotacao(x);
        
        x = bt.getCotacao();
        x = arredondar(x);
        bt.setCotacao(x);
        
        x = xr.getCotacao();
        x = arredondar(x);
        xr.setCotacao(x);

        System.out.println(et.getCotacao());
        System.out.println(bt.getCotacao());
        System.out.println(xr.getCotacao());
        
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            dao.cotacaoRipple(xr);
            dao.cotacaoEthereum(et);
            dao.cotacaoBitcoin(bt);
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());

            consultar.getTXTexibir().setText("");
            consultar.getTXTexibir().setText("\n"+timestamp+"\n"
                            + "\nBitcoin: " + bt.getCotacao()
                            + "\n\nEthereum: " + et.getCotacao()
                            + "\n\nRipple: " + xr.getCotacao());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(consultar, "Falha de conexão");
        e.printStackTrace(); // Opcional para exibir detalhes do erro no console
        } finally {
          try {
            if (conn != null) {
              conn.close();
            }
          } catch (SQLException e) {
            e.printStackTrace();
        }
      } 
    }
    
    /**
    * Arredonda um valor double para duas casas decimais.
    *
    * Este método utiliza a classe `BigDecimal` para realizar o arredondamento com precisão. 
    * Ele recebe um valor double como entrada (`x`), converte-o para `BigDecimal`, define a escala 
    * para duas casas decimais com arredondamento para cima (`ROUND_HALF_UP`), e finalmente converte 
    * o `BigDecimal` arredondado de volta para um valor double.
    *
    * @param x O valor double a ser arredondado.
    * @return O valor double arredondado para duas casas decimais.
    */
    public double arredondar(double x){
        double numberToRound = x;
        BigDecimal bigDecimal = new BigDecimal(numberToRound);
        BigDecimal roundedBigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        double roundedNumber = roundedBigDecimal.doubleValue();
        return roundedNumber;
          }
    
    public void transacoes(Investidor investidor) {
        Conexao conexao = new Conexao();
        Connection conn = null;
        try {
        conn = conexao.getConnection();
        BancoDAO dao = new BancoDAO(conn);

        ArrayList<Extrato> extratos = dao.consultarTransacoes(investidor);

        if (!extratos.isEmpty()) {
            StringBuilder displayText = new StringBuilder();
            displayText.append("Extrato de Transações do Investidor: " + investidor.getNome() + "\n");
            displayText.append("------------------------------------------------------------------------------------------\n");

            for (Extrato extrato : extratos) {
                displayText.append(extrato.printExtrato() + "\n");
            }

            consultar.getTXTexibir().setText(displayText.toString());
        } else {
            consultar.getTXTexibir().setText("Nenhuma transação encontrada para o investidor: " + investidor.getNome());
        }

    } catch (SQLException e) {
        System.out.println("Erro ao recuperar as transações");
        e.printStackTrace();
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    public void adicionarTransacao(int ID_carteira,int ID_crypto,String tipo,double val,double taxa,double reais,double bt,double et,double xr){
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        Extrato extrato = new Extrato( ID_carteira, ID_crypto, tipo, val, taxa, reais, bt, et, xr, timestamp);
        Conexao conexao = new Conexao();
        Connection conn = null;
        try{
            conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            dao.inserirTransacao(extrato);
            System.out.println("Transação adicionada ao bd.");
        } catch (SQLException e){
            System.out.println("Transação não adicionada ao bd.");
            e.printStackTrace(); // Opcional para exibir detalhes do erro no console
        } finally {
          try {
            if (conn != null) {
              conn.close();
            }
          } catch (SQLException e) {
            e.printStackTrace();
        }
      }
    }
}
