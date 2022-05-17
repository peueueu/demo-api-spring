package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="NOME", nullable = false)
    private String nome;

    @Column(name="IDADE")
    private Integer idade;

    @Column(name="ATIVO")
    private Boolean ativo;
    @Column(name="DATA_CRIACAO")
    private LocalDateTime dataCriacao;

    @PrePersist
    private void setup(){
        this.ativo = false;
        this.dataCriacao = LocalDateTime.now();
    }
}
