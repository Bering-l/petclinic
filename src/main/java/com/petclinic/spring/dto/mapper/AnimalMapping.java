package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestAnimalDTO;
import com.petclinic.spring.entity.Animal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BreedMapping.class, AnimalTypeMapping.class})
public interface AnimalMapping {
    RequestAnimalDTO toDto(Animal animal);
}
