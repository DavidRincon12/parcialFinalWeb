package com.example.parcialFinalWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long> {
    
    // Aquí puedes añadir métodos personalizados si los necesitas
    // Por ejemplo:
    // List<Linea> findBySemilleroId(Long semilleroId);
    // Linea findByNombre(String nombre);
}
