package com.geovani.eventoesportivo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.geovani.eventoesportivo.entity.Evento;
import com.geovani.eventoesportivo.entity.Inscricao;
import com.geovani.eventoesportivo.entity.Usuario;
import com.github.dozermapper.core.Mapping;

public class InscricaoDto {

    @Mapping("usuario")
    private Usuario usuarioId;

    @Mapping("evento")
    private Evento eventoId;


    public InscricaoDto() {
    }

    public InscricaoDto(Usuario usuarioId, Evento eventoId) {
        this.usuarioId = usuarioId;
        this.eventoId = eventoId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Evento getEventoId() {
        return eventoId;
    }

    public void setEventoId(Evento eventoId) {
        this.eventoId = eventoId;
    }

       // http:localhost:8080?user=10?action=associate?event=10

    }


