package com.example.Cabapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cabapplication.exception.DriverNotFoundException;
import com.example.Cabapplication.model.DriverDetails;
import com.example.Cabapplication.services.DriverService;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/register")
    public String registerDriver(@RequestBody DriverDetails driverDetails) {
        return driverService.registerDriver(driverDetails);
    }

    @PostMapping("/addRideDetails")
    public String addRideDetails(@RequestParam String driverName,
            @RequestParam String source,
            @RequestParam String destination,
            @RequestParam String currentLocation) {
    	
    	  try {
              return driverService.addRideDetails(driverName, source, destination, currentLocation);
          } catch (DriverNotFoundException ex) {
              return ex.getMessage(); 
          }}
}