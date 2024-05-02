package com.example.Cabapplication.model;

public class RideDetails {

	private String source;
    private String destination;
    private String driverName;
    private String vehicleDetails;
    private String currentLocation;
    
	public RideDetails(String source, String destination, String driverName, String vehicleDetails, String currentLocation) {
		super();
		this.source = source;
		this.destination = destination;
		this.driverName = driverName;
		this.vehicleDetails = vehicleDetails;
		this.currentLocation=currentLocation;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getVehicleDetails() {
		return vehicleDetails;
	}
	public void setVehicleDetails(String vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
}
