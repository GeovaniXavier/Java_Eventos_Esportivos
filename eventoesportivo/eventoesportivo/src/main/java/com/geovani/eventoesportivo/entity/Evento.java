package com.geovani.eventoesportivo.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Date data;

    private String endereco;

    @ManyToMany
    private List<Inscricao> inscricoes;

    @ManyToMany
    private List<Convite> convites;

    public Evento(Integer id, String nome, Date data, String endereco, List<Inscricao> inscricoes, List<Convite> convites) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.endereco = endereco;
        this.inscricoes = inscricoes;
        this.convites = convites;
    }

    public Evento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }

    public List<Convite> getConvites() {
        return convites;
    }

    public void setConvites(List<Convite> convites) {
        this.convites = convites;
    }
}
