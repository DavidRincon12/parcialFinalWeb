package com.example.parcialFinalWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcialFinalWeb.entities.Proyecto;
import com.example.parcialFinalWeb.repositories.ProyectoRepository;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    public Proyecto updateProyecto(Integer id, Proyecto proyectoDetails) {
        return proyectoRepository.findById(id).map(proyecto -> {
            proyecto.setNombre(proyectoDetails.getNombre());
            proyecto.setLineaId(proyectoDetails.getLineaId());
            proyecto.setObjetivoGeneral(proyectoDetails.getObjetivoGeneral());
            proyecto.setResponsableId(proyectoDetails.getResponsableId());
            proyecto.setFechaInicio(proyectoDetails.getFechaInicio());
            proyecto.setFechaFin(proyectoDetails.getFechaFin());
            return proyectoRepository.save(proyecto);
        }).orElse(null);
    }
}

