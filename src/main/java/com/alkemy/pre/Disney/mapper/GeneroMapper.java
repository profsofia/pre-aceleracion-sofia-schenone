package com.alkemy.pre.Disney.mapper;

import com.alkemy.pre.Disney.dto.GeneroDTO;
import com.alkemy.pre.Disney.entity.GeneroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneroMapper {
    /*TODO: vamos a definir un método que convierta los dto a entidades y al revés..*/
    public GeneroEntity generoDTOtoEntity(GeneroDTO dto) {
        GeneroEntity genero = new GeneroEntity();
        //cuando llega un dto no tiene id, por eso no se setea
        genero.setImagen(dto.getImagen());
        genero.setNombre(dto.getNombre());
        return genero;
    }

    public GeneroDTO generoEntitytoDTO(GeneroEntity entity) {
        GeneroDTO dto = new GeneroDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        return dto;
    }

    public List<GeneroDTO> generoEntityListToDTOList(List<GeneroEntity> generoEntities) {
        //creamos la lista de dtos
        List<GeneroDTO> generoDTOList = new ArrayList<>();
        //hacemos un ciclo para que se llene la lista
        for (GeneroEntity genero : generoEntities) {
            generoDTOList.add(generoEntitytoDTO(genero));
        }
        return generoDTOList;
    }
}
