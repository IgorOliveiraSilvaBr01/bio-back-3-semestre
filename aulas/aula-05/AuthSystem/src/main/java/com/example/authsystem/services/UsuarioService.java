package com.example.authsystem.services;

import com.example.authsystem.DTOs.UsuarioRequest;
import com.example.authsystem.DTOs.UsuarioResponse;
import com.example.authsystem.entities.Usuario;
import com.example.authsystem.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioRequest criarUsuario(UsuarioRequest request){
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());
        usuario.setDtCriacao(LocalDateTime.now());

        usuarioRepository.save(usuario);
        return request;
    }

    public List<UsuarioResponse> mostrarUsuario(){
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioResponse(
                        usuario.getId(), usuario.getEmail(),
                        usuario.getNome(), usuario.getDtCriacao())).toList();
    }
}
