package com.example.com.microServiceProject.Service.Impl;

import com.example.com.microServiceProject.Entity.Hotel;
import com.example.com.microServiceProject.Entity.Rating;
import com.example.com.microServiceProject.Entity.User;
import com.example.com.microServiceProject.Exception.ResourceNotExeption;
import com.example.com.microServiceProject.ExternalServices.HotelService;
import com.example.com.microServiceProject.Repo.UserRepo;
import com.example.com.microServiceProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;


    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User gerUser(Integer id) {
        User user= userRepo.findById(id).orElseThrow(()-> new ResourceNotExeption("user not found on server"));

        Rating [] ratings= restTemplate.getForObject("http://REATING-SERVICE/user/"+user.getUserId(),Rating[].class);

        List<Rating> ratings1= Arrays.stream(ratings).toList();
       List<Rating> ratingList= ratings1.stream().map(rating -> {

         //  ResponseEntity<Hotel> forEntity= restTemplate.getForEntity("http://HOTEl-SERVICE/api/hotel/"+rating.getHotelId(), Hotel.class);
          Hotel hotel= hotelService.getHotel(rating.getHotelId());

           rating.setHotel(hotel);
           return rating;


       }).collect(Collectors.toList());

        user.setRatings(ratings1);
        return user;
    }
}
