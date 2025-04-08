package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestOwnerDTO;
import com.petclinic.spring.entity.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring", uses = {AddressMapper.class, BreederMapper.class, AnimalMapper.class})
public interface OwnerMapper {
    Owner toEntity(RequestOwnerDTO dto);
    RequestOwnerDTO toDto(Owner entity);
    List<RequestOwnerDTO> toDtoList(List<Owner> entities);
}
