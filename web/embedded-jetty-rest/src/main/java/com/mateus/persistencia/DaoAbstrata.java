package com.mateus.persistencia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class DaoAbstrata {
    
    final Logger logger;
    final JPAQueryFactory queryFactory;
    
    public DaoAbstrata(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
        this.logger = LogManager.getRootLogger();
    }
    
    

}
