package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.PeliculaDTO;

import java.util.List;

public interface PeliculaService {
    PeliculaDTO guardar(PeliculaDTO peliculaDTO );
    List<PeliculaDTO> getAllPeliculas();
}
