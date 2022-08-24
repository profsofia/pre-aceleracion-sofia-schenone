package com.alkemy.pre.Disney.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    ///
    private String imagen;
    private String titulo;
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;


    @Size(min = 1, max = 5, message = "la calificación debe estar entre 1 y 5")
    private int calificacion; //del 1 al 5

    //personajesAsociados
    //la pelicula puede tener un solo genero, pero un genero puede pertenecer a muchas peliculas

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;


    @Column(name = "genero_id", nullable = false)
    private Long generoId;

    //Relacion entre personajes y peliculas
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "personajes_peliculas",
            joinColumns = @JoinColumn(name = "personaje_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id")
    )
    private Set<PersonajeEntity> personaje = new HashSet<>();

}
