package com.example.authsystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.ISBN;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Email @Column(unique = true, comment = "Email incorreto")
    // faz com que o email seja unico
    // traz validações para confirmar se o valor recebido se comporta como um email
    private String email;
    @Size(min = 6, max = 20, message = "Teste da Fiama")
    private String senha;
    @NotNull
    private String nome;
    private LocalDateTime dtCriacao;

    public Usuario(){

    };

    public Usuario(Long id, String email, String senha, String nome, LocalDateTime dtCriacao) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    public Usuario(String email, String senha, String nome, LocalDateTime dtCriacao) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", dtCriacao=" + dtCriacao +
                '}';
    }
}
