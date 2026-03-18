package com.uam.cua.tysi.integracion.alumnos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uam.cua.tysi.integracion.alumnos.dto.LibroDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Libro;
import com.uam.cua.tysi.integracion.alumnos.mapper.LibroMapper;
import com.uam.cua.tysi.integracion.alumnos.repository.LibroRepository;
import com.uam.cua.tysi.integracion.alumnos.service.ILibroService;

@Service
public class LibroServiceImpl implements ILibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<LibroDTO> getAll() {
        return libroRepository.findAll()
                .stream()
                .map(LibroMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public LibroDTO getById(Long id) {
        Libro libro = libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado con id: " + id));
        return LibroMapper.toDTO(libro);
    }

    @Override
    public LibroDTO create(LibroDTO dto) {
        Libro libro = LibroMapper.toEntity(dto);
        return LibroMapper.toDTO(libroRepository.save(libro));
    }

    @Override
    public LibroDTO update(Long id, LibroDTO dto) {
        libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado con id: " + id));
        Libro libro = LibroMapper.toEntity(dto);
        libro.setIdLibro(id);
        return LibroMapper.toDTO(libroRepository.save(libro));
    }

    @Override
    public void delete(Long id) {
        libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado con id: " + id));
        libroRepository.deleteById(id);
    }

    @Override
    public List<LibroDTO> getByAutor(String autor) {
        return libroRepository.findByAutor(autor)
                .stream()
                .map(LibroMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<LibroDTO> getByTitulo(String titulo) {
        return libroRepository.findByTituloContainingIgnoreCase(titulo)
                .stream()
                .map(LibroMapper::toDTO)
                .collect(Collectors.toList());
    }
}