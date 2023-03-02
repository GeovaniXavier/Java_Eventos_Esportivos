package com.geovani.eventoesportivo.controllers;

import com.geovani.eventoesportivo.dto.EventosDto;
import com.geovani.eventoesportivo.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {


    @Autowired
    private EventoService eventoService;

    @GetMapping(value = "/{id}")
    public EventosDto findById(@PathVariable(value = "id") Integer id) {
        return eventoService.findById(id);
    }

    @GetMapping
    public List<EventosDto> findAll(EventosDto eventosDto) {
        return eventoService.findAll();
    }

    @PostMapping
    public ResponseEntity<EventosDto> create(@RequestBody EventosDto eventosDto) throws Exception {
        var cria = eventoService.create(eventosDto);
        return new ResponseEntity<>(cria, HttpStatus.CREATED);
    }

    @PutMapping
    public EventosDto update(@RequestBody EventosDto eventosDto) throws Exception {
        return eventoService.update(eventosDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        eventoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
