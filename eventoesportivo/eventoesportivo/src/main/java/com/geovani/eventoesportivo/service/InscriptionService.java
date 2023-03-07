package com.geovani.eventoesportivo.service;

import com.geovani.eventoesportivo.config.DozzerMapperConfig;
import com.geovani.eventoesportivo.dto.InscricaoDto;
import com.geovani.eventoesportivo.dto.InscricaoSaveDto;
import com.geovani.eventoesportivo.entity.Inscricao;
import com.geovani.eventoesportivo.repository.EventoRepository;
import com.geovani.eventoesportivo.repository.InscricaoRepository;
import com.geovani.eventoesportivo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EventoRepository eventoRepository;


    public List<InscricaoDto> findAll() {
        //return inscricaoRepository.findAll().stream().map(InscricaoDto::mapper).toList();
        return DozzerMapperConfig.parseListObject(inscricaoRepository.findAll(), InscricaoDto.class);
    }

    public InscricaoDto save(InscricaoSaveDto inscricao) {
        var usu = usuarioRepository.findById(inscricao.getUsuarioId());
        var even = eventoRepository.findById(inscricao.getEventoId());
        Inscricao inscricaao = new Inscricao(null, usu.get(), even.get());
        var dozzer = DozzerMapperConfig.parseObject(inscricaoRepository.save(inscricaao), InscricaoDto.class);
        return dozzer;
    }

}
