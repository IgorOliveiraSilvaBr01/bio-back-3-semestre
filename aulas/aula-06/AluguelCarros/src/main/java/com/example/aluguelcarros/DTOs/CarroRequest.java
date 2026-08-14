package com.example.aluguelcarros.DTOs;

import jakarta.validation.constraints.Size;

public class CarroRequest {

    private String nome;
    @Size(min = 7 || max = 7);
}
