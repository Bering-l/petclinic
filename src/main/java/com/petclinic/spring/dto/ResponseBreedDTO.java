package com.petclinic.spring.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseBreedDTO {

    String breedName;
    List<String> colors;

    public ResponseBreedDTO(String breedName, List<String> colors) {
        this.breedName = breedName;
        this.colors = colors;
    }
}
