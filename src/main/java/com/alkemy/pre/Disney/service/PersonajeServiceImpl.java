package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.PersonajeDTO;
import com.alkemy.pre.Disney.entity.PersonajeEntity;
import com.alkemy.pre.Disney.mapper.PersonajeMapper;
import com.alkemy.pre.Disney.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonajeServiceImpl implements PersonajeService {
    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public PersonajeDTO guardar(PersonajeDTO personajeDTO) {
        PersonajeEntity personaje = personajeMapper.personajeDTOtoEntity(personajeDTO);
        PersonajeEntity personajeSaved = personajeRepository.save(personaje);
        PersonajeDTO resultPersonajeDTO = personajeMapper.personajeEntitytoDTO(personajeSaved);
        System.out.println("personaje Guardado");
        return resultPersonajeDTO;
    }

    @Override
    public PersonajeDTO editar(PersonajeDTO personajeDTO) {
        return null;
    }

    @Override
    public PersonajeDTO eliminar() {
        return null;
    }

    @Override
    public PersonajeDTO actualizar() {
        return null;
    }

    @Override
    public PersonajeDTO detalle() {
        return null;
    }

    @Override
    public PersonajeDTO buscar() {
        return null;
    }

    @Override
    public List<PersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> personajeEntities = personajeRepository.findAll();
        List<PersonajeDTO> personajeDTOS = personajeMapper.personajeEntityListToDTOList(personajeEntities);
        return personajeDTOS;
    }

}
