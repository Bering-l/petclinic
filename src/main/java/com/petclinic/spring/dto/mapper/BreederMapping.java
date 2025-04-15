package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestBreederDTO;
import com.petclinic.spring.entity.Breeder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BreederMapping {
    RequestBreederDTO toDto(Breeder breeder);
}
