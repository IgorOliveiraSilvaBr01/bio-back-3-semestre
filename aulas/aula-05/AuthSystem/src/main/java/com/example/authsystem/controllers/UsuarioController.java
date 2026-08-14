package com.example.authsystem.controllers;

import com.example.authsystem.DTOs.UsuarioRequest;
import com.example.authsystem.DTOs.UsuarioResponse;
import com.example.authsystem.services.UsuarioService;
import jakarta.validation.Valid;
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

    // cadastrar/criar usuario
    @PostMapping
    public ResponseEntity<?> criarUsuario(@Valid @RequestBody UsuarioRequest req){
        return ResponseEntity.ok("Criado com sucesso"
                + usuarioService.criarUsuario(req));
    }

    // mostrar usuario
    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> mostrar() {
        return ResponseEntity.ok(usuarioService.mostrarUsuario());
    }

    // mostrar usuario por id
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> buscarId(@PathVariable("id") long id){
        return ResponseEntity.ok(usuarioService.buscarId(id));
    }

    // deletar usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId(@PathVariable("id") long id){
        return ResponseEntity.ok(usuarioService.deletarUsuario(id));
    }

    // alterar usuario
    @PutMapping("/{id}")
    public ResponseEntity<?> alterarUsuario(@Valid @PathVariable("id") long id, @RequestBody UsuarioRequest usuarioRequest){
        return ResponseEntity.ok(usuarioService.alterarUsuario(id, usuarioRequest));
    }
}
