package com.confianza.service;

import com.confianza.model.Garantia;
import com.confianza.repository.GarantiaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Servicio de Garantías
 * Contiene la lógica de negocio del módulo ConFianza
 */
@Service
public class GarantiaService {

    private final GarantiaRepository garantiaRepository;

    // Inyección de dependencias por constructor
    public GarantiaService(GarantiaRepository garantiaRepository) {
        this.garantiaRepository = garantiaRepository;
    }

    /**
     * Registra una nueva garantía
     */
    public Garantia registrarGarantia(Garantia garantia) {

        // Lógica básica: definir estado según fecha de vencimiento
        if (garantia.getFechaVencimiento().isBefore(LocalDate.now())) {
            garantia.setEstado("VENCIDA");
        } else {
            garantia.setEstado("ACTIVA");
        }

        return garantiaRepository.save(garantia);
    }

    /**
     * Lista todas las garantías registradas
     */
    public List<Garantia> listarGarantias() {
        return garantiaRepository.findAll();
    }
}