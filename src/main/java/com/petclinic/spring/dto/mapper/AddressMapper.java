package com.petclinic.spring.dto.mapper;

import com.petclinic.spring.dto.RequestAddressDTO;
import com.petclinic.spring.entity.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
    RequestAddressDTO toRequestAddressDTO(Address address);
}
