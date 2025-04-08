package com.petclinic.spring.service;

import org.springframework.stereotype.Service;

@Service
public class OwnerService {
  //  private final OwnerRepository ownerRepository;
  //  private final OwnerMapper ownerMapper;

/*    @Autowired
    public OwnerService(OwnerRepository ownerRepository, OwnerMapper ownerMapper) {
        this.ownerRepository = ownerRepository;
        this.ownerMapper = ownerMapper;
    }


    public RequestOwnerDTO searchInfoAboutRegistration(RequestOwnerDTO dto) {
        if (ownerRepository.existsByTelephone(dto.getTelephone())) {
            return dto;
        }
        return create(dto);
    }


    @Transactional
    public RequestOwnerDTO create(RequestOwnerDTO dto) {
        if (ownerRepository.existsByTelephone(dto.getTelephone())) {
            throw new EntityExistsException("Владелец с таким номером телефона уже существует");
        }
        Owner entity = ownerMapper.toEntity(dto);
        Owner savedEntity = ownerRepository.save(entity);
        return ownerMapper.toDto(savedEntity);
    }*/
}
