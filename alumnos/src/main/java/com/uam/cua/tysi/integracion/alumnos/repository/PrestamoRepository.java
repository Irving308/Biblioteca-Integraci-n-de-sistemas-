package com.uam.cua.tysi.integracion.alumnos.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uam.cua.tysi.integracion.alumnos.entity.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

    // Buscar préstamos por usuario
    List<Prestamo> findByUsuarioIdUsuario(Integer idUsuario);

    // Buscar préstamos por libro
    List<Prestamo> findByLibroIdLibro(Long idLibro);

    // Buscar préstamos por película
    List<Prestamo> findByPeliculaIdPelicula(Long idPelicula);

    // Buscar préstamos por manga
    List<Prestamo> findByMangaIdManga(Long idManga);

    // Buscar préstamos por fecha de salida
    List<Prestamo> findByFechaSalida(LocalDate fechaSalida);

    // Buscar préstamos por fecha de entrega
    List<Prestamo> findByFechaEntrega(LocalDate fechaEntrega);

    // Buscar préstamos vencidos (fecha entrega anterior a hoy)
    List<Prestamo> findByFechaEntregaBefore(LocalDate fecha);
}