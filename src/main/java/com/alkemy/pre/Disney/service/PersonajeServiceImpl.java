package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.PersonajeDTO;
import com.alkemy.pre.Disney.entity.PersonajeEntity;
import com.alkemy.pre.Disney.exceptions.ResourceNotFoundException;
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
        PersonajeEntity personaje = personajeMapper.personajeDTOtoEntity(personajeDTO);
        personaje.setPeso(personajeDTO.getPeso());
        personaje.setEdad(personajeDTO.getEdad());
        personaje.setHistoria(personajeDTO.getHistoria());
        personaje.setNombre(personajeDTO.getNombre());
        PersonajeEntity personajeEdited = personajeRepository.save(personaje);
        PersonajeDTO personajeEditedDTO = personajeMapper.personajeEntitytoDTO(personajeEdited);
        return personajeEditedDTO;
    }

    @Override
    public PersonajeDTO eliminar(Long id) {
        return null;
    }

    @Override
    public PersonajeDTO actualizar(PersonajeDTO personajeDTO) {
        return null;
    }

    @Override
    public PersonajeDTO detalle(Long id) {
        return null;
    }

    @Override
    public PersonajeEntity buscar(Long id) {
        PersonajeEntity personajeEntity = personajeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("no se encontró el personaje"));
        return null;
    }

    @Override
    public List<PersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> personajeEntities = personajeRepository.findAll();
        List<PersonajeDTO> personajeDTOS = personajeMapper.personajeEntityListToDTOList(personajeEntities);
        return personajeDTOS;
    }

}
