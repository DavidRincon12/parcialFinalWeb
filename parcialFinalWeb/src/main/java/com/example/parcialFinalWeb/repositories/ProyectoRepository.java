package com.example.parcialFinalWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcialFinalWeb.entities.Estudiante;

@Repository
public interface ProyectoRepository extends JpaRepository<Estudiante, Long> {
}

