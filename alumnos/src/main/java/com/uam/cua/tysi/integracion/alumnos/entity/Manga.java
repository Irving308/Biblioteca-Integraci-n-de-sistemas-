package com.uam.cua.tysi.integracion.alumnos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mangas")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_manga")
    private Long idManga;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "mangaka", length = 100)
    private String mangaka;

    @Column(name = "tomo", nullable = false)
    private Integer tomo;

    public Manga() {}

    public Manga(Long idManga, String titulo, String mangaka, Integer tomo) {
        this.idManga = idManga;
        this.titulo = titulo;
        this.mangaka = mangaka;
        this.tomo = tomo;
    }

    public Long getIdManga() { return idManga; }
    public void setIdManga(Long idManga) { this.idManga = idManga; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getMangaka() { return mangaka; }
    public void setMangaka(String mangaka) { this.mangaka = mangaka; }

    public Integer getTomo() { return tomo; }
    public void setTomo(Integer tomo) { this.tomo = tomo; }
}