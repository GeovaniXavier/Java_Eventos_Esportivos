package com.geovani.eventoesportivo.controllers;

import com.geovani.eventoesportivo.dto.InscricaoDto;
import com.geovani.eventoesportivo.dto.InscricaoSaveDto;
import com.geovani.eventoesportivo.repository.EventoRepository;
import com.geovani.eventoesportivo.repository.InscricaoRepository;
import com.geovani.eventoesportivo.repository.UsuarioRepository;
import com.geovani.eventoesportivo.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricao")
public class InscricaoController {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private InscriptionService inscricaoService;

    @GetMapping
    public List<InscricaoDto> findAll() {
        return inscricaoService.findAll();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody InscricaoSaveDto inscricaoSaveDto) throws Exception {
        var cria = inscricaoService.save(inscricaoSaveDto);
        return new ResponseEntity<>(cria, HttpStatus.CREATED);
    }
    //4. O usuário poderá convidar outros usuários para participar dos eventos.
}
