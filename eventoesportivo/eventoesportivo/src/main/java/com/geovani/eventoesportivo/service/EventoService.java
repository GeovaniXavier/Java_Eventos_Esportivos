package com.geovani.eventoesportivo.service;

import com.geovani.eventoesportivo.config.DozzerMapperConfig;
import com.geovani.eventoesportivo.dto.EventosDto;
import com.geovani.eventoesportivo.entity.Evento;
import com.geovani.eventoesportivo.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public EventosDto findById(Integer id) {
        return DozzerMapperConfig.parseObject(eventoRepository.findById(id), EventosDto.class);
    }

    public List<EventosDto> findAll() {
        return DozzerMapperConfig.parseListObject(eventoRepository.findAll(), EventosDto.class);
    }

    public EventosDto create(EventosDto eventos) throws Exception {
        if (eventos == null) throw new Exception("Erro ao criar um evento!");
        var transformar = DozzerMapperConfig.parseObject(eventos, Evento.class);
        return DozzerMapperConfig.parseObject(eventoRepository.save(transformar), EventosDto.class);
    }

    public EventosDto update(EventosDto eventos) throws Exception {
        if (eventos == null) throw new Exception("Erro ao atualizar o evento!");
        var entity = eventoRepository.findById(eventos.getkey())
                .orElseThrow(() -> new Exception("ID NÃO ENCONTRADO"));
        return DozzerMapperConfig.parseObject(eventoRepository.save(entity), EventosDto.class);

    }

    public void delete(Integer id) {
        var entity = eventoRepository.findById(id).get();
        eventoRepository.delete(entity);
    }

}
