package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lineas")
public class LineaController {
    @Autowired
    private LineaService lineaService;

    @DeleteMapping("/{id}")
    public void eliminarLinea(@PathVariable Long id) {
        lineaService.eliminarLinea(id);
    }
}

