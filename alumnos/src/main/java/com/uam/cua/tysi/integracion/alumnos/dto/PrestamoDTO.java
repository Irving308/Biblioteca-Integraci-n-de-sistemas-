package com.uam.cua.tysi.integracion.alumnos.dto;

import java.time.LocalDate;

public class PrestamoDTO {

    private Integer idPrestamo;
    private Integer idUsuario;
    private Integer idLibro;
    private Integer idPelicula;
    private Integer idManga;
    private LocalDate fechaSalida;
    private LocalDate fechaEntrega;

    public PrestamoDTO() {}

    public PrestamoDTO(Integer idPrestamo, Integer idUsuario, Integer idLibro,
                       Integer idPelicula, Integer idManga,
                       LocalDate fechaSalida, LocalDate fechaEntrega) {
        this.idPrestamo = idPrestamo;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.idPelicula = idPelicula;
        this.idManga = idManga;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdPrestamo() { return idPrestamo; }
    public void setIdPrestamo(Integer idPrestamo) { this.idPrestamo = idPrestamo; }

    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public Integer getIdLibro() { return idLibro; }
    public void setIdLibro(Integer idLibro) { this.idLibro = idLibro; }

    public Integer getIdPelicula() { return idPelicula; }
    public void setIdPelicula(Integer idPelicula) { this.idPelicula = idPelicula; }

    public Integer getIdManga() { return idManga; }
    public void setIdManga(Integer idManga) { this.idManga = idManga; }

    public LocalDate getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(LocalDate fechaSalida) { this.fechaSalida = fechaSalida; }

    public LocalDate getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(LocalDate fechaEntrega) { this.fechaEntrega = fechaEntrega; }
}