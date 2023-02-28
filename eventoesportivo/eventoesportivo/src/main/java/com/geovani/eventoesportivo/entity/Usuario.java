package com.geovani.eventoesportivo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nome")
    private String nomeCompleto;
    private String apelido;
    private String email;
    private String senha;

    @ManyToMany
    private List<Inscricao> inscricoes;

    @ManyToMany
    private List<Convite> convites;

    public Usuario() {
    }

    public Usuario(Integer id, String nomeCompleto, String apelido, String email, String senha, List<Inscricao> inscricoes, List<Convite> convites) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.email = email;
        this.senha = senha;
        this.inscricoes = inscricoes;
        this.convites = convites;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
