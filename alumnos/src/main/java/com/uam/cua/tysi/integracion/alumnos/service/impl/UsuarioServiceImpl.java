package com.uam.cua.tysi.integracion.alumnos.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uam.cua.tysi.integracion.alumnos.dto.UsuarioDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Usuario;
import com.uam.cua.tysi.integracion.alumnos.mapper.UsuarioMapper;
import com.uam.cua.tysi.integracion.alumnos.repository.UsuarioRepository;
import com.uam.cua.tysi.integracion.alumnos.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioDTO> getAll() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO getById(Integer id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        return UsuarioMapper.toDTO(usuario);
    }

    @Override
    public UsuarioDTO create(UsuarioDTO dto) {
        Usuario usuario = UsuarioMapper.toEntity(dto);
        return UsuarioMapper.toDTO(usuarioRepository.save(usuario));
    }

    @Override
    public UsuarioDTO update(Integer id, UsuarioDTO dto) {
        usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        Usuario usuario = UsuarioMapper.toEntity(dto);
        usuario.setIdUsuario(id);
        return UsuarioMapper.toDTO(usuarioRepository.save(usuario));
    }

    @Override
    public void delete(Integer id) {
        usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        usuarioRepository.deleteById(id);
    }

    @Override
    public UsuarioDTO getByMatricula(String matricula) {
        Usuario usuario = usuarioRepository.findByMatricula(matricula)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con matrícula: " + matricula));
        return UsuarioMapper.toDTO(usuario);
    }

    @Override
    public List<UsuarioDTO> getByDivision(String division) {
        return usuarioRepository.findByDivision(division)
                .stream()
                .map(UsuarioMapper::toDTO)
                .collect(Collectors.toList());
    }
}