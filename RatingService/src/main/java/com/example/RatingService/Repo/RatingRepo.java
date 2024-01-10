package com.example.RatingService.Repo;

import com.example.RatingService.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,Integer> {


    List<Rating> findByUserId(Integer integer);
    List<Rating> findByHotelId(Integer integer);
}
