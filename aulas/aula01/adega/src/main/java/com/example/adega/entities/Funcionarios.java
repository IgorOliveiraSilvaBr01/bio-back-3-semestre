package com.example.adega.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cargo;
    private Double salario;

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Funcionarios(long id, String nome, String cargo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionarios(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionarios (){}

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
