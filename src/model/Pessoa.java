
package model;

/**
 * Representa uma pessoa genérica do sistema.
 * 
 * Esta classe representa uma pessoa genérica do sistema, podendo ser utilizada 
 * para investidores, administradores, ou qualquer outra entidade que necessite 
 * de atributos como nome, CPF e senha.
 *
 * A classe `Pessoa` possui os seguintes atributos:
 *  * `nome`: Nome da pessoa (String).
 *  * `cpf`: CPF da pessoa (String).
 *  * `senha`: Senha de acesso ao sistema (String).
 *
 * @author Marjorie Luize Martins Costa
 */
public class Pessoa {
    private String nome, cpf, senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
    * Construtor da classe `Pessoa` que recebe todos os atributos como parâmetros.
    *
    * @param nome Nome da pessoa.
    * @param cpf CPF da pessoa.
    * @param senha Senha de acesso ao sistema.
    */
    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    /**
    * Construtor padrão da classe `Pessoa` (sem parâmetros, atributos inicializados com valores padrão).
    */
    public Pessoa() {
    }

}
