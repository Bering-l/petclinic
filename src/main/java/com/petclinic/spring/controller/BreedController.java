package com.petclinic.spring.controller;

import com.petclinic.spring.dto.RequestBreedDTO;
import com.petclinic.spring.entity.Breed;
import com.petclinic.spring.service.BreedService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class BreedController {
    private final BreedService breedService;

    public BreedController(BreedService breedService) {
        this.breedService = breedService;
    }

    @PostMapping("/breed")
    public void createAnimal(@RequestBody Breed breed) {
        breedService.addBreed(breed);
    }

    @GetMapping("/breed")
    public Optional<RequestBreedDTO> getBreedById(@RequestParam("id") Long id) {
        return breedService.getBreedName(id);
    }
}
