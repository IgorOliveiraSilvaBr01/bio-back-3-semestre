package com.example.security.dtos;

import com.example.security.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponse {

    private UUID Id;
    private String nome;
    private String email;
    private String senha;
    private Role role;

    public ClienteResponse(String nome, String email, String senha, Role role) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
    }
}
