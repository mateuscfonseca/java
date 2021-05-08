package com.mateus.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class FabricaDeConsultas {
    
    final EntityManagerFactory emf;
    
    public FabricaDeConsultas() {
	this.emf = Persistence.createEntityManagerFactory("postgres");
    }
    
    public JPAQueryFactory queryFactory() {
        var em = this.entityManager();
	var queryFactory = new JPAQueryFactory(em);	
	
	return queryFactory;
    }
    
    public EntityManager entityManager(){
       return this.emf.createEntityManager();
    }

}
