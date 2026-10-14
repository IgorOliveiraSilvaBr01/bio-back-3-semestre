package com.example.security.dtos;

import com.example.security.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequest {

    private String nome;
    private String email;
    private String senha;
    private Role role;
}
