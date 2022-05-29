package br.com.unisagrado.infofarma.model;

import java.io.Serializable;

public class Orientacao implements Serializable {
    private final String titulo;
    private final String descricao;

    public Orientacao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
