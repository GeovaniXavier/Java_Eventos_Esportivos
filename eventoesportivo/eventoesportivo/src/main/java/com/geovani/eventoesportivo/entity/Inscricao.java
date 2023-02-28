package com.geovani.eventoesportivo.entity;

import jakarta.persistence.*;

@Entity
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;


    public Inscricao(Integer id, Usuario usuario, Evento evento) {
        this.id = id;
        this.usuario = usuario;
        this.evento = evento;
    }

    public Inscricao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}