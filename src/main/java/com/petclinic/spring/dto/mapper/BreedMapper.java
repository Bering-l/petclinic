package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestBreedDTO;
import com.petclinic.spring.entity.Breed;
import org.mapstruct.Mapper;

@Mapper
public interface BreedMapper {
    RequestBreedDTO requestBreedDTO(Breed breed);
}
