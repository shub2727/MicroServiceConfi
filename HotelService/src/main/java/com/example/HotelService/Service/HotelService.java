package com.example.HotelService.Service;

import com.example.HotelService.entity.Hotel;

import java.util.List;

public interface HotelService {


    Hotel create(Hotel hotel);
    Hotel getHotel(Integer id);

    List<Hotel> getAllHotel();
}
