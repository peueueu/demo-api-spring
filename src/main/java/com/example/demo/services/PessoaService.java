package com.example.demo.services;

import com.example.demo.entities.Pessoa;
import com.example.demo.repositories.IPessoasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
        private IPessoasRepository repository;

    public void salvar(Pessoa pessoa) {
        repository.save(pessoa);
    }

    public List<Pessoa> listar() {
        return repository.findAll();
    }
}
