package com.uam.cua.tysi.integracion.alumnos.service;

import java.util.List;
import com.uam.cua.tysi.integracion.alumnos.dto.LibroDTO;

public interface ILibroService {
    List<LibroDTO> getAll();
    LibroDTO getById(Long id);
    LibroDTO create(LibroDTO dto);
    LibroDTO update(Long id, LibroDTO dto);
    void delete(Long id);
    List<LibroDTO> getByAutor(String autor);
    List<LibroDTO> getByTitulo(String titulo);
}