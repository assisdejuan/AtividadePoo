package com.example.formulariocontato.models;

public class Contato {
    private String nome;
    private String sobrenome;
    private String email;
    private String assunto;
    private String mensagem;
    private Long telefone;


    public Contato(String nome, String sobrenome, String email, String assunto, String mensagem, Long telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.telefone = telefone;
    }

    public Contato() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return
                "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Email: " + email + "\n" +
                "Assunto: " + assunto + "\n" +
                "Mensagem: " + mensagem + "\n" +
                "Telefone: " + telefone;
    }
}
