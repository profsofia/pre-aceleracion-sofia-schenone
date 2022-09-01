package com.alkemy.pre.Disney.controller;

import com.alkemy.pre.Disney.dto.GeneroDTO;
import com.alkemy.pre.Disney.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @PostMapping
    public ResponseEntity<GeneroDTO> guardarGenero(@RequestBody GeneroDTO genero){
        GeneroDTO generoGuardado = generoService.guardar(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);

    }
    @GetMapping
    public ResponseEntity<List<GeneroDTO>> generos(){
        List<GeneroDTO> generos = generoService.getAllGeneros();
        return ResponseEntity.ok().body(generos);
    }
}
