package com.mateus.recursos.dto;

import com.mateus.modelos.Usuario;

public class UsuarioDto {

    public Long id;
    public String login;
    public String apelido;
    
    public UsuarioDto() {}
    public UsuarioDto(Usuario usuario)  {
	this.id = usuario.id;
	this.login = usuario.login;
	this.apelido = usuario.apelido;
    }

}
