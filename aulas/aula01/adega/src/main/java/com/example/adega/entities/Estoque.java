package com.example.adega.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer quantidade;
    private Integer estoqueMax;
    private Integer estoqueMin;

    @Override
    public String toString() {
        return "Estoque{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", estoqueMax=" + estoqueMax +
                ", estoqueMin=" + estoqueMin +
                '}';
    }

    public Estoque(long id, Integer quantidade, Integer estoqueMax, Integer estoqueMin) {
        this.id = id;
        this.quantidade = quantidade;
        this.estoqueMax = estoqueMax;
        this.estoqueMin = estoqueMin;
    }

    public Estoque(Integer quantidade, Integer estoqueMax, Integer estoqueMin) {
        this.quantidade = quantidade;
        this.estoqueMax = estoqueMax;
        this.estoqueMin = estoqueMin;
    }

    public Estoque (){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoqueMax(Integer estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    public Integer getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(Integer estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
}