package com.example.parcialFinalWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcialFinalWeb.entities.Estudiante;
import com.example.parcialFinalWeb.repositories.EstudianteRepository;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante obtenerEstudiante(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }
}

