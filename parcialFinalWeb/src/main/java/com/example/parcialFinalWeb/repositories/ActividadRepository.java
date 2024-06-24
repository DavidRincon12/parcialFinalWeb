package com.example.parcialFinalWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcialFinalWeb.entities.Actividad;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long> {
}

