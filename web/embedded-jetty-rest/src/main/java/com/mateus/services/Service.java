package com.mateus.services;

import javax.inject.Singleton;

import com.mateus.modelos.QUser;
import com.mateus.modelos.User;
import com.mateus.persistence.QueryFactory;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Singleton
public class Service extends AbstractService{

    final JPAQueryFactory queryFactory;
    
    public Service() {
	this.logger.info("Service");
	this.queryFactory = new QueryFactory().queryFactory();
    }
    
    public User getUser() {
	QUser user = QUser.user;

	User c = queryFactory.selectFrom(user)
	  .where(user.login.eq("mateus"))
	  .fetchOne();
	
	return c;
    }
    
}
