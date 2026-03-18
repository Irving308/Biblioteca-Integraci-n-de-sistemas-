package com.uam.cua.tysi.integracion.alumnos.dto;

public class PeliculaDTO {

    private Long idPelicula;
    private String titulo;
    private String director;

    public PeliculaDTO() {}

    public PeliculaDTO(Long idPelicula, String titulo, String director) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.director = director;
    }

    public Long getIdPelicula() { return idPelicula; }
    public void setIdPelicula(Long idPelicula) { this.idPelicula = idPelicula; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
}