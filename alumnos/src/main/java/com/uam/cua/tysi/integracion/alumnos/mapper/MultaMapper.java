package com.uam.cua.tysi.integracion.alumnos.mapper;

import com.uam.cua.tysi.integracion.alumnos.dto.MultaDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Multa;
import com.uam.cua.tysi.integracion.alumnos.entity.Prestamo;

public class MultaMapper {

    public static MultaDTO toDTO(Multa multa) {
        if (multa == null) return null;
        return new MultaDTO(
            multa.getIdMulta(),
            multa.getPrestamo() != null ? multa.getPrestamo().getIdPrestamo() : null,
            multa.getMonto(),
            multa.getPagado()
        );
    }

    public static Multa toEntity(MultaDTO dto) {
        if (dto == null) return null;
        Prestamo prestamo = new Prestamo();
        prestamo.setIdPrestamo(dto.getIdPrestamo());

        return new Multa(
            dto.getIdMulta(),
            prestamo,
            dto.getMonto(),
            dto.getPagado()
        );
    }
}