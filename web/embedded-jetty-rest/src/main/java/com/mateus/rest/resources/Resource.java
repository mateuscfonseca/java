package com.mateus.rest.resources;



import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.mateus.rest.dto.UserDTO;
import com.mateus.services.Service;

@Path("/hello")
@Provider
public class Resource {
    Service service;
    
    @Inject
    public Resource(Service service) {
	this.service = service;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
	return Response.ok("Olá").build();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response receber(UserDTO dto) {
	return Response.ok(dto).build();
    }
}
