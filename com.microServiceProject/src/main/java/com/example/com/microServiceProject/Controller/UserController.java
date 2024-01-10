package com.example.com.microServiceProject.Controller;

import com.example.com.microServiceProject.Entity.User;
import com.example.com.microServiceProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    ResponseEntity<User> createUserr(@RequestBody User user){

        User user1= userService.saveUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }


    @GetMapping("/{userId}")
    ResponseEntity<User> getSinglrUser(@PathVariable Integer userId){
       User user1= userService.gerUser(userId);

       return new ResponseEntity<>(user1,HttpStatus.CREATED);

    }

    @GetMapping
    ResponseEntity<List<User>> getAllUser(){
        List<User> users= userService.getAllUser();
        return new ResponseEntity<>(users,HttpStatus.CREATED);
    }
}
