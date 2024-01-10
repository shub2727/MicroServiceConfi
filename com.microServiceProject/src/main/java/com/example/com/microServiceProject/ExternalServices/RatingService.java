package com.example.com.microServiceProject.ExternalServices;

import com.example.com.microServiceProject.Entity.Hotel;
import com.example.com.microServiceProject.Entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "REATING-SERVICE")
public interface RatingService {

    @GetMapping
    public Rating getHotel(@PathVariable Integer ratingId);


}
