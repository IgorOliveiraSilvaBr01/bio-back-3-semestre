package com.example.aluguelcarros.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity // indica que a classe é uma entidade
public class Carro {

    @Id // indica que o atributo é um id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // id da entidade
    private String nome; // nome do carro (entidade)
    private String placa; // placa do carro (entidade)
    private boolean estado; // estado do aluguel (esta alugado ou não)
    private double valorAluguel; // valor do aluguel do carro
    private LocalDate dataSaida; // data de saida do carro da garagem
    private LocalDate dataRetorno; // data de retorno do carro a garagem

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                ", estado=" + estado +
                ", valorAluguel=" + valorAluguel +
                ", dataSaida=" + dataSaida +
                ", dataRetorno=" + dataRetorno +
                '}';
    }

    // constructors
    public Carro(){};

    public Carro(long id, String nome, String placa, boolean estado, double valorAluguel, LocalDate dataSaida, LocalDate dataRetorno) {
        this.id = id;
        this.nome = nome;
        this.placa = placa;
        this.estado = estado;
        this.valorAluguel = valorAluguel;
        this.dataSaida = dataSaida;
        this.dataRetorno = dataRetorno;
    };

    public Carro(String nome, String placa, boolean estado, double valorAluguel, LocalDate dataSaida, LocalDate dataRetorno) {
        this.nome = nome;
        this.placa = placa;
        this.estado = estado;
        this.valorAluguel = valorAluguel;
        this.dataSaida = dataSaida;
        this.dataRetorno = dataRetorno;
    };

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(LocalDate dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
}

