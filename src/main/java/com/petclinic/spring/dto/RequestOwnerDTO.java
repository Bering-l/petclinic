package com.petclinic.spring.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class RequestOwnerDTO {
    @NotNull
    String ownerName;

    @NotNull
    String surname;

    @Size(min = 11, max = 15)
    String telephone;

    RequestAddressDTO address;

    RequestBreederDTO breeder;

    List<RequestAnimalDTO> animals;
}
