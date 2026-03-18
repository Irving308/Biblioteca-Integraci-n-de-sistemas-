package com.uam.cua.tysi.integracion.alumnos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uam.cua.tysi.integracion.alumnos.dto.MultaDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Multa;
import com.uam.cua.tysi.integracion.alumnos.mapper.MultaMapper;
import com.uam.cua.tysi.integracion.alumnos.repository.MultaRepository;
import com.uam.cua.tysi.integracion.alumnos.service.IMultaService;

@Service
public class MultaServiceImpl implements IMultaService {

    @Autowired
    private MultaRepository multaRepository;

    @Override
    public List<MultaDTO> getAll() {
        return multaRepository.findAll()
                .stream()
                .map(MultaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MultaDTO getById(Long id) {
        Multa multa = multaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa no encontrada con id: " + id));
        return MultaMapper.toDTO(multa);
    }

    @Override
    public MultaDTO create(MultaDTO dto) {
        Multa multa = MultaMapper.toEntity(dto);
        return MultaMapper.toDTO(multaRepository.save(multa));
    }

    @Override
    public MultaDTO update(Long id, MultaDTO dto) {
        multaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa no encontrada con id: " + id));
        Multa multa = MultaMapper.toEntity(dto);
        multa.setIdMulta(id);
        return MultaMapper.toDTO(multaRepository.save(multa));
    }

    @Override
    public void delete(Long id) {
        multaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa no encontrada con id: " + id));
        multaRepository.deleteById(id);
    }

    @Override
    public List<MultaDTO> getByPrestamo(Integer idPrestamo) {
        return multaRepository.findByPrestamoIdPrestamo(idPrestamo)
                .stream()
                .map(MultaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<MultaDTO> getByPagado(Boolean pagado) {
        return multaRepository.findByPagado(pagado)
                .stream()
                .map(MultaMapper::toDTO)
                .collect(Collectors.toList());
    }
}
