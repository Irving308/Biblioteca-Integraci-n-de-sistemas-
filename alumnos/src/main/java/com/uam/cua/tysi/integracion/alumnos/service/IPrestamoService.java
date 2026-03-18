package com.uam.cua.tysi.integracion.alumnos.service;

import java.util.List;
import com.uam.cua.tysi.integracion.alumnos.dto.PrestamoDTO;

public interface IPrestamoService {
    List<PrestamoDTO> getAll();
    PrestamoDTO getById(Integer id);
    PrestamoDTO create(PrestamoDTO dto);
    PrestamoDTO update(Integer id, PrestamoDTO dto);
    void delete(Integer id);
    List<PrestamoDTO> getByUsuario(Integer idUsuario);
    List<PrestamoDTO> getVencidos();
}