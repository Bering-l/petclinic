package com.petclinic.spring.repository;

import com.petclinic.spring.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BreedRepository extends JpaRepository<Breed, Long> {
    Breed findByBreedName(String breedName);

    Optional<Breed> findByBreedId(Long id);

}
