package com.petclinic.spring.controller;

import com.petclinic.spring.dto.RequestOwnerDTO;
import com.petclinic.spring.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class OwnerController {
    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/search")
    public RequestOwnerDTO searchInfoAboutOwner(@RequestParam("telephone") String telephone) {
        System.out.println("--------------------------------");
        RequestOwnerDTO dto = new RequestOwnerDTO();
        dto.setTelephone(telephone);
        return ownerService.searchInfoAboutRegistration(dto);
    }

/*    @PostMapping("/create")
    public void createNewOwner(@RequestBody RequestOwnerDTO dto) {
        ownerService.create(dto);
    }*/


}
