package com.geovani.eventoesportivo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.geovani.eventoesportivo.entity.Convite;
import com.geovani.eventoesportivo.entity.Inscricao;
import com.github.dozermapper.core.Mapping;

import java.util.Date;
import java.util.List;


public class EventosDto {

    @JsonProperty("id")
    @Mapping("id")
    private Integer key;
    private String nome;

    private Date data;

    private String endereco;

    private List<Inscricao> inscricoes;
    private List<Convite> convites;

    public EventosDto(Integer key, String nome, Date data, String endereco, List<Inscricao> inscricoes, List<Convite> convites) {
        this.key = key;
        this.nome = nome;
        this.data = data;
        this.endereco = endereco;
        this.inscricoes = inscricoes;
        this.convites = convites;
    }

    public EventosDto() {
    }

    public Integer getkey() {
        return key;
    }

    public void setkey(Integer key) {
        this.key = key;
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
