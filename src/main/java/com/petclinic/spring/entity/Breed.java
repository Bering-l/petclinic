package com.petclinic.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "breeds")
public class Breed {

    @Id
    @Column(name = "breed_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long breedId;

    @Column(name = "breed_name", nullable = false)
    @JsonProperty("breedName")
    private String breedName;

    @ManyToMany
    @JoinTable(
            name = "breed_colors",
            joinColumns = @JoinColumn(name = "breed_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    private List<Color> colors;

    @JsonIgnore
    @OneToMany(mappedBy = "breed")
    private List<Animal> animals;

    @Override
    public String toString() {
        return "Breed{" +
                "breedId=" + breedId +
                ", breedName='" + breedName + '\'' +
                '}';
    }

}
