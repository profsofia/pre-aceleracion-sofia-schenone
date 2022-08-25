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
    /*
    * LA relación uno a muchos, en este caso un genero para muchas películas, solo puede tener como tipo de dato un objeto */
    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id")
    private List<PeliculaEntity> peliculas = new ArrayList<>();
}
