package com.example.authsystem.controllers;

import com.example.authsystem.DTOs.UsuarioRequest;
import com.example.authsystem.DTOs.UsuarioResponse;
import com.example.authsystem.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> criarUsuario(@RequestBody UsuarioRequest req){
        return ResponseEntity.ok("Criado com sucesso"
                + usuarioService.criarUsuario(req));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> mostrar() {
        return ResponseEntity.ok(usuarioService.mostrarUsuario());
    }
}
