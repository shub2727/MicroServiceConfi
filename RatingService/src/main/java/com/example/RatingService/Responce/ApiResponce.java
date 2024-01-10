package com.example.RatingService.Responce;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponce {

    private String message;
    private boolean success;
    private HttpStatus status;
}
