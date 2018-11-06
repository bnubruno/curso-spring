package com.github.bnubruno.cursospring.controller;

import com.github.bnubruno.cursospring.model.Usuario;
import com.github.bnubruno.cursospring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/usuario")
    public void create(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @GetMapping("/usuario")
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable("id") Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

}
