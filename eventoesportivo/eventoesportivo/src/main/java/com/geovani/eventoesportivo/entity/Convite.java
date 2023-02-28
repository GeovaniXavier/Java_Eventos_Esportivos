package com.geovani.eventoesportivo.entity;

import jakarta.persistence.*;

@Entity
public class Convite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "convidado_id")
    private Usuario convidado;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setConvidado(Usuario convidado) {
        this.convidado = convidado;
    }

    public Convite() {
    }

    public Convite(Usuario convidado, Evento evento) {
        this.convidado = convidado;
        this.evento = evento;
    }

    public Usuario getConvidado() {
        return convidado;
    }

    public Evento getEvento() {
        return evento;
    }

}