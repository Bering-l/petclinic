package com.petclinic.spring.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table(name = "animals")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "animalId"
)
public class Animal {

    @Id
    @Column(name = "animal_id")
    @JsonProperty("animalId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long animalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty("breed")
    @JsonIgnore
    @JoinColumn(name = "breed_id")
    private Breed breed;

    @Column(name = "animal_name")
    @JsonProperty("animalName")
    private String animalName;

    @Column(nullable = false, length = 1)
    @JsonProperty("gender")
    private String gender;

    @JsonProperty("description")
    private String description;

    @Column(name = "date_of_birth")
    @JsonProperty("dateOfBirth")
    private LocalDate dateOfBirth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    @JsonIgnore
    @JsonProperty("owner")
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animal_type_id")
    @JsonIgnore
    @JsonProperty("animalType")
    private AnimalType animalType;

    public Animal(Long animalId, Breed breed, String animalName, String gender, String description,
                  LocalDate dateOfBirth, Owner owner, AnimalType animalType) {
        this.animalId = animalId;
        this.breed = breed;
        this.animalName = animalName;
        this.gender = gender;
        this.description = description;
        this.dateOfBirth = dateOfBirth;
        this.owner = owner;
        this.animalType = animalType;
    }

    public Animal(Breed breed, String animalName, String description, String gender, LocalDate dateOfBirth, Owner owner, AnimalType animalType) {
        this.breed = breed;
        this.animalName = animalName;
        this.description = description;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.owner = owner;
        this.animalType = animalType;
    }

    public Animal() {
    }

    public Animal(Long animalId) {
        this.animalId = animalId;
    }
}

