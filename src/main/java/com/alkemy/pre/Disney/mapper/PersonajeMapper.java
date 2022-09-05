package com.alkemy.pre.Disney.mapper;

import com.alkemy.pre.Disney.dto.PersonajeDTO;
import com.alkemy.pre.Disney.entity.PersonajeEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonajeMapper {
    public PersonajeEntity personajeDTOtoEntity(PersonajeDTO dto){
        PersonajeEntity personaje = new PersonajeEntity();
        //cuando llega un dto no tiene id, por eso no se setea
        personaje.setImagen(dto.getImagen());
        personaje.setNombre(dto.getNombre());
        personaje.setHistoria(dto.getHistoria());
        personaje.setEdad(dto.getEdad());
        personaje.setPeso(dto.getPeso());
        return personaje;
    }
    public PersonajeDTO personajeEntitytoDTO(PersonajeEntity entity){
        PersonajeDTO dto = new PersonajeDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        dto.setHistoria(entity.getHistoria());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        return dto;
    }
    public List<PersonajeDTO> personajeEntityListToDTOList(List<PersonajeEntity> personajeEntities){
        //creamos la lista de dtos
        List<PersonajeDTO> personajeDTOList = new ArrayList<>();
        //hacemos un ciclo para que se llene la lista
        for (PersonajeEntity personaje : personajeEntities){
            personajeDTOList.add(personajeEntitytoDTO(personaje));
        }
        return personajeDTOList;
    }
}
