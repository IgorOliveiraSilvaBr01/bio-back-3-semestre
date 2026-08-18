package com.example.agendadecontatos.DTOs;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

// request são os dados que o cliente envia ao servidor
public class ContatoRequest {

    @NotNull // indica que o atributo nao pode ter um valor nulo (vazio) atribuido
    private String nome;
    @NotNull
    @Size(min = 11, max = 11, message = "Número de Telefone")
    // tamanho do valor que sera atribuido
    private String telefone;
    @Size(min = 1, max = 60, message = "Endereço de Email")
    private String email;

    public ContatoRequest(){

    } // constructor vazio

    public ContatoRequest(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    } // constructor

    // getters e setters
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
