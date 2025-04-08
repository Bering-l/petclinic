package com.petclinic.spring.repository;

import com.petclinic.spring.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    boolean existsByTelephone(String telephone);
}
