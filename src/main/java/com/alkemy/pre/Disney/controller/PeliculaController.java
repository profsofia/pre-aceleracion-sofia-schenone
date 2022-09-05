package com.alkemy.pre.Disney.controller;

import com.alkemy.pre.Disney.dto.PeliculaDTO;
import com.alkemy.pre.Disney.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    @PostMapping
    public ResponseEntity<PeliculaDTO> guardarPelicula(@RequestBody PeliculaDTO peliculaDTO) {
        PeliculaDTO peliculaGuardada = peliculaService.guardar(peliculaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
    }
}
