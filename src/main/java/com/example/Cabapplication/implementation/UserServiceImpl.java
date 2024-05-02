package com.example.Cabapplication.implementation;

import org.springframework.stereotype.Service;
import com.example.Cabapplication.model.UserDetails;
import com.example.Cabapplication.services.UserService;
import java.util.Map;
import java.util.HashMap;
@Service
public class UserServiceImpl implements UserService {
   
    private Map<String, UserDetails> users = new HashMap<>();

    @Override
    public String registerUser(UserDetails userDetails) {
        users.put(userDetails.getUserName(), userDetails);
        return "User registered successfully";
    }
}