package com.petclinic.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestAnimalTypesDTO {

    @NotBlank
    @Size(min = 3)
    String type;

}
