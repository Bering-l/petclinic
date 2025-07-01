package com.petclinic.spring.service;

import com.petclinic.spring.dto.RequestOwnerDTO;
import com.petclinic.spring.dto.mapper.OwnerMapping;
import com.petclinic.spring.entity.Owner;
import com.petclinic.spring.repository.OwnerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;
    private final OwnerMapping ownerMapping;

    @Autowired
    public OwnerService(OwnerRepository ownerRepository, OwnerMapping ownerMapping) {
        this.ownerRepository = ownerRepository;
        this.ownerMapping = ownerMapping;
    }

    @Transactional
    public RequestOwnerDTO searchInfoAboutRegistration(RequestOwnerDTO dto) {
        System.out.println(dto.getTelephone());
        Optional<Owner> owner = ownerRepository.findByTelephone(dto.getTelephone());
        System.out.println(owner.toString());
        return ownerMapping.toDto(owner.orElse(null));
    }


/*    @Transactional
    public RequestOwnerDTO create(RequestOwnerDTO dto) {
        if (ownerRepository.existsByTelephone(dto.getTelephone())) {
            throw new EntityExistsException("Владелец с таким номером телефона уже существует");
        }
     //   Owner entity = ownerMapper.toEntity(dto);
      //  Owner savedEntity = ownerRepository.save(entity);
        return null; //ownerMapper.toDto(savedEntity);
    }*/
}
