
package Dominio;

import java.sql.Date;


public class Usuario {
    private String senha;
    private String nome;
    private String cpf;
    private String DtNascimento;
    private String email;
    private int sexo;
    private String telefone;
    private int idUsuario;

    public Usuario(String senha, String nome, String cpf, String DtNascimento, String email, int sexo, String telefone,int idusuario) {
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.DtNascimento = DtNascimento;
        this.email = email;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idUsuario = idusuario;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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

    public String getDtNascimento() {
        return DtNascimento;
    }

    public void setDtNascimento(String DtNascimento) {
        this.DtNascimento = DtNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
