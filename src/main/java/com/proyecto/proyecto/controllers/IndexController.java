package com.proyecto.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.proyecto.models.Usuario;

@Controller
@RequestMapping({ "/principal" })
public class IndexController {

    @GetMapping({ "/hola", "/", "" })
    public ModelAndView index(ModelAndView map) {

        map.addObject("mensaje", "Este es un mansaje muy especial para ti !!!");
        map.addObject("titulo", "El titulo si se puede cambiar");
        map.setViewName("index");

        return map;
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {

        Usuario usuario = new Usuario();
        usuario.setNombre("Nicolas");
        usuario.setApellido("Ruiz");
        model.addAttribute("usuario", usuario.getNombre());
        return "perfil";
    }
}