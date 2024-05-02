package com.example.Cabapplication.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.Cabapplication.exception.DriverNotFoundException;
import com.example.Cabapplication.model.DriverDetails;
import com.example.Cabapplication.model.RideDetails;
import com.example.Cabapplication.services.DriverService;


@Service
public class DriverServiceImpl implements DriverService {

    private Map<String, DriverDetails> drivers = new HashMap<>();
    private List<RideDetails> availableRides = new ArrayList<>();

    @Override
    public String registerDriver(DriverDetails driverDetails) {
        drivers.put(driverDetails.getDriverName(), driverDetails);
        return "Driver registered successfully " + driverDetails.getDriverName();
    }

    @Override
    public String addRideDetails(String driverName, String source, String destination, String currentLocation) {
        DriverDetails driver = drivers.get(driverName);
        if (driver != null) {
            RideDetails rideDetails = new RideDetails(source, destination, driverName, driver.getVehicleDetails(), currentLocation);
            rideDetails.setCurrentLocation(currentLocation);
            availableRides.add(rideDetails);
            return "Ride details added successfully for driver " + driverName;
        } else {
            throw new DriverNotFoundException("Driver not found for name: " + driverName);
        }
    }
}