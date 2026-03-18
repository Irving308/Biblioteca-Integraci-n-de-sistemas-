package com.uam.cua.tysi.integracion.alumnos.dto;

public class UsuarioDTO {

    private Integer idUsuario;
    private String matricula;
    private String nombre;
    private String division; // "DCSH", "CCD" o "CNI"

    public UsuarioDTO() {}

    public UsuarioDTO(Integer idUsuario, String matricula, String nombre, String division) {
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