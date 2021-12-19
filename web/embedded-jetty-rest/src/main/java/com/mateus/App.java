package com.mateus;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("/rs")
public class App extends ResourceConfig {

  public App() {
    packages("com.mateus.recursos;");
    packages("com.mateus.health;");
    register(JacksonFeature.class);
    register(MultiPartFeature.class);
    property(ServerProperties.WADL_FEATURE_DISABLE, true);
  }
}
