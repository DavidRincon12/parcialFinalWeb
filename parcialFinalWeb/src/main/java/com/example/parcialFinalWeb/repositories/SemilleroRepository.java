package com.example.parcialFinalWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcialFinalWeb.entities.Semillero;

@Repository
public interface SemilleroRepository extends JpaRepository<Semillero, Long> {
}

