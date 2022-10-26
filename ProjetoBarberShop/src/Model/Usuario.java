package Model;

import java.util.Date;

public class Usuario extends Pessoa {

    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome) {
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(int id, String nome, String sobrenome, String nivelAcesso, String dataNascimento, String telefone, String email, String senha) {
        super(id, nome, sobrenome, dataNascimento, telefone, email);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public void visualizarUsuario() {

        System.out.printf("ID: %d, \nNome: %s, \nSobrenome: %s, \nNivel de Acesso: %s, \nNascimento: %s,\nTelefone: %s, \nEmail: %s, \nSenha: %s\n",
                id, nome, sobrenome, nivelAcesso, dataNascimento, telefone, email, senha);
        System.out.println("----------------------------------------------------");
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

}
