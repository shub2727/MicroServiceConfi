package com.example.HotelService.Exception;



import com.example.HotelService.Responce.ApiResponcee;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHnadler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponcee> handlerResourceNotFound(ResourceNotFoundException re){

        String message= re.getMessage();
        ApiResponcee apiResponce= ApiResponcee.builder()
                .message(message)
                .success(true)
                .status(HttpStatus.NOT_FOUND)
                .build();

        return new  ResponseEntity<ApiResponcee>(apiResponce,HttpStatus.NOT_FOUND);
    }




}
