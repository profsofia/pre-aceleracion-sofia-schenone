package com.alkemy.pre.Disney.controller;

import com.alkemy.pre.Disney.dto.PersonajeDTO;
import com.alkemy.pre.Disney.entity.PersonajeEntity;
import com.alkemy.pre.Disney.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public ResponseEntity<?> buscarPersonajeId(@PathVariable Long id) {
        PersonajeEntity personajeEntity = personajeService.buscar(id);
        return ResponseEntity.ok(personajeEntity);
    }


    //generar un personaje
    @PostMapping
    public ResponseEntity<PersonajeDTO> guardarPersonaje(@RequestBody PersonajeDTO personajeDTO) {
        PersonajeDTO personajeGuardado = personajeService.guardar(personajeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }

    @PutMapping
    public ResponseEntity<PersonajeDTO> editarPersonaje(@RequestBody PersonajeDTO personajeDTO) {
        PersonajeDTO dto = personajeService.editar(personajeDTO);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @DeleteMapping("/{id}")
    public void borrarPersonaje(@PathVariable Long id) {
        personajeService.eliminar(id);
    }
}
