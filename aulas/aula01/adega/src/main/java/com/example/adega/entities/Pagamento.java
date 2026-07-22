package com.example.adega.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String data;
    private Double valor;

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Pagamento(long id, String data, Double valor) {
        this.id = id;
        this.data = data;
        this.valor = valor;
    }

    public Pagamento(String data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public Pagamento (){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
