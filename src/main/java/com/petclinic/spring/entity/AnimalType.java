package com.petclinic.spring.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "animals_types")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "animalTypeId"
)
public class AnimalType {

    @Id
    @Column(name = "animal_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("animalTypeId")
    private Long animalTypeId;

    @Enumerated(EnumType.STRING)
    private Species type;

}