package br.com.unisagrado.infofarma.model;

import java.io.Serializable;

public class Medicamento implements Serializable {
    private final int id;
    private final String nome;
    private final String descricao;
    private final String descricaoCompleta;

    public Medicamento(int id, String nome, String descricao, String descricaoCompleta) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.descricaoCompleta = descricaoCompleta;
    }

    //somente gets pois não será alterável a informação

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }


}
