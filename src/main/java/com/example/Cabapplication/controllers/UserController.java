package com.example.Cabapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cabapplication.model.UserDetails;
import com.example.Cabapplication.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
   UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDetails userDetails) {
       return userService.registerUser(userDetails);
    }
}