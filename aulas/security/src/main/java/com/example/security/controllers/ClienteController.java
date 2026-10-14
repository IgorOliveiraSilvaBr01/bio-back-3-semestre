package com.example.security.controllers;

import com.example.security.dtos.ClienteRequest;
import com.example.security.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody ClienteRequest request) {
        return ResponseEntity.ok(clienteService.createCliente(request));
    }

    @GetMapping
    public ResponseEntity<?> ola() {
        return ResponseEntity.ok("Olá");
    }
}
