package com.proyecto.proyecto.controllers;

import com.proyecto.proyecto.DTO.UsuariosDTO;
import com.proyecto.proyecto.entities.Usuarios;
import com.proyecto.proyecto.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/usuarios"})
public class UsuariosController {


    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/agregar")
    public ResponseEntity<Usuarios> agregarUser(@RequestBody Usuarios usuario) {


        return new ResponseEntity<>(usuariosRepository.save(usuario), HttpStatus.OK);

    }

    @DeleteMapping("/eliminar")
    public void eliminarUser() {

    }

    @GetMapping("/usuarios")
    public List<Usuarios> Usuarios() {

        List<Usuarios> usuariosList = new ArrayList<>();
        usuariosList = usuariosRepository.findAll();

        return usuariosList;
    }
}
