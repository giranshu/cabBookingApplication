package com.example.Cabapplication.services;
import com.example.Cabapplication.model.RideDetails;
import java.util.List;

public interface RideService {

	List<RideDetails> searchRides(String source, String destination);
    String chooseRide(String username, String driverName);
	
}
