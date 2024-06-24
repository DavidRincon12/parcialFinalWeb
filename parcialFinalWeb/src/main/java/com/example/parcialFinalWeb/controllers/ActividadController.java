package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcialFinalWeb.entities.Actividad;
import com.example.parcialFinalWeb.services.ActividadService;

@RestController
@RequestMapping("/api/actividades")
public class ActividadController {
    @Autowired
    private ActividadService actividadService;

    @PostMapping
    public Actividad crearActividad(@	 Actividad actividad) {
        return actividadService.crearActividad(actividad);
    }
}

