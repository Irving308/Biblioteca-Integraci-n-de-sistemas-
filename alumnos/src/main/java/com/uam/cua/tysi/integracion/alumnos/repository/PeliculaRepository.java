package com.uam.cua.tysi.integracion.alumnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uam.cua.tysi.integracion.alumnos.entity.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    // Buscar por título
    List<Pelicula> findByTitulo(String titulo);

    // Buscar por director
    List<Pelicula> findByDirector(String director);

    // Buscar por título ignorando mayúsculas
    List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
}