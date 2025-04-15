package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestOwnerDTO;
import com.petclinic.spring.entity.Owner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AnimalMapping.class, AddressMapping.class, })
public interface OwnerMapping {
    RequestOwnerDTO toDto(Owner owner);
}
