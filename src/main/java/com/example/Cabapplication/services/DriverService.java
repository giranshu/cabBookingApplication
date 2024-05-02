package com.example.Cabapplication.services;

import com.example.Cabapplication.model.DriverDetails;

public interface DriverService {

	String registerDriver(DriverDetails driverDetails);
    String addRideDetails(String driverName, String source, String destination, String currentLocation);

}
