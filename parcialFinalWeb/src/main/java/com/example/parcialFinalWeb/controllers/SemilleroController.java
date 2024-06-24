package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcialFinalWeb.services.SemilleroService;

@RestController
@RequestMapping("/api/semilleros")
public class SemilleroController {
    @Autowired
    private SemilleroService semilleroService;

    @GetMapping
    public List<Semillero> listarSemilleros() {
        return semilleroService.listarSemilleros();
    }
}
