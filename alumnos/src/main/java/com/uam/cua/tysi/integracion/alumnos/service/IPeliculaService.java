package com.uam.cua.tysi.integracion.alumnos.service;

import java.util.List;

import com.uam.cua.tysi.integracion.alumnos.dto.PeliculaDTO;

public interface IPeliculaService {
    List<PeliculaDTO> getAll();
    PeliculaDTO getById(Long id);
    PeliculaDTO create(PeliculaDTO dto);
    PeliculaDTO update(Long id, PeliculaDTO dto);
    void delete(Long id);
    List<PeliculaDTO> getByDirector(String director);
    List<PeliculaDTO> getByTitulo(String titulo);
}