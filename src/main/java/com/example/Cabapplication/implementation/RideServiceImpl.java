package com.example.Cabapplication.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Cabapplication.model.RideDetails;
import com.example.Cabapplication.services.RideService;

@Service
public class RideServiceImpl implements RideService {

    private List<RideDetails> availableRides = new ArrayList<>();

    @Override
    public List<RideDetails> searchRides(String source, String destination) {
        List<RideDetails> matchedRides = new ArrayList<>();

        for (RideDetails ride : availableRides) {
            if (ride.getSource().equalsIgnoreCase(source) && 
                ride.getDestination().equalsIgnoreCase(destination)) {
                matchedRides.add(ride);
            }
        }
        return matchedRides;
    }


    @Override
    public String chooseRide(String username, String driverName) {
        for (RideDetails ride : availableRides) {
            if (ride.getDriverName().equalsIgnoreCase(driverName)) {
                availableRides.remove(ride);
                return "Ride chosen successfully";
            }
        }
        return "Ride with driver " + driverName + " not found";
    }
}
