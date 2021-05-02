package com.mateus.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;

@Singleton
@ApplicationScoped
public class Service extends AbstractService{

    public Service() {
	this.logger.info("Service");
    }
    
}
