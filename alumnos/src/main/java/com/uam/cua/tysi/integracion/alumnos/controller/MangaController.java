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

import com.uam.cua.tysi.integracion.alumnos.dto.MangaDTO;
import com.uam.cua.tysi.integracion.alumnos.service.IMangaService;

@RestController
@RequestMapping("/mangas")
public class    MangaController {

    @Autowired
    private IMangaService mangaService;

    @GetMapping("/mensaje")
    public ResponseEntity<String> getMensaje() {
        return ResponseEntity.ok("Página de Mangas");
    }

    @GetMapping
    public ResponseEntity<List<MangaDTO>> getAll() {
        return ResponseEntity.ok(mangaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MangaDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(mangaService.getById(id));
    }

    @PostMapping
    public ResponseEntity<MangaDTO> create(@RequestBody MangaDTO mangaDTO) {
        return ResponseEntity.ok(mangaService.create(mangaDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MangaDTO> update(@PathVariable Long id, @RequestBody MangaDTO mangaDTO) {
        return ResponseEntity.ok(mangaService.update(id, mangaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mangaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}