package com.example.authsystem.services;

import com.example.authsystem.DTOs.LoginDTO;
import com.example.authsystem.entities.Usuario;
import com.example.authsystem.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UsuarioRepository usuarioRepository;

    public LoginService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public String login(LoginDTO loginDTO){

        Usuario usuario = usuarioRepository.findByEmail(loginDTO.getEmail());

        // verifica se o usuario existe
        if (usuario == null) {
            return "Usuário não encontrado";
        }

        // verifica se as senhas condizem entre si
        if (usuario.getSenha().equals(loginDTO.getSenha())) {
            return "Acesso liberado";
        }

        // retorna caso a senha esteja incorreta
        return "E-mail ou senha incorretos";
    }
}
