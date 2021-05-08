package com.mateus.persistencia;

import com.mateus.modelos.QUsuario;
import com.mateus.modelos.Usuario;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class UsuarioDao extends DaoAbstrata {


    public UsuarioDao(JPAQueryFactory queryFactory) {
        super(queryFactory);
    }

    public Usuario achar(Long id) {
        QUsuario qUsuario = QUsuario.usuario;

        Usuario usuario = this.queryFactory.selectFrom(qUsuario)
                                .where(qUsuario.login.eq("mateuscfonseca"))
                                .fetchOne();
        
        return usuario;

    }

}
