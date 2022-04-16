package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Denilson");
        usuario.setApellido("Escobar");
        usuario.setEmail("denilsonescobar741@gmail.com");
        usuario.setTelefono("979841526");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Denilson");
        usuario.setApellido("Escobar");
        usuario.setEmail("denilsonescobar741@gmail.com");
        usuario.setTelefono("979841526");
        return usuario;

    }
    @RequestMapping(value = "usuario12")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Denilson");
        usuario.setApellido("Escobar");
        usuario.setEmail("denilsonescobar741@gmail.com");
        usuario.setTelefono("979841526");
        return usuario;
    }
    @RequestMapping(value = "usuario123")
    public Usuario buscar() {
        Usuario  usuario = new Usuario();
        usuario.setNombre("Denilson");
        usuario.setApellido("Escobar");
        usuario.setEmail("denilsonescobar741@gmail.com");
        usuario.setTelefono("979841526");
        return usuario;

    }
}