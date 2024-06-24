package com.example.parcialFinalWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcialFinalWeb.entities.Actividad;
import com.example.parcialFinalWeb.repositories.ActividadRepository;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;

    public Actividad createActividad(Actividad actividad) {
        return actividadRepository.save(actividad);
    }
}


