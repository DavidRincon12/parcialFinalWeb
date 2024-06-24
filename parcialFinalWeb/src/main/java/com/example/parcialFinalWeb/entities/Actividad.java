package com.example.parcialFinalWeb.entities;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    private String actividad;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private String resultado;
    private String producto;

    @ManyToOne
    @JoinColumn(name = "responsable_id")
    private Integrante responsable;
}

