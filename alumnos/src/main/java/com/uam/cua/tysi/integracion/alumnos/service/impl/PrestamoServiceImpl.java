package com.uam.cua.tysi.integracion.alumnos.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uam.cua.tysi.integracion.alumnos.dto.PrestamoDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Prestamo;
import com.uam.cua.tysi.integracion.alumnos.mapper.PrestamoMapper;
import com.uam.cua.tysi.integracion.alumnos.repository.PrestamoRepository;
import com.uam.cua.tysi.integracion.alumnos.service.IPrestamoService;

@Service
public class PrestamoServiceImpl implements IPrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public List<PrestamoDTO> getAll() {
        return prestamoRepository.findAll()
                .stream()
                .map(PrestamoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PrestamoDTO getById(Integer id) {
        Prestamo prestamo = prestamoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Préstamo no encontrado con id: " + id));
        return PrestamoMapper.toDTO(prestamo);
    }

    @Override
    public PrestamoDTO create(PrestamoDTO dto) {
        Prestamo prestamo = PrestamoMapper.toEntity(dto);
        return PrestamoMapper.toDTO(prestamoRepository.save(prestamo));
    }

    @Override
    public PrestamoDTO update(Integer id, PrestamoDTO dto) {
        prestamoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Préstamo no encontrado con id: " + id));
        Prestamo prestamo = PrestamoMapper.toEntity(dto);
        prestamo.setIdPrestamo(id);
        return PrestamoMapper.toDTO(prestamoRepository.save(prestamo));
    }

    @Override
    public void delete(Integer id) {
        prestamoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Préstamo no encontrado con id: " + id));
        prestamoRepository.deleteById(id);
    }

    @Override
    public List<PrestamoDTO> getByUsuario(Integer idUsuario) {
        return prestamoRepository.findByUsuarioIdUsuario(idUsuario)
                .stream()
                .map(PrestamoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PrestamoDTO> getVencidos() {
        return prestamoRepository.findByFechaEntregaBefore(LocalDate.now())
                .stream()
                .map(PrestamoMapper::toDTO)
                .collect(Collectors.toList());
    }
}