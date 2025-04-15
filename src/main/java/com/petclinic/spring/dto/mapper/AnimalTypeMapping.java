package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestAnimalTypesDTO;
import com.petclinic.spring.entity.AnimalType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnimalTypeMapping {

    RequestAnimalTypesDTO toDto(AnimalType type);
}
