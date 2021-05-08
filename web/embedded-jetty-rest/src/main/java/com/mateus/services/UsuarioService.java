package com.mateus.services;

import com.mateus.modelos.Usuario;
import com.mateus.persistencia.FabricaDeConsultas;
import com.mateus.persistencia.UsuarioDao;

public class UsuarioService extends ServicoAbstrato {

    final UsuarioDao usuarioDao;

    public UsuarioService() {
        this.logger.info("UsuarioService");
        FabricaDeConsultas fab = new FabricaDeConsultas();
        this.usuarioDao = new UsuarioDao(fab.queryFactory());
    }

    public Usuario usuario(Long id) {
        Usuario usuario = this.usuarioDao.achar(id);
        return usuario;
    }
}
