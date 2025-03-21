package com.petclinic.spring.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Table(name = "breed_colors")
public class BreedColor {

    @Id
    @Column(name = "breed_id")
    private Long breedId;

    @Id
    @Column(name = "color_id")
    private Long colorId;
}
