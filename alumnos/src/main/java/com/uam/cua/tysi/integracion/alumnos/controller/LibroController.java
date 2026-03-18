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

import com.uam.cua.tysi.integracion.alumnos.dto.LibroDTO;
import com.uam.cua.tysi.integracion.alumnos.service.ILibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private ILibroService libroService;

    @GetMapping("/mensaje")
    public ResponseEntity<String> getMensaje() {
        return ResponseEntity.ok("Página de Libros");
    }

    @GetMapping
    public ResponseEntity<List<LibroDTO>> getAll() {
        return ResponseEntity.ok(libroService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(libroService.getById(id));
    }

    @PostMapping
    public ResponseEntity<LibroDTO> create(@RequestBody LibroDTO libroDTO) {
        return ResponseEntity.ok(libroService.create(libroDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibroDTO> update(@PathVariable Long id, @RequestBody LibroDTO libroDTO) {
        return ResponseEntity.ok(libroService.update(id, libroDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        libroService.delete(id);
        return ResponseEntity.noContent().build();
    }
}