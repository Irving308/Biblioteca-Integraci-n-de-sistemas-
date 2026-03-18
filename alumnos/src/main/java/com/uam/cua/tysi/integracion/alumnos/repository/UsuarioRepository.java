package com.uam.cua.tysi.integracion.alumnos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uam.cua.tysi.integracion.alumnos.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByMatricula(String matricula);
    List<Usuario> findByNombre(String nombre);

    // ✅ Ahora recibe String en lugar de Enum
    List<Usuario> findByDivision(String division);
    List<Usuario> findByNombreContainingIgnoreCase(String nombre);
}