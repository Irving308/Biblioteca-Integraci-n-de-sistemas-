package com.uam.cua.tysi.integracion.alumnos.mapper;

import com.uam.cua.tysi.integracion.alumnos.dto.PeliculaDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Pelicula;

public class PeliculaMapper {

    public static PeliculaDTO toDTO(Pelicula pelicula) {
        if (pelicula == null) return null;
        return new PeliculaDTO(
            pelicula.getIdPelicula(),
            pelicula.getTitulo(),
            pelicula.getDirector()
        );
    }

    public static Pelicula toEntity(PeliculaDTO dto) {
        if (dto == null) return null;
        return new Pelicula(
            dto.getIdPelicula(),
            dto.getTitulo(),
            dto.getDirector()
        );
    }
}