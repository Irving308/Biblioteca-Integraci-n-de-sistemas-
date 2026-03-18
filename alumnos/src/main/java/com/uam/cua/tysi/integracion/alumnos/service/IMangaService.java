package com.uam.cua.tysi.integracion.alumnos.service;

import java.util.List;
import com.uam.cua.tysi.integracion.alumnos.dto.MangaDTO;

public interface IMangaService {
    List<MangaDTO> getAll();
    MangaDTO getById(Long id);
    MangaDTO create(MangaDTO dto);
    MangaDTO update(Long id, MangaDTO dto);
    void delete(Long id);
    List<MangaDTO> getByMangaka(String mangaka);
    List<MangaDTO> getByTomo(Integer tomo);
    List<MangaDTO> getByTitulo(String titulo);
}