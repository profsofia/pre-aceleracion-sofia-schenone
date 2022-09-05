package com.alkemy.pre.Disney.service;

import com.alkemy.pre.Disney.dto.PeliculaDTO;
import com.alkemy.pre.Disney.mapper.PeliculaMapper;
import com.alkemy.pre.Disney.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public PeliculaDTO guardar(PeliculaDTO peliculaDTO) {
        return null;
    }

    @Override
    public List<PeliculaDTO> getAllPeliculas() {
        return null;
    }
}
