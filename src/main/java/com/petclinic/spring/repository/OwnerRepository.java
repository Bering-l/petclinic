package com.petclinic.spring.repository;

import com.petclinic.spring.entity.Owner;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Optional<Owner> findByTelephone(@Size(min = 11, max = 15) String telephone);
}
