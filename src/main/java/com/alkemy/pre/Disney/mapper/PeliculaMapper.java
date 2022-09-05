package com.alkemy.pre.Disney.mapper;

import com.alkemy.pre.Disney.dto.PeliculaDTO;
import com.alkemy.pre.Disney.entity.PeliculaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeliculaMapper {

    public PeliculaEntity peliculaDTOtoEntity(PeliculaDTO dto){
        PeliculaEntity pelicula = new PeliculaEntity();
        //cuando llega un dto no tiene id, por eso no se setea
        pelicula.setImagen(dto.getImagen());
        pelicula.setTitulo(dto.getTitulo());
        pelicula.setFechaCreacion(dto.getFechaCreacion());
        pelicula.setCalificacion(dto.getCalificacion());
        pelicula.setGenero(dto.getGenero());
        return pelicula;
    }
    public PeliculaDTO peliculaEntitytoDTO(PeliculaEntity entity){
        PeliculaDTO dto = new PeliculaDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setGenero(entity.getGenero());
        return dto;
    }
    public List<PeliculaDTO> peliculaEntityListToDTOList(List<PeliculaEntity> peliculaEntities){
        //creamos la lista de dtos
        List<PeliculaDTO> peliculaDTOList = new ArrayList<>();
        //hacemos un ciclo para que se llene la lista
        for (PeliculaEntity pelicula : peliculaEntities){
            peliculaDTOList.add(peliculaEntitytoDTO(pelicula));
        }
        return peliculaDTOList;
    }
}
