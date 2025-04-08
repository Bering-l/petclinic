package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestBreederDTO;
import com.petclinic.spring.entity.Breeder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BreederMapper {
 //   @Mapping(source = "nameClub", target = "nameClub")
    RequestBreederDTO toRequestBreederDTO(Breeder breeder);
    RequestBreederDTO map(Breeder breeder);
}
