package com.example.HotelService.Responce;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponcee {

    private String message;
    private boolean success;
    private HttpStatus status;
}
