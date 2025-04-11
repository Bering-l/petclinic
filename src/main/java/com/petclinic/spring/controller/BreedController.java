package com.petclinic.spring.controller;


import com.petclinic.spring.dto.ResponseBreedDTO;
import com.petclinic.spring.entity.Breed;
import com.petclinic.spring.service.BreedService;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:8080")
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

/*    @GetMapping("/breed")
    public Optional<RequestBreedDTO> getBreedById(@RequestParam("id") Long id) {
        return breedService.getBreedName(id);
    }*/

    @GetMapping("/breed")
    public ResponseBreedDTO getColorByBreedId(@RequestParam("id") Long id) {
        return breedService.findByColorsBreedsByBreedId(id);
    }
}
