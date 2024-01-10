package com.example.HotelService.Exception;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(){
        super("Hotel not found ");
    }

    public ResourceNotFoundException(String message  ){
        super(message);
    }
}
