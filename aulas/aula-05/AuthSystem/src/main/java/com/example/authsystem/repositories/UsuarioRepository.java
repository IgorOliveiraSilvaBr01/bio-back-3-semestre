package com.example.authsystem.repositories;

import com.example.authsystem.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail (String email);
    // metodo criado manualmente para procurar email no sistema
}
