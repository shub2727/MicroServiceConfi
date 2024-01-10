package com.example.RatingService.Service;

import com.example.RatingService.Entity.Rating;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);

    List<Rating> getAllRating();

    Rating getRatingById(Integer id);

    List<Rating> getRatingBYUserId(Integer id);

    List<Rating> getRatingBYHotelId(Integer id);
}
