package com.mateus.recursos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.mateus.modelos.Usuario;
import com.mateus.recursos.dto.UsuarioDto;
import com.mateus.services.UsuarioService;

@Path("/usuario")
@Provider
public class RecursoUsuario {
    UsuarioService usuarioService;
    
    public RecursoUsuario() {
	this.usuarioService = new UsuarioService();
    }
    
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response user(@PathParam("id") Long id) {
	Usuario user = usuarioService.usuario(id);
	return Response.ok(new UsuarioDto(user)).build();
    }
}
