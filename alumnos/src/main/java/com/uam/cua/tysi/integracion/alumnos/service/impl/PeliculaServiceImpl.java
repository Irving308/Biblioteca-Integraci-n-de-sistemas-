package com.uam.cua.tysi.integracion.alumnos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uam.cua.tysi.integracion.alumnos.dto.PeliculaDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Pelicula;
import com.uam.cua.tysi.integracion.alumnos.mapper.PeliculaMapper;
import com.uam.cua.tysi.integracion.alumnos.repository.PeliculaRepository;
import com.uam.cua.tysi.integracion.alumnos.service.IPeliculaService;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<PeliculaDTO> getAll() {
        return peliculaRepository.findAll()
                .stream()
                .map(PeliculaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PeliculaDTO getById(Long id) {
        Pelicula pelicula = peliculaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Película no encontrada con id: " + id));
        return PeliculaMapper.toDTO(pelicula);
    }

    @Override
    public PeliculaDTO create(PeliculaDTO dto) {
        Pelicula pelicula = PeliculaMapper.toEntity(dto);
        return PeliculaMapper.toDTO(peliculaRepository.save(pelicula));
    }

    @Override
    public PeliculaDTO update(Long id, PeliculaDTO dto) {
        peliculaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Película no encontrada con id: " + id));
        Pelicula pelicula = PeliculaMapper.toEntity(dto);
        pelicula.setIdPelicula(id);
        return PeliculaMapper.toDTO(peliculaRepository.save(pelicula));
    }

    @Override
    public void delete(Long id) {
        peliculaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Película no encontrada con id: " + id));
        peliculaRepository.deleteById(id);
    }

    @Override
    public List<PeliculaDTO> getByDirector(String director) {
        return peliculaRepository.findByDirector(director)
                .stream()
                .map(PeliculaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PeliculaDTO> getByTitulo(String titulo) {
        return peliculaRepository.findByTituloContainingIgnoreCase(titulo)
                .stream()
                .map(PeliculaMapper::toDTO)
                .collect(Collectors.toList());
    }
}