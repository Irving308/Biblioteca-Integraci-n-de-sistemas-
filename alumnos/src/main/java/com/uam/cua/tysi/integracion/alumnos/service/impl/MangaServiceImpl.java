package com.uam.cua.tysi.integracion.alumnos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uam.cua.tysi.integracion.alumnos.dto.MangaDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Manga;
import com.uam.cua.tysi.integracion.alumnos.mapper.MangaMapper;
import com.uam.cua.tysi.integracion.alumnos.repository.MangaRepository;
import com.uam.cua.tysi.integracion.alumnos.service.IMangaService;

@Service
public class MangaServiceImpl implements IMangaService {

    @Autowired
    private MangaRepository mangaRepository;

    @Override
    public List<MangaDTO> getAll() {
        return mangaRepository.findAll()
                .stream()
                .map(MangaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MangaDTO getById(Long id) {
        Manga manga = mangaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Manga no encontrado con id: " + id));
        return MangaMapper.toDTO(manga);
    }

    @Override
    public MangaDTO create(MangaDTO dto) {
        Manga manga = MangaMapper.toEntity(dto);
        return MangaMapper.toDTO(mangaRepository.save(manga));
    }

    @Override
    public MangaDTO update(Long id, MangaDTO dto) {
        mangaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Manga no encontrado con id: " + id));
        Manga manga = MangaMapper.toEntity(dto);
        manga.setIdManga(id);
        return MangaMapper.toDTO(mangaRepository.save(manga));
    }

    @Override
    public void delete(Long id) {
        mangaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Manga no encontrado con id: " + id));
        mangaRepository.deleteById(id);
    }

    @Override
    public List<MangaDTO> getByMangaka(String mangaka) {
        return mangaRepository.findByMangaka(mangaka)
                .stream()
                .map(MangaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<MangaDTO> getByTomo(Integer tomo) {
        return mangaRepository.findByTomo(tomo)
                .stream()
                .map(MangaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<MangaDTO> getByTitulo(String titulo) {
        return mangaRepository.findByTituloContainingIgnoreCase(titulo)
                .stream()
                .map(MangaMapper::toDTO)
                .collect(Collectors.toList());
    }
}