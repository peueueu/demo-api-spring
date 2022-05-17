package com.example.demo.repositories;

import com.example.demo.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoasRepository extends JpaRepository<Pessoa, Long> {}
