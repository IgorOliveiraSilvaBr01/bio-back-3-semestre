package com.example.authsystem.DTOs;

import java.time.LocalDateTime;

public class UsuarioRequest {

    private String email;
    private String senha;
    private String nome;
    private LocalDateTime dtCriacao;

    public UsuarioRequest(){}

    public UsuarioRequest(String email, String senha, String nome, LocalDateTime dtCriacao) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }
}
