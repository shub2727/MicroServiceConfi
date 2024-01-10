package com.example.RatingService.Exception;

public class ResourceNotExeption extends RuntimeException{

    public ResourceNotExeption (){
        super("Resource not found on service !!");
    }

    public ResourceNotExeption(String msg){
        super(msg);
    }

}
