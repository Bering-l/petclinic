package com.petclinic.spring.service;

import com.petclinic.spring.entity.Breed;
import com.petclinic.spring.repository.BreedRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BreedService {
    public BreedService(BreedRepository breedRepository) {
        this.breedRepository = breedRepository;
    }

    private final BreedRepository breedRepository;

    @Transactional
    public void saveNewBreed(Breed breed) {
        breedRepository.save(breed);
    }
}
