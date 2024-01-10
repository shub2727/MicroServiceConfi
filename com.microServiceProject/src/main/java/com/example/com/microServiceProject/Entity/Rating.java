package com.example.com.microServiceProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Rating {


    private Integer ratingId;
    private Integer userId;
    private Integer hotelId;
    private Integer rating;
    private String feedback;
    private Hotel hotel;



}
