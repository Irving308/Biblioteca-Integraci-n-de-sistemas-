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

import com.uam.cua.tysi.integracion.alumnos.dto.PrestamoDTO;
import com.uam.cua.tysi.integracion.alumnos.service.IPrestamoService;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    @Autowired
    private IPrestamoService prestamoService;

    @GetMapping("/mensaje")
    public ResponseEntity<String> getMensaje() {
        return ResponseEntity.ok("Página de Préstamos");
    }

    @GetMapping
    public ResponseEntity<List<PrestamoDTO>> getAll() {
        return ResponseEntity.ok(prestamoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrestamoDTO> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(prestamoService.getById(id));
    }

    @PostMapping
    public ResponseEntity<PrestamoDTO> create(@RequestBody PrestamoDTO prestamoDTO) {
        return ResponseEntity.ok(prestamoService.create(prestamoDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PrestamoDTO> update(@PathVariable Integer id, @RequestBody PrestamoDTO prestamoDTO) {
        return ResponseEntity.ok(prestamoService.update(id, prestamoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        prestamoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}