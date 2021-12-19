package com.mateus.recursos;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mateus.health.ImplHealthCheck;

import org.eclipse.microprofile.health.HealthCheck;

@Path("/health")
public class Health {
    
    private final HealthCheck checker;
    public Health() {
        this.checker = new ImplHealthCheck();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response health(){
        final var check = this.checker.call();
        final var res = new Object() {
            final public String name = check.getName();
            final public Map<String, Object> data = check.getData().orElse(new HashMap<>());
        };
        return Response.ok(res).build();
    }
}
