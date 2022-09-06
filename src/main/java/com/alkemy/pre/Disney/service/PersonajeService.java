package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.PersonajeDTO;
import com.alkemy.pre.Disney.entity.PersonajeEntity;

import java.util.List;

public interface PersonajeService {
    PersonajeDTO guardar(PersonajeDTO personajeDTO);

    PersonajeDTO editar(PersonajeDTO personajeDTO);

    PersonajeDTO eliminar(Long id);

    PersonajeDTO actualizar(PersonajeDTO personajeDTO);

    PersonajeDTO detalle(Long id);

    PersonajeEntity buscar(Long id);

    List<PersonajeDTO> getAllPersonajes();
}
