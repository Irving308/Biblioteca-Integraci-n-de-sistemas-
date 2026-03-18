package com.uam.cua.tysi.integracion.alumnos.mapper;

import com.uam.cua.tysi.integracion.alumnos.dto.PrestamoDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Libro;
import com.uam.cua.tysi.integracion.alumnos.entity.Manga;
import com.uam.cua.tysi.integracion.alumnos.entity.Pelicula;
import com.uam.cua.tysi.integracion.alumnos.entity.Prestamo;
import com.uam.cua.tysi.integracion.alumnos.entity.Usuario;

public class PrestamoMapper {

    public static PrestamoDTO toDTO(Prestamo prestamo) {
        if (prestamo == null) return null;
        return new PrestamoDTO(
            prestamo.getIdPrestamo(),
            prestamo.getUsuario()  != null ? prestamo.getUsuario().getIdUsuario()   : null,
            prestamo.getLibro()    != null ? prestamo.getLibro().getIdLibro().intValue() : null,
            prestamo.getPelicula() != null ? prestamo.getPelicula().getIdPelicula().intValue() : null,
            prestamo.getManga()    != null ? prestamo.getManga().getIdManga().intValue() : null,
            prestamo.getFechaSalida(),
            prestamo.getFechaEntrega()
        );
    }

    public static Prestamo toEntity(PrestamoDTO dto) {
        if (dto == null) return null;

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(dto.getIdUsuario());

        Libro libro = null;
        if (dto.getIdLibro() != null) {
            libro = new Libro();
            libro.setIdLibro(dto.getIdLibro().longValue());
        }

        Pelicula pelicula = null;
        if (dto.getIdPelicula() != null) {
            pelicula = new Pelicula();
            pelicula.setIdPelicula(dto.getIdPelicula().longValue());
        }

        Manga manga = null;
        if (dto.getIdManga() != null) {
            manga = new Manga();
            manga.setIdManga(dto.getIdManga().longValue());
        }

        return new Prestamo(
            dto.getIdPrestamo(),
            usuario,
            libro,
            pelicula,
            manga,
            dto.getFechaSalida(),
            dto.getFechaEntrega()
        );
    }
}