package com.geovani.eventoesportivo.service;

import com.geovani.eventoesportivo.config.DozzerMapperConfig;
import com.geovani.eventoesportivo.dto.UsuariosDto;
import com.geovani.eventoesportivo.entity.Usuario;
import com.geovani.eventoesportivo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuariosDto findById(Integer id) {
        return DozzerMapperConfig.parseObject(usuarioRepository.findById(id), UsuariosDto.class);
    }

    public List<UsuariosDto> findAll() {
        return DozzerMapperConfig.parseListObject(usuarioRepository.findAll(), UsuariosDto.class);
    }

    public UsuariosDto create(UsuariosDto usuarios) throws Exception {
        if (usuarios == null) throw new Exception("Erro ao criar um usuario!");
        var transformar = DozzerMapperConfig.parseObject(usuarios, Usuario.class);
        return DozzerMapperConfig.parseObject(usuarioRepository.save(transformar), UsuariosDto.class);
    }

    public UsuariosDto update(UsuariosDto usuarios) throws Exception {
        if (usuarios == null) throw new Exception("Erro ao atualizar o usuario!");
        var entity = usuarioRepository.findById(usuarios.getkey())
                .orElseThrow(() -> new Exception("ID NÃO ENCONTRADO"));
        return DozzerMapperConfig.parseObject(usuarioRepository.save(entity), UsuariosDto.class);

    }

    public void delete(Integer id) {
        var entity = usuarioRepository.findById(id).get();
        usuarioRepository.delete(entity);
    }

}
