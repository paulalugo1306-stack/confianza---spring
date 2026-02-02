package com.confianza.controller;

import com.confianza.model.Cliente;
import com.confianza.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para la gestión de clientes.
 */
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    /**
     * Obtener todos los clientes.
     */
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    /**
     * Registrar un nuevo cliente.
     */
    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}