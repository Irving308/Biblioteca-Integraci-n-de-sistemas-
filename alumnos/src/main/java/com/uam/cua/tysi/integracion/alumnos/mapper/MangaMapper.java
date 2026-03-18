package com.uam.cua.tysi.integracion.alumnos.mapper;

import com.uam.cua.tysi.integracion.alumnos.dto.MangaDTO;
import com.uam.cua.tysi.integracion.alumnos.entity.Manga;

public class MangaMapper {

    public static MangaDTO toDTO(Manga manga) {
        if (manga == null) return null;
        return new MangaDTO(
            manga.getIdManga(),
            manga.getTitulo(),
            manga.getMangaka(),
            manga.getTomo()
        );
    }

    public static Manga toEntity(MangaDTO dto) {
        if (dto == null) return null;
        return new Manga(
            dto.getIdManga(),
            dto.getTitulo(),
            dto.getMangaka(),
            dto.getTomo()
        );
    }
}