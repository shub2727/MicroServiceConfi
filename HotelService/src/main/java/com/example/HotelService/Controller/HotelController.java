package com.example.HotelService.Controller;

import com.example.HotelService.Service.HotelService;
import com.example.HotelService.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){

        Hotel hotel1= hotelService.create(hotel);

        return new ResponseEntity<>(hotel, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Hotel>> getHotels(){

       List<Hotel> hotel1= hotelService.getAllHotel();

        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("/{hotelID}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Integer hotelID){

        Hotel hotel1= hotelService.getHotel(hotelID);

        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

}
