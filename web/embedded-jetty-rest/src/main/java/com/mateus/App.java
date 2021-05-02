package com.mateus;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.mateus.rest.resources.Resource;

@ApplicationPath("/rs")
public class App extends ResourceConfig{
    public App() {
	System.out.println("tey");
	packages("com.mateus.rest;");
	register(Resource.class);
	register(new CDIBinder());
	register(JacksonFeature.class);
	register(MultiPartFeature.class);
    }
}