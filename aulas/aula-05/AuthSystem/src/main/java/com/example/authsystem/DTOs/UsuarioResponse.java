package com.example.authsystem.DTOs;

import com.example.authsystem.entities.Usuario;

import java.time.LocalDateTime;
import java.util.Optional;

public class UsuarioResponse {

    private Long id;
    private String email;
    private String nome;
    private LocalDateTime dtCriacao;

    public UsuarioResponse(){

    }

    public UsuarioResponse(Long id, String email, String nome, LocalDateTime dtCriacao) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    public UsuarioResponse(Optional<Usuario> usuario) {
        id = usuario.get().getId();
        email = usuario.get().getEmail();
        nome = usuario.get().getNome();
        dtCriacao = usuario.get().getDtCriacao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "UsuarioResponse{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", dtCriacao=" + dtCriacao +
                '}';
    }
}
