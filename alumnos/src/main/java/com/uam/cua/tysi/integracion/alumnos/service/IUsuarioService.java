package com.uam.cua.tysi.integracion.alumnos.service;

import java.util.List;

import com.uam.cua.tysi.integracion.alumnos.dto.UsuarioDTO;

public interface IUsuarioService {
    List<UsuarioDTO> getAll();
    UsuarioDTO getById(Integer id);
    UsuarioDTO create(UsuarioDTO dto);
    UsuarioDTO update(Integer id, UsuarioDTO dto);
    void delete(Integer id);
    UsuarioDTO getByMatricula(String matricula);
    List<UsuarioDTO> getByDivision(String division);
}