package com.example.demo.controllers;

import com.example.demo.entities.Pessoa;
import com.example.demo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nomes")
public class PessoaController {
    @Autowired
    private PessoaService service;


    @GetMapping("/listar")
    public List<Pessoa> listar() {
        return service.listar();
    }


    @PostMapping("/criar")
    public void criar(@RequestBody Pessoa pessoa) {
        service.salvar(pessoa);
    }
}
