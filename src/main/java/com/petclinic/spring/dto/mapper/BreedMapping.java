package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestBreedDTO;
import com.petclinic.spring.entity.Breed;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BreedMapping {
    RequestBreedDTO toDto(Breed breed);

    Breed toEntity(Breed breed);
}
