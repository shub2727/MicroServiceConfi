package com.example.com.microServiceProject.Responce;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponce{

    private String message;
    private boolean success;
    private HttpStatus status;


    private String neww;
}
