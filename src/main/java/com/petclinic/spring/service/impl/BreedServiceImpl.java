package com.petclinic.spring.service.impl;

import com.petclinic.spring.dto.RequestBreedDTO;
import com.petclinic.spring.dto.mapper.BreedMapping;
import com.petclinic.spring.entity.Breed;
import com.petclinic.spring.repository.BreedRepository;
import com.petclinic.spring.service.BreedService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BreedServiceImpl implements BreedService {
    private final BreedRepository breedRepository;
    private final BreedMapping breedMapping;

    @Override
    @Transactional
    public void addBreed(Breed breed) {
        breedRepository.save(breed);
    }

    @Override
    public Optional<RequestBreedDTO> getBreedName(Long id) {
        return breedRepository.findByBreedId(id)
                .map(breedMapping::toDto);
    }
}
