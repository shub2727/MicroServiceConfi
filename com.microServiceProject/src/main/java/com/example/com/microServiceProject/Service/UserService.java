package com.example.com.microServiceProject.Service;

import com.example.com.microServiceProject.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User saveUser(User user);
    List<User> getAllUser();
    User gerUser(Integer id);
}
