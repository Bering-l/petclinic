package com.petclinic.spring.dto;

import com.petclinic.spring.entity.AnimalType;
import com.petclinic.spring.entity.Owner;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestAnimalDTO {

    RequestBreedDTO breed;

    @NotBlank
    String animalName;

    String gender;

    String description;

    LocalDate dateOfBirth;

    RequestOwnerDTO owner;

    AnimalType animalType;
}
