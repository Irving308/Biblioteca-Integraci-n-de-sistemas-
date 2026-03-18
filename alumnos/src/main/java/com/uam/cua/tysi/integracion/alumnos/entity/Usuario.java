package com.uam.cua.tysi.integracion.alumnos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "matricula", nullable = false, unique = true, length = 15)
    private String matricula;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // ✅ String en lugar de Enum
    @Column(name = "division", nullable = false)
    private String division;

    public Usuario() {}

    public Usuario(Integer idUsuario, String matricula, String nombre, String division) {
        this.idUsuario = idUsuario;
        this.matricula = matricula;
        this.nombre = nombre;
        this.division = division;
    }

    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDivision() { return division; }
    public void setDivision(String division) { this.division = division; }
}