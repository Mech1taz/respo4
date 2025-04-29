package com.example.respo4.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.respo4.model.Persona;
import com.example.respo4.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping("/api/personas")
@RestController //devuelve datos :D por eso el Rest

public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String saludar()
    {
        return "Hola esto esta funcionando... o debería uwu";
    }
    @PostMapping 
    public Persona guardar(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
    
}
