package com.petclinic.spring.service;

import com.petclinic.spring.entity.Animal;
import com.petclinic.spring.repository.AnimalRepository;
import com.petclinic.spring.repository.BreedRepository;
import com.petclinic.spring.repository.OwnerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;
    private final BreedRepository breedRepository;
    private final OwnerRepository ownerRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository,
                         BreedRepository breedRepository,
                         OwnerRepository ownerRepository) {
        this.animalRepository = animalRepository;
        this.breedRepository = breedRepository;
        this.ownerRepository = ownerRepository;
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Transactional
    public void saveNewAnimal(Animal animal) {
            animalRepository.save(animal);
    }

}
