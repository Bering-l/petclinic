package com.petclinic.spring.service;

import com.petclinic.spring.dto.RequestAnimalDTO;
import com.petclinic.spring.dto.RequestBreedDTO;
import com.petclinic.spring.dto.RequestOwnerDTO;
import com.petclinic.spring.entity.*;
import com.petclinic.spring.repository.AnimalRepository;
import com.petclinic.spring.repository.BreedRepository;
import com.petclinic.spring.repository.OwnerRepository;
import jakarta.persistence.EntityExistsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class AnimalServiceTest {

    @Mock
    private AnimalRepository animalRepository;
    @Mock
    private OwnerRepository ownerRepository;
    @Mock
    private BreedRepository breedRepository;
    @Mock
    private RequestAnimalDTO requestAnimalDTO;
    @Mock
    private RequestOwnerDTO requestOwnerDTO;
    @Mock
    private RequestBreedDTO requestBreedDTO;

    @InjectMocks
    private AnimalService animalService;

    private Animal animal;
    private Owner owner;

    @BeforeEach
    void setUp() {
        animal = new Animal(); // Initialize animal here
        owner = new Owner(1L, "Тестовый", "Владелец",
                "78005009090", new Address(1L),  null, List.of(animal));
        animal.setAnimalId(1L);
        animal.setBreed(new Breed(4L));
        animal.setAnimalName("Енотик");
        animal.setGender("F");
        animal.setDescription("тот еще енотик");
        animal.setDateOfBirth(LocalDate.of(2022,1, 14));
        animal.setOwner(owner);
        animal.setAnimalType(new AnimalType(2L));
    }

    @Test
    void createAnimal_whenAnimalDoesNotExist_shouldSaveAnimal() {
        Animal animal = new Animal();
        animal.setAnimalId(null);

        given(animalRepository.save(any(Animal.class)))
                .willAnswer(invocation -> invocation.getArgument(0));

        animalService.saveNewAnimal(animal);

        verify(animalRepository, times(1)).save(animal);
    }

    @Test
    void saveNewAnimal_entityAlreadyExists_throwsException() {
        when(animalRepository.findById(anyLong()))
                .thenReturn(Optional.of(animal));

        EntityExistsException exception = assertThrows(
                EntityExistsException.class,
                () -> animalService.saveNewAnimal(animal)
        );

        assertEquals("Животное с id 1 уже создано", exception.getMessage());

        verify(animalRepository, never()).save(any());
    }

    @Test
    void deleteAnimal_whenAnimalExists_shouldReturn200() {
/*        Long animalId = 1L;
        when(animalRepository.existsById(animalId)).thenReturn(true);

        ResponseEntity<?> response = animalService.deleteAnimalId(animalId);

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        verify(animalRepository, times(1)).deleteById(animalId);*/
    }
}
