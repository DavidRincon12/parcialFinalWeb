package com.example.parcialFinalWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcialFinalWeb.repositories.SemilleroRepository;

@Service
public class SemilleroService {
    @Autowired
    private SemilleroRepository semilleroRepository;

    public List<Semillero> listarSemilleros() {
        return semilleroRepository.findAll();
    }
}

