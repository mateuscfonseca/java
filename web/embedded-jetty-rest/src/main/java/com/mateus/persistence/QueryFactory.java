package com.mateus.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class QueryFactory {
    
    final EntityManagerFactory emf;
    
    public QueryFactory() {
	this.emf = Persistence.createEntityManagerFactory("postgres");
    }
    
    public JPAQueryFactory queryFactory() {
	EntityManager em = this.emf.createEntityManager();
	JPAQueryFactory queryFactory = new JPAQueryFactory(em);	
	
	return queryFactory;
    }

}
