package com.geovani.eventoesportivo.controllers;

import com.geovani.eventoesportivo.dto.InscricaoDto;
import com.geovani.eventoesportivo.entity.Inscricao;
import com.geovani.eventoesportivo.repository.EventoRepository;
import com.geovani.eventoesportivo.repository.InscricaoRepository;
import com.geovani.eventoesportivo.repository.UsuarioRepository;
import com.geovani.eventoesportivo.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<Inscricao> save(@RequestBody InscricaoDto inscricao) throws Exception {
        var usu = usuarioRepository.findById(inscricao.getUsuarioId().getId());
        var even = eventoRepository.findById(inscricao.getEventoId().getId());

        Inscricao inscricao1 = new Inscricao(null, usu.get(), even.get());

        var vo = inscricaoRepository.save(inscricao1);
        return ResponseEntity.ok().build();
    }

    //4. O usuário poderá convidar outros usuários para participar dos eventos.
}
