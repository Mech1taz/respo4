package com.example.respo4.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/personas")
@RestController //devuelve datos :D por eso el Rest

public class PersonaController {

    @GetMapping
    public String saludar()
    {
        return "Hola esto esta funcionando... o debería uwu";
    }
}
