package com.mateus;
import java.util.Set;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.reflections.Reflections;

import com.mateus.services.AbstractService;


public class CDIBinder extends AbstractBinder {

    @Override
    protected void configure() {
	this.bindAllServices();
    }
    
    private void bindAllServices() {
	Set<Class<? extends AbstractService>> classes = this.serviceClasses();
	classes.stream().forEach(this::bindAsContract);
    }
    
    private Set<Class<? extends AbstractService>> serviceClasses(){
	Reflections reflections = new Reflections("com.mateus.services");
	Set<Class<? extends AbstractService>> classes = reflections.getSubTypesOf(AbstractService.class);
	return classes;
    }
}
