package com.uam.cua.tysi.integracion.alumnos.dto;

public class MangaDTO {

    private Long idManga;
    private String titulo;
    private String mangaka;
    private Integer tomo;

    public MangaDTO() {}

    public MangaDTO(Long idManga, String titulo, String mangaka, Integer tomo) {
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