package com.example.parcialFinalWeb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcialFinalWeb.entities.Semillero;
import com.example.parcialFinalWeb.repositories.SemilleroRepository;

@Service
public class SemilleroService {

    @Autowired
    private SemilleroRepository semilleroRepository;

    public List<Semillero> getAllSemilleros() {
        return semilleroRepository.findAll();
    }
}

