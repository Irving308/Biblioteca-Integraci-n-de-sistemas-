package com.uam.cua.tysi.integracion.alumnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uam.cua.tysi.integracion.alumnos.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    // Buscar por título
    List<Libro> findByTitulo(String titulo);

    // Buscar por autor
    List<Libro> findByAutor(String autor);

    // Buscar por título ignorando mayúsculas
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
}