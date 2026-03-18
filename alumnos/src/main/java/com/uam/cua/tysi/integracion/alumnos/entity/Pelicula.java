package com.uam.cua.tysi.integracion.alumnos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long idPelicula;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "director", length = 100)
    private String director;

    public Pelicula() {}

    public Pelicula(Long idPelicula, String titulo, String director) {
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