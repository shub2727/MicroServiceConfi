package com.example.RatingService.Service.Impl;

import com.example.RatingService.Entity.Rating;
import com.example.RatingService.Exception.ResourceNotExeption;
import com.example.RatingService.Repo.RatingRepo;
import com.example.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
   private   RatingRepo ratingRepo;


    @Override
    public Rating create(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public Rating getRatingById(Integer id) {
        return ratingRepo.findById(id).orElseThrow(()->new ResourceNotExeption("no id found"));
    }

    @Override
    public List<Rating> getRatingBYUserId(Integer id) {
        return ratingRepo.findByUserId(id);
    }

    @Override
    public List<Rating> getRatingBYHotelId(Integer id) {
        return ratingRepo.findByHotelId(id);
    }
}
