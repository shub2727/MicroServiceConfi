package com.example.com.microServiceProject.Exception;

import com.example.com.microServiceProject.Responce.ApiResponce;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotExeption.class)
    public ResponseEntity<ApiResponce> handlerResourceNotFoundException(ResourceNotExeption resourceNotExeption){

        String message = resourceNotExeption.getMessage();
      ApiResponce build = ApiResponce.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();

        return new ResponseEntity<ApiResponce>(build,HttpStatus.NOT_FOUND);


    }
}
