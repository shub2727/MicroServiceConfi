package com.example.HotelService.Service.HotelImpl;


import com.example.HotelService.Exception.ResourceNotFoundException;
import com.example.HotelService.Repo.HotelRepo;
import com.example.HotelService.Service.HotelService;
import com.example.HotelService.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel getHotel(Integer id) {
        return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found"));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }
}
