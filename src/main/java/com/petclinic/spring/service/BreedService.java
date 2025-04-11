package com.petclinic.spring.service;

import com.petclinic.spring.dto.RequestBreedDTO;
import com.petclinic.spring.dto.ResponseBreedDTO;
import com.petclinic.spring.entity.Breed;

import java.util.Optional;

public interface BreedService {
    Optional<RequestBreedDTO> getBreedName(Long id);
    void addBreed(Breed breed);
    ResponseBreedDTO findByColorsBreedsByBreedId(Long id);
}
