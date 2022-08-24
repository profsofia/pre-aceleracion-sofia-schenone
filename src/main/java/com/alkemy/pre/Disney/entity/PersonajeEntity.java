package com.alkemy.pre.Disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter @Setter
public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String imagen;
    private String historia;
    private int edad;
    private double peso;

    //peliculasAsociadas

    @ManyToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculaEntities = new ArrayList<>();
}
