package com.example.com.microServiceProject.ExternalServices;

import com.example.com.microServiceProject.Entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
    @GetMapping("/api/hotel/{hotelId}")
    public Hotel getHotel(@PathVariable Integer hotelId);
}
