package com.uam.cua.tysi.integracion.alumnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uam.cua.tysi.integracion.alumnos.entity.Manga;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {

    // Buscar por título
    List<Manga> findByTitulo(String titulo);

    // Buscar por mangaka
    List<Manga> findByMangaka(String mangaka);

    // Buscar por tomo
    List<Manga> findByTomo(Integer tomo);

    // Buscar por título ignorando mayúsculas
    List<Manga> findByTituloContainingIgnoreCase(String titulo);
}