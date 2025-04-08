package com.petclinic.spring.controller;

import com.petclinic.spring.entity.Animal;
import com.petclinic.spring.service.AnimalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController {

    private final AnimalService animalService;
    private final Logger logger = LoggerFactory.getLogger(AnimalController.class);

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        logger.info("999999999999999999");
        return animalService.getAllAnimals();
    }

    @PostMapping("/animals")
    public void createAnimal(@RequestBody Animal animal) {
        animalService.saveNewAnimal(animal);
    }
}
