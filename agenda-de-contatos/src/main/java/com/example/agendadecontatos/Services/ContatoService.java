package com.example.agendadecontatos.Services;

import com.example.agendadecontatos.DTOs.ContatoRequest;
import com.example.agendadecontatos.DTOs.ContatoResponse;
import com.example.agendadecontatos.entities.Contato;
import com.example.agendadecontatos.repositories.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // indica que a classe é um serviço, é onde fica a logica de negocios do codigo
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    // logica do metodo que permite adicionar contatos a agenda - post
    public ContatoRequest adicionarContato(ContatoRequest request){
        Contato contato = new Contato(); // cria uma nova instancia da classe Contato
        contato.setNome(request.getNome()); // atribui o valor do nome para o contato
        contato.setTelefone(request.getTelefone());
        contato.setEmail(request.getEmail());
        // o metodo pega os dados passados pelo usuario e os repassa para o objeto contato

        contatoRepository.save(contato);
        // salva os valores passados ao objeto contato no banco de dados
        return request;
    }

    // logica do metodo que permite listar todos os contatos da agenda - get
    public List<ContatoResponse> listarContatos() {
        return contatoRepository.findAll().stream()
                .map(contato -> new ContatoResponse(
        // contatoRepository.findAll() = puxa uma lista do banco de dados como todos os contatos
        // .stream() = tansforma a lista em um fluxo de dados, permite manipulalos de forma mais funcional
        // metodo .map() pega cada elemento do fluxo (contato) e cria uma nova instância (new) de ContatoResponse.
                contato.getId(),
                contato.getNome(),
                contato.getTelefone(),
                contato.getEmail()
        )).toList(); // converte todos os novos objetos e os converte para uma lista
    }

    // logica do metodo que permite listar um contato pelo id - get
    public ContatoResponse buscarId(Long id){
        // exige o id do objeto que sera visualizado individualmente
        Optional<Contato> contato = contatoRepository.findById(id);
        // procura no banco de dados um objeto que tenha o id indicado
        ContatoResponse contatoResponse = new ContatoResponse(contato);
        // cria um novo objeto que traz os dados que serão exibidos do objeto do id indicado
        return contatoResponse;
    }

    // logica do metodo que permite alterar o contato da agenda através do seu id - put
    public String alterarContato(Long id, ContatoRequest contatoAlterado){
        // exige o id do objeto que sera alterado e um objeto ContatoRequest que ira receber os novos valores
        Contato contato = contatoRepository.findById(id).orElseThrow(); // orElseThrow() - exibe um erro caso não haja nenhum objeto com o id indicado
        // busca no banco de dados um objeto pelo id indicado na url

        contato.setNome(contatoAlterado.getNome());
        // pega o valor atribuido ao contatoAlterado e substitui pelo valor antigo do contato
        contato.setTelefone(contatoAlterado.getTelefone());
        contato.setEmail(contatoAlterado.getEmail());

        contatoRepository.save(contato);
        // salva no banco de dados todos os valores atribuidos ao objeto contato
        return "Contato alterado!";
    }

    // logica do metodo que permite deletar um contato da agenda
    public String deletarContato(Long id){ // exige o id do contato que sera excluido
        Optional<Contato> contato = contatoRepository.findById(id);
        //procura por um objeto contato com o id indicado no banco de dados

        if (contato.isEmpty()) { // se o objeto com o id indicado for nulo (não existir), um erro é exibido
            return "O contato não existe";
        } else { // senão (existir) o contato com o id indicado é deletado da agenda
            contatoRepository.deleteById(id); // deleta o objeto com o id indicado do banco de dados
            return "Você deletou esse contato";
        }
    }
}