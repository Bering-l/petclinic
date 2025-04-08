package com.petclinic.spring.exception;

import jakarta.persistence.EntityExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityExistsException.class)
    public ResponseEntity<String> handleEntityAlreadyExistsException(EntityExistsException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
