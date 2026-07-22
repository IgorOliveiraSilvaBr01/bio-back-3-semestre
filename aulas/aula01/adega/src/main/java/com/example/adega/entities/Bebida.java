package com.example.adega.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String validade;
    private Boolean isAlcoolico;
    private String volume;
    private double valor;

    @Override
    public String toString() {
        return "Bebida{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", validade='" + validade + '\'' +
                ", isAlcoolico=" + isAlcoolico +
                ", volume='" + volume + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Bebida(long id, String nome, String validade, Boolean isAlcoolico, String volume, double valor) {
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.isAlcoolico = isAlcoolico;
        this.volume = volume;
        this.valor = valor;
    }

    public Bebida(String nome, String validade, Boolean isAlcoolico, String volume, double valor) {
        this.nome = nome;
        this.validade = validade;
        this.isAlcoolico = isAlcoolico;
        this.volume = volume;
        this.valor = valor;
    }

    public Bebida(){}

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

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Boolean getAlcoolico() {
        return isAlcoolico;
    }

    public void setAlcoolico(Boolean alcoolico) {
        isAlcoolico = alcoolico;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
