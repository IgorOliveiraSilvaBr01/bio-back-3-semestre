package com.example.aluguelcarros.DTOs;

public class CarroDTO {

    // atributos
    private String nome;
    private String placa;

    // constructors
    public CarroDTO (){

    };

    public CarroDTO(String nome, String placa) {
        this.nome = nome;
        this.placa = placa;
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
