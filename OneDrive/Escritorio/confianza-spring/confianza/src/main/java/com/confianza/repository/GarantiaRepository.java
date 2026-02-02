package com.confianza.repository;

import com.confianza.model.Garantia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de Garantía
 * Permite realizar operaciones CRUD sobre la entidad Garantia
 */
public interface GarantiaRepository extends JpaRepository<Garantia, Long> {
}