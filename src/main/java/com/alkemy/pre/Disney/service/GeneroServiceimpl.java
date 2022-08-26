package com.alkemy.pre.Disney.service;


import com.alkemy.pre.Disney.dto.GeneroDTO;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceimpl implements GeneroService{

    public GeneroDTO guardar(GeneroDTO dto){
        System.out.println("genero guardado");
        return dto;
    }
}
