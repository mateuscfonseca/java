package com.mateus;

import javax.ws.rs.ApplicationPath;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class Main {
    public static void main(String[] args) {
	
	App config = new App(); 
	ApplicationPath appPath = config.getClass().getAnnotation(ApplicationPath.class);
	Server server = new Server(8080);
	ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(config));	
	ServletContextHandler context = new ServletContextHandler(server, appPath.value());
	context.addServlet(jerseyServlet, "/*");
	
	try {
	    server.start();
	    server.join();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    server.destroy();
	}
    }
}
