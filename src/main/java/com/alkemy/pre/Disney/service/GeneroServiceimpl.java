package com.alkemy.pre.Disney.service;


import com.alkemy.pre.Disney.dto.GeneroDTO;
import com.alkemy.pre.Disney.entity.GeneroEntity;
import com.alkemy.pre.Disney.mapper.GeneroMapper;
import com.alkemy.pre.Disney.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceimpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO guardar(GeneroDTO dto) {
        //se convierte el dto que llega a una entidad...
        GeneroEntity entity = generoMapper.generoDTOtoEntity(dto);
        //guardamos la entidad
        GeneroEntity entitySaved = generoRepository.save(entity);
        //convertimos la entidad a dto, ya que el controller solo maneja dto
        GeneroDTO resultDTO = generoMapper.generoEntitytoDTO(entitySaved);
        System.out.println("genero guardado");
        return resultDTO;
    }

    @Override
    public List<GeneroDTO> getAllGeneros() {
        //recuperamos las entidades con el método de Jpa
        List<GeneroEntity> entities = generoRepository.findAll();
        //convertimos la lista de entidades a lista de dto
        List<GeneroDTO> result = generoMapper.generoEntityListToDTOList(entities);
        //devolvemos la lista de dtos
        return result;
    }
}
