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
    @PostMapping // anotacao que indica que o metodo é do tipo post
    public ResponseEntity<?> adicionarContato(@Valid @RequestBody ContatoRequest req){
        // ResponseEntitty<?> - objeto que representa a resposta http e
        // "?" significa que o tipo do retorno é indefinido
        // @Valid adiciona as validacoes definidas no ContatoRequest
        // @RequestBody pega os valores atribuidos o JSON pelo usuario e os converte para um objeto java
        return ResponseEntity.ok("Contato adicionado com sucesso!"
                // ResponseEntity.ok - retorn um status http 200
                + contatoService.adicionarContato(req));
    }

    // listar todos os contatos da agenda - get
    @GetMapping // anotacao que indica que o metodo é do tipo get
    public ResponseEntity<List<ContatoResponse>> listarContatos() {
        // define que o corpo da resppsota sera uma lista com todos os contatos
        return ResponseEntity.ok(contatoService.listarContatos());
        // ResponseEntity.ok - retorna um status http 200
    }

    // listar o contato pelo id - get
    @GetMapping("/{id}") // anotacao que indica que o metodo é do tipo get
    // "/{id}" - o id do objeto deve ser passado na url
    public ResponseEntity<ContatoResponse> buscarId(@PathVariable("id") Long id){
        // pega o valor passado na url e o transforma na variavel Long id
        return ResponseEntity.ok(contatoService.buscarId(id));
        // ResponseEntity.ok - retorna um status http 200
    }

    // alterar contato da agenda por id - put
    @PutMapping("/{id}") // anotacao que indica que o metodo é do tipo put
    // "/{id}" - o id do objeto deve ser passado na url
    public ResponseEntity<?> alterarContato(@Valid @PathVariable("id") Long id,
                                            @RequestBody ContatoRequest contatoRequest) {
        // ResponseEntitty<?> - objeto que representa a resposta http e
        // "?" significa que o tipo do retorno é indefinido
        // pega o valor passado na url e o transforma na variavel Long id
        // @RequestBody pega os valores atribuidos o JSON pelo usuario e os converte para um objeto java
        return ResponseEntity.ok(contatoService.alterarContato(id, contatoRequest));
        // ResponseEntity.ok - retorna um status http 200
    }

    // deletar contato da agenda por id - delete
    @DeleteMapping("/{id}") // anotacao que indica que o metodo é do tipo delete
    // "/{id}" - o id do objeto deve ser passado na url
    public ResponseEntity<?> deletarContato(@PathVariable("id") Long id) {
        // ResponseEntitty<?> - objeto que representa a resposta http e
        // "?" significa que o tipo do retorno é indefinido
        // pega o valor passado na url e o transforma na variavel Long id
        return ResponseEntity.ok(contatoService.deletarContato(id));
        // ResponseEntity.ok - retorna um status http 200
    }
}
