package com.petclinic.spring.controller;

import com.petclinic.spring.entity.Breed;
import com.petclinic.spring.service.BreedService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BreedController {
    private final BreedService breedService;

    public BreedController(BreedService breedService) {
        this.breedService = breedService;
    }

    @PostMapping("/breed")
    public void createAnimal(@RequestBody Breed breed) {
        breedService.saveNewBreed(breed);
    }
}
