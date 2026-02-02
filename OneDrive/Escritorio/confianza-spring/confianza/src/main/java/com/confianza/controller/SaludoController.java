package com.confianza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/")
    public String inicio() {
        return "Confianza backend funcionando 🚀";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Paula, Spring Boot está listo 💙";
    }
}