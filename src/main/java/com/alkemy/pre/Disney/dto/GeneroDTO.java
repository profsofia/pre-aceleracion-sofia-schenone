package com.alkemy.pre.Disney.dto;

import lombok.Getter;
import lombok.Setter;

/*
 * el objeto dto es un objeto plano, solo lo definimos para decir como vamos a mandar los datos
 * */
@Getter
@Setter
public class GeneroDTO {
    private Long id;
    private String nombre;
    private String imagen;
}
