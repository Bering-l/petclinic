package com.petclinic.spring.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@Table(name = "owners")
public class Owner {

    @Id
    @Column(name = "owner_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    @Column(name = "owner_name")
    private String ownerName;

    @Column
    private String surname;

    @Column
    private String telephone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "breeder_id")
    private Breeder breeder;

    @JsonIgnore
    @OneToMany(mappedBy = "owner")
    List<Animal> animals;

}
