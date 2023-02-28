package com.geovani.eventoesportivo.controllers;

import com.geovani.eventoesportivo.dto.UsuariosDto;
import com.geovani.eventoesportivo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/{id}")
    public UsuariosDto findById(@PathVariable(value = "id") Integer id) {
        return usuarioService.findById(id);
    }

    @GetMapping
    public List<UsuariosDto> findAll(UsuariosDto usuariosDto) {
        return usuarioService.findAll();
    }

    @PostMapping
    public UsuariosDto create(@RequestBody UsuariosDto usuariosDto) throws Exception {
        return usuarioService.create(usuariosDto);
    }

    @PutMapping
    public UsuariosDto update(@RequestBody UsuariosDto usuariosDto) throws Exception {
        return usuarioService.update(usuariosDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
