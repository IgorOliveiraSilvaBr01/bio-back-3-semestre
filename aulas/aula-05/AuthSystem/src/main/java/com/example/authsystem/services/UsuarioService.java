package com.example.authsystem.services;

import com.example.authsystem.DTOs.UsuarioRequest;
import com.example.authsystem.DTOs.UsuarioResponse;
import com.example.authsystem.entities.Usuario;
import com.example.authsystem.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioRequest criarUsuario(UsuarioRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());
        usuario.setDtCriacao(LocalDateTime.now());

        usuarioRepository.save(usuario);
        return request;
    }

    public List<UsuarioResponse> mostrarUsuario() {
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioResponse(
                        usuario.getId(), usuario.getEmail(),
                        usuario.getNome(), usuario.getDtCriacao())).toList();
    }

    public UsuarioResponse buscarId(long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        UsuarioResponse usuarioResponse = new UsuarioResponse(usuario);
        return usuarioResponse;
    }

    public String deletarUsuario(long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario == null) {
            return "Usuario não existe";
        } else {
            usuarioRepository.deleteById(id);
            return "Usuário kickado";
        }
    }

    public String alterarUsuario(Long id, UsuarioRequest usuarioAlterado) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();

        usuario.setNome(usuarioAlterado.getNome());
        usuario.setEmail(usuarioAlterado.getEmail());
        usuario.setSenha(usuarioAlterado.getSenha());

        usuarioRepository.save(usuario);
        return "ok";
    };
}
