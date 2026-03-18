package com.uam.cua.tysi.integracion.alumnos.mapper;

import com.uam.cua.tysi.integracion.alumnos.dto.UsuarioDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        if (usuario == null) return null;
        return new UsuarioDTO(
            usuario.getIdUsuario(),
            usuario.getMatricula(),
            usuario.getNombre(),
            usuario.getDivision()
        );
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        if (dto == null) return null;
        return new Usuario(
            dto.getIdUsuario(),
            dto.getMatricula(),
            dto.getNombre(),
            dto.getDivision()
        );
    }
}