package com.alkemy.pre.Disney.dto;

import com.alkemy.pre.Disney.entity.GeneroEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter @Setter
public class PeliculaDTO {
    private Long id;

    private String imagen;
    private String titulo;
    private LocalDate fechaCreacion;
    private int calificacion;
    private GeneroEntity genero;
}
