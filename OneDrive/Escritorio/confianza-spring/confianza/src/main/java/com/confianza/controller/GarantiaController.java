package com.confianza.controller;

import com.confianza.model.Garantia;
import com.confianza.service.GarantiaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST del módulo Garantías
 * Expone los endpoints del sistema ConFianza
 */
@RestController
@RequestMapping("/api/garantias")
public class GarantiaController {

    private final GarantiaService garantiaService;

    // Inyección del servicio
    public GarantiaController(GarantiaService garantiaService) {
        this.garantiaService = garantiaService;
    }

    /**
     * Registrar una nueva garantía
     */
    @PostMapping
    public Garantia registrarGarantia(@RequestBody Garantia garantia) {
        return garantiaService.registrarGarantia(garantia);
    }

    /**
     * Listar todas las garantías
     */
    @GetMapping
    public List<Garantia> listarGarantias() {
        return garantiaService.listarGarantias();
    }
}