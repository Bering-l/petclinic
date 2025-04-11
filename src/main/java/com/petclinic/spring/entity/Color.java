package com.petclinic.spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "colors")
public class Color {

    @Id
    @Column(name = "color_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colorId;

    @Column(name = "color_name", nullable = false)
    private String colorName;

    @ManyToMany(mappedBy = "colors")
    private List<Breed> breeds;

}
