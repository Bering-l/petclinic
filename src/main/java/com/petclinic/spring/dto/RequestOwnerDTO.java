package com.petclinic.spring.dto;

import lombok.*;

import java.util.List;

@Data
public class RequestOwnerDTO {

    Long id;
    String ownerName;
    String surname;
    String telephone;
    RequestAddressDTO address;
    RequestBreedDTO breeder;
    List<RequstAnimalDTO> animals;

}
