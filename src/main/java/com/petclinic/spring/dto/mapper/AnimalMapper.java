package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequstAnimalDTO;
import com.petclinic.spring.entity.Animal;
import org.mapstruct.Mapper;

@Mapper
public interface AnimalMapper {
    RequstAnimalDTO toRequestAnimalDTO(Animal animal);
}
