package com.uam.cua.tysi.integracion.alumnos.mapper;

import com.uam.cua.tysi.integracion.alumnos.dto.LibroDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Libro;

public class LibroMapper {

    public static LibroDTO toDTO(Libro libro) {
        if (libro == null) return null;
        return new LibroDTO(
            libro.getIdLibro(),
            libro.getTitulo(),
            libro.getAutor()
        );
    }

    public static Libro toEntity(LibroDTO dto) {
        if (dto == null) return null;
        return new Libro(
            dto.getIdLibro(),
            dto.getTitulo(),
            dto.getAutor()
        );
    }
}