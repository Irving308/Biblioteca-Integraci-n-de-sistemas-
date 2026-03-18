package com.uam.cua.tysi.integracion.alumnos.service;

import java.util.List;
import com.uam.cua.tysi.integracion.alumnos.dto.MultaDTO;

public interface IMultaService {
    List<MultaDTO> getAll();
    MultaDTO getById(Long id);
    MultaDTO create(MultaDTO dto);
    MultaDTO update(Long id, MultaDTO dto);
    void delete(Long id);
    List<MultaDTO> getByPrestamo(Integer idPrestamo);
    List<MultaDTO> getByPagado(Boolean pagado);
}