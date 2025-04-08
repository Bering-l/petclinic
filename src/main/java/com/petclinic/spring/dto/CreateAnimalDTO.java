package com.petclinic.spring.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateAnimalDTO {
    private String animalName;
    private String gender;
    private String breedName;
    private String ownerPhoneNumber;
    private LocalDate dateOfBirth;
    private String description;

    public CreateAnimalDTO() {
    }

    public CreateAnimalDTO(String animalName, String gender, String breedName, String ownerPhoneNumber,
                           LocalDate dateOfBirth, String description) {
        this.animalName = animalName;
        this.gender = gender;
        this.breedName = breedName;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.description = description;
    }

}
