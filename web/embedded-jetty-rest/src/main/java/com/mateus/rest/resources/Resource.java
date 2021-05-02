package com.mateus.rest.resources;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.mateus.modelos.User;
import com.mateus.rest.dto.UserDTO;
import com.mateus.services.Service;

@Path("/hello")
@Provider
public class Resource {
    Service service;
    
    public Resource() {
	this.service = new Service();
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
	return Response.ok("Olá").build();
    }
    
    @Path("/user")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response user() {
	User user = service.getUser();
	return Response.ok(new UserDTO(user)).build();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response receber(UserDTO dto) {
	return Response.ok(dto).build();
    }
}
