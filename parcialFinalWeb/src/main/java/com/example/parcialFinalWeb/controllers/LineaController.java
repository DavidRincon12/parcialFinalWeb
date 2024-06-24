package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcialFinalWeb.services.LineaService;

@RestController
@RequestMapping("/linea")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLinea(@PathVariable Integer id) {
        boolean deleted = lineaService.deleteLinea(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}//xd


