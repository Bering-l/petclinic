package com.petclinic.spring.service;

import com.petclinic.spring.entity.Animal;
import com.petclinic.spring.repository.AnimalRepository;
import com.petclinic.spring.repository.BreedRepository;
import com.petclinic.spring.repository.OwnerRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public void deleteAnimalId(Long id) {
        animalRepository.deleteById(id);
    }

    @Transactional
    public void saveNewAnimal(Animal animal) {
        if (animalRepository.findById(animal.getAnimalId()).isEmpty()) {
            animalRepository.save(animal);
        } else {
            throw new EntityExistsException("Животное с id " + animal.getAnimalId() + " уже создано");
        }
    }

}
