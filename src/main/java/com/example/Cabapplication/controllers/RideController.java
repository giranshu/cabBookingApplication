package com.example.Cabapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cabapplication.model.RideDetails;
import com.example.Cabapplication.services.RideService;

@RestController
@RequestMapping("/rides")
public class RideController {

    @Autowired
    RideService rideService;

    @GetMapping("/search")
    public List<RideDetails> searchRides(@RequestParam String source,
                                         @RequestParam String destination) {
        return rideService.searchRides(source, destination);
    }

    @PostMapping("/choose")
    public String chooseRide(@RequestParam String username,
                             @RequestParam String driverName) {
        return rideService.chooseRide(username, driverName);
    }
}
