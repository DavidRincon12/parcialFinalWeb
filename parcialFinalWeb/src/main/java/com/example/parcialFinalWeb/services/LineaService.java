package com.example.parcialFinalWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcialFinalWeb.repositories.LineaRepository;

@Service
public class LineaService {

    @Autowired
    private LineaRepository lineaRepository;

    public void eliminarLinea(Long id) {
        lineaRepository.deleteById(id);
    }

  
}

