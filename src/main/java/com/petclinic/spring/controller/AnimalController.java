package com.petclinic.spring.controller;

import com.petclinic.spring.entity.Animal;
import com.petclinic.spring.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/allAnimals")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }
}
