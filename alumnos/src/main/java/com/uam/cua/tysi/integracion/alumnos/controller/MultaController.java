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

import com.uam.cua.tysi.integracion.alumnos.dto.MultaDTO;
import com.uam.cua.tysi.integracion.alumnos.service.IMultaService;

@RestController
@RequestMapping("/multas")
public class MultaController {

    @Autowired
    private IMultaService multaService;

    @GetMapping("/mensaje")
    public ResponseEntity<String> getMensaje() {
        return ResponseEntity.ok("Página de Multas");
    }

    @GetMapping
    public ResponseEntity<List<MultaDTO>> getAll() {
        return ResponseEntity.ok(multaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MultaDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(multaService.getById(id));
    }

    @PostMapping
    public ResponseEntity<MultaDTO> create(@RequestBody MultaDTO multaDTO) {
        return ResponseEntity.ok(multaService.create(multaDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MultaDTO> update(@PathVariable Long id, @RequestBody MultaDTO multaDTO) {
        return ResponseEntity.ok(multaService.update(id, multaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        multaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}