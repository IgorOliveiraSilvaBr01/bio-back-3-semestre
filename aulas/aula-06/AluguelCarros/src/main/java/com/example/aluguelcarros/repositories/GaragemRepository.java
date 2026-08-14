package com.example.aluguelcarros.repositories;

import com.example.aluguelcarros.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GaragemRepository extends JpaRepository<Carro, Long> {

}
