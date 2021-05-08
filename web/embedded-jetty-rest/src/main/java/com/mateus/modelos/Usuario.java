package com.mateus.modelos;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", schema = "public")
public class Usuario {
    @Id
    @GeneratedValue
    public Long id;

    public String login;
    public String apelido;
    public String senha;
    
    public LocalDateTime criacao;
    public LocalDateTime edicao;
}
