package com.alkemy.pre.Disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "genero")
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String imagen;

    //peliculasAsociadas
    //una pelicula puede pertenecer a un genero, un genero puede tener muchas peliculas..
    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id")
    private List<PeliculaEntity> peliculas = new ArrayList<>();
}
