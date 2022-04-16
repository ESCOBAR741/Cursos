package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UsuarioController {

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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(01L);
        usuario.setNombre("Denilson");
        usuario.setApellido("Escobar");
        usuario.setEmail("denilsonescobar741@gmail.com");
        usuario.setTelefono("979841526");

        Usuario usuario2 = new Usuario();
        usuario2.setId(02L);
        usuario2.setNombre("Lucas");
        usuario2.setApellido("Moy");
        usuario2.setEmail("lucasmoy@hotmail.com");
        usuario2.setTelefono("982042760");

        Usuario usuario3 = new Usuario();
        usuario3.setId(03L);
        usuario3.setNombre("Maria");
        usuario3.setApellido("Hernandez");
        usuario3.setEmail("maria@gmail.com");
        usuario3.setTelefono("966986501");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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