package com.mateus.persistencia;

import com.querydsl.jpa.impl.JPAQueryFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

  public EntityManager entityManager() {
    return this.emf.createEntityManager();
  }
}
