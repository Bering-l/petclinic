package com.petclinic.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestAddressDTO {

    String region;

    @Size(min = 6)
    String postalCode;

    @NotBlank
    String city;

    String street;

    @NotNull
    @Size(min = 1)
    Integer house;

    Integer building;

    Integer flat;
}
