package com.example.security.services;

import com.example.security.dtos.ClienteRequest;
import com.example.security.entities.Cliente;
import com.example.security.entities.Role;
import com.example.security.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public String createCliente(ClienteRequest request){
        Cliente cliente = new Cliente();
        cliente.setNome(request.getNome());
        cliente.setEmail(request.getEmail());
        cliente.setSenha(request.getSenha());

        if (request.getRole() == null) {
            cliente.setRole(Role.USER);
        } else {
            cliente.setRole(request.getRole());
        }

        clienteRepository.save(cliente);
        return "Usuário criado com sucesso";
    }

}
