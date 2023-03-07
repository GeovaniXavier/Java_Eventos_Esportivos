package com.geovani.eventoesportivo.dto;

import com.geovani.eventoesportivo.entity.Evento;
import com.geovani.eventoesportivo.entity.Usuario;
import com.github.dozermapper.core.Mapping;

public class InscricaoDto {

    @Mapping("usuario")
    private Usuario usuario;

    @Mapping("evento")
    private Evento evento;


    public InscricaoDto() {
    }

    public InscricaoDto(Usuario usuario, Evento evento) {
        this.usuario = usuario;
        this.evento = evento;
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