package com.exercise1.poo_spring4.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerExceptions {

    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<ExceptionsDetails> handlerDuplicateException(DuplicateException ex){
        ExceptionsDetails exceptionsDetails = ExceptionsDetails.builder()
                .title("Object already exist")
                .message(ex.getMessage())
                .status(HttpStatus.CONFLICT.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return  new ResponseEntity<>(exceptionsDetails, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundException.class)
    public  ResponseEntity<ExceptionsDetails> handlerNotFoundException(NotFoundException ex){
        ExceptionsDetails exceptionsDetails = ExceptionsDetails.builder()
                .title("Object not found")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(exceptionsDetails,HttpStatus.NOT_FOUND);
    }
}
