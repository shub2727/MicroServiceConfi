package com.example.com.microServiceProject.Exception;

public class ResourceNotExeption extends RuntimeException{

    public ResourceNotExeption (){
        super("Resource not found on service !!");
    }

    public ResourceNotExeption(String msg){
        super(msg);
    }

}
