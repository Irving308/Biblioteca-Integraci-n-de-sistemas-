package com.uam.cua.tysi.integracion.alumnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uam.cua.tysi.integracion.alumnos.entity.Multa;

@Repository
public interface MultaRepository extends JpaRepository<Multa, Long> {

    // Buscar multas por préstamo
    List<Multa> findByPrestamoIdPrestamo(Integer idPrestamo);

    // Buscar multas pagadas o no pagadas
    List<Multa> findByPagado(Boolean pagado);

    // Buscar multas de un préstamo que estén pagadas o no
    List<Multa> findByPrestamoIdPrestamoAndPagado(Integer idPrestamo, Boolean pagado);
}