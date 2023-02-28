package com.geovani.eventoesportivo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.geovani.eventoesportivo.entity.Convite;
import com.geovani.eventoesportivo.entity.Inscricao;
import com.github.dozermapper.core.Mapping;

import java.util.List;

public class UsuariosDto {

    @JsonProperty("id")
    @Mapping("id")
    private Integer key;
    private String nomeCompleto;
    private String apelido;
    private String email;
    private String senha;

    private List<Inscricao> inscricoes;
    private List<Convite> convites;

    public UsuariosDto(Integer key, String nomeCompleto, String apelido, String email, String senha, List<Inscricao> inscricoes, List<Convite> convites) {
        this.key = key;
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.email = email;
        this.senha = senha;
        this.inscricoes = inscricoes;
        this.convites = convites;
    }

    public UsuariosDto() {
    }

    public Integer getkey() {
        return key;
    }

    public void setId(Integer key) {
        this.key = key;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
