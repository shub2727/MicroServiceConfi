package com.example.RatingService.Controller;

import com.example.RatingService.Entity.Rating;
import com.example.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    ResponseEntity<Rating> createUserr(@RequestBody Rating rating){

        Rating user1= ratingService.create(rating);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @GetMapping
    ResponseEntity<List<Rating> > FindAll(){

       List<Rating> user1= ratingService.getAllRating();
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @GetMapping("/user/{userId}")
    ResponseEntity<List<Rating> > findByUserId(@PathVariable Integer userId){

        List<Rating> user1= ratingService.getRatingBYUserId(userId);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @GetMapping("/hotel/{hotelId}")
    ResponseEntity<List<Rating> > findByHotelId(@PathVariable Integer hotelId){

        List<Rating> user1= ratingService.getRatingBYHotelId(hotelId);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @GetMapping("/ratingID")
    ResponseEntity<Rating> findById(@PathVariable Integer ratingID){

        Rating user1= ratingService.getRatingById(ratingID);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }



}
