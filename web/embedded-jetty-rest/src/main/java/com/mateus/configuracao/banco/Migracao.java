package com.mateus.configuracao.banco;

import java.io.InputStream;
import java.util.stream.IntStream;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mateus.persistencia.FabricaDeConsultas;
import com.mateus.utilitarios.FileUtils;

public class Migracao {

    final int    versao;
    final String caminhoDDLs = "/scripts/DDL/";

    public Migracao() {
        versao = 0;
    }

    public Migracao(int versao) {
        this.versao = versao;
    }

    public void aplicar() {
        final var em = new FabricaDeConsultas().entityManager();

        try {
            IntStream.rangeClosed(0, versao)
                     .mapToObj(v -> String.format("%d.sql", v))
                     .map(this::abrirRecurso)
                     .map(FileUtils::parseStream)
                     .forEach(script -> executar(script, em));
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }

    }

    private void executar(String script, EntityManager em) {
        Query nq = em.createNativeQuery(script);
        em.getTransaction().begin();
        nq.executeUpdate();
        em.getTransaction().commit();

    }

    private InputStream abrirRecurso(String nomeArquivo) {
        final var caminhoCompleto = String.format("%s%s",
                this.caminhoDDLs, nomeArquivo);
        var is = Migracao.class.getResourceAsStream(caminhoCompleto);
        return is;
    }

}
