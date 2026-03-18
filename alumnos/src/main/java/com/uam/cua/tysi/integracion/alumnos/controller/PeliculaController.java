package com.uam.cua.tysi.integracion.alumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uam.cua.tysi.integracion.alumnos.dto.PeliculaDTO;
import com.uam.cua.tysi.integracion.alumnos.service.IPeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private IPeliculaService peliculaService;

    @GetMapping("/mensaje")
    public ResponseEntity<String> getMensaje() {
        return ResponseEntity.ok("Página de Películas");
    }

    @GetMapping
    public ResponseEntity<List<PeliculaDTO>> getAll() {
        return ResponseEntity.ok(peliculaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PeliculaDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(peliculaService.getById(id));
    }

    @PostMapping
    public ResponseEntity<PeliculaDTO> create(@RequestBody PeliculaDTO peliculaDTO) {
        return ResponseEntity.ok(peliculaService.create(peliculaDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PeliculaDTO> update(@PathVariable Long id, @RequestBody PeliculaDTO peliculaDTO) {
        return ResponseEntity.ok(peliculaService.update(id, peliculaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        peliculaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}