package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {
    PersonajeDTO guardar(PersonajeDTO personajeDTO);

    PersonajeDTO editar(PersonajeDTO personajeDTO);

    PersonajeDTO eliminar();

    PersonajeDTO actualizar();

    PersonajeDTO detalle();

    PersonajeDTO buscar();

    List<PersonajeDTO> getAllPersonajes();
}
