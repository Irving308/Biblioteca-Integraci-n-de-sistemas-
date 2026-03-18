package com.uam.cua.tysi.integracion.alumnos.dto;

public class LibroDTO {

    private Long idLibro;
    private String titulo;
    private String autor;

    public LibroDTO() {}

    public LibroDTO(Long idLibro, String titulo, String autor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Long getIdLibro() { return idLibro; }
    public void setIdLibro(Long idLibro) { this.idLibro = idLibro; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
}