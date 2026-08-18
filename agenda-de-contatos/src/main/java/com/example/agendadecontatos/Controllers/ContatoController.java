package com.example.agendadecontatos.Controllers;

import com.example.agendadecontatos.DTOs.ContatoRequest;
import com.example.agendadecontatos.DTOs.ContatoResponse;
import com.example.agendadecontatos.Services.ContatoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// indica que a classe é um controlador web que retorna os dados para o cleinte
@RequestMapping("contatos")
// caminho url onde se encontra os metodos http da classe contato
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    // adicionar contato na agenda - post
    @PostMapping
    public ResponseEntity<?> adicionarContato(@Valid @RequestBody ContatoRequest req){
        return ResponseEntity.ok("Contato adicionado com sucesso!"
                + contatoService.adicionarContato(req));
    }

    // listar todos os contatos da agenda - get
    @GetMapping
    public ResponseEntity<List<ContatoResponse>> listarContatos() {
        return ResponseEntity.ok(contatoService.listarContatos());
    }

    // alterar contato da agenda por id - put
    @PutMapping("/{id}")
    public ResponseEntity<?> alterarContato(@Valid @PathVariable("id") Long id,
                                            @RequestBody ContatoRequest contatoRequest) {
        return ResponseEntity.ok(contatoService.alterarContato(id, contatoRequest));
    }

    // deletar contato da agenda por id - delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarContato(@PathVariable("id") Long id) {
        return ResponseEntity.ok(contatoService.deletarContato(id));
    }
}
