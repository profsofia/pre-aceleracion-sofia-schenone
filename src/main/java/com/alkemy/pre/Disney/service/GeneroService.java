package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.GeneroDTO;

import java.util.List;

public interface GeneroService {
    GeneroDTO guardar(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();
}
