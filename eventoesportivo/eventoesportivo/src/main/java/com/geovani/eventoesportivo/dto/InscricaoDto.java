package com.geovani.eventoesportivo.dto;

public class InscricaoDto {

    private Integer usuarioId;

    private Integer eventoId;


    public InscricaoDto() {
    }

    public InscricaoDto(Integer usuarioId, Integer eventoId) {
        this.usuarioId = usuarioId;
        this.eventoId = eventoId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getEventoId() {
        return eventoId;
    }

    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }
}
