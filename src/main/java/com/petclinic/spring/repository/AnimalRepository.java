package com.petclinic.spring.repository;

import com.petclinic.spring.entity.Animal;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

  /*  @EntityGraph(attributePaths = {"breed", "owner", "animalType"})
    List<Animal> findAll();*/

}
