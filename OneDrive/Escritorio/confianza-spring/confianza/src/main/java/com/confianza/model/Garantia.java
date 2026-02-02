package com.confianza.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Entidad Garantia
 * Representa las garantías registradas en el sistema ConFianza
 */
@Entity
@Table(name = "garantias")
public class Garantia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del producto
    @Column(nullable = false)
    private String producto;

    // Fecha de compra
    @Column(name = "fecha_compra", nullable = false)
    private LocalDate fechaCompra;

    // Fecha de vencimiento de la garantía
    @Column(name = "fecha_vencimiento", nullable = false)
    private LocalDate fechaVencimiento;

    // Estado de la garantía (ACTIVA / VENCIDA)
    @Column(nullable = false)
    private String estado;

    // Constructor vacío (obligatorio para JPA)
    public Garantia() {
    }

    // Constructor con parámetros
    public Garantia(String producto, LocalDate fechaCompra, LocalDate fechaVencimiento, String estado) {
        this.producto = producto;
        this.fechaCompra = fechaCompra;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}