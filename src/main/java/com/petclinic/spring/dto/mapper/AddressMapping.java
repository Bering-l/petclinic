package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestAddressDTO;
import com.petclinic.spring.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapping {
    RequestAddressDTO toDto(Address address);
}
