package com.alkemy.pre.Disney.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "personajes")
@SQLDelete(sql = "UPDATE personajes SET borrado=true WHERE id = ?")
@Where(clause = "borrado = false")
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

    @ManyToMany(mappedBy = "personaje")//, cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculaEntities = new ArrayList<>();

    private Boolean borrado;
}
