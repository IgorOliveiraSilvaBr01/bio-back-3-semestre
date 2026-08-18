package com.example.agendadecontatos.repositories;

import com.example.agendadecontatos.entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// o repository faz a comunicacao entre o codigo e o banco de dados
@Repository // indica que a interface é um repositorio
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
