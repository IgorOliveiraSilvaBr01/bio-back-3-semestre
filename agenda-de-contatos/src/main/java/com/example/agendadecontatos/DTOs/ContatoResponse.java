package com.example.agendadecontatos.DTOs;

import com.example.agendadecontatos.entities.Contato;

import java.util.List;
import java.util.Optional;

// response contém os dados que o servidor exibe ao cliente
public class ContatoResponse {

    private long id;
    private String nome;
    private String telefone;
    private String email;

    public ContatoResponse(){

    } // constructor vazio

    public ContatoResponse(long id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    } // constructor

    public ContatoResponse(Optional<Contato> contato){
        id = contato.get().getId();
        nome = contato.get().getNome();
        telefone = contato.get().getTelefone();
        email = contato.get().getEmail();
    }

    // to string
    @Override
    public String toString() {
        return "ContatoResponse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
