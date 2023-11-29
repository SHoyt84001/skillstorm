package com.skillstorm.WeekThree;

public class Car {
	
	String make;
	int year; 
	String model; 
	String color; 
	Person owner;
	String vin; 
	int howManyCupholders;
	boolean hasRecall;
	boolean hasLicensePlate;
	boolean isRegistered;
	double mileage;


	public Car(String make, int year, String model) {
		this();
		this.make = make;
		this.year = year;
		this.model = model;
	}

	public Car() {
		this.make = "Toyota";
		this.year = 2010;
		this.model = "Camry";
		this.color = "Blue";
		this.owner = null;
		this.vin = null;
		this.howManyCupholders = 12;
		this.hasRecall = false;
		this.hasLicensePlate = true;
		this.isRegistered = true;
		this.mileage = 45_000;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", model=" + model + ", color=" + color + ", owner=" + owner
				+ ", vin=" + vin + ", howManyCupholders=" + howManyCupholders + ", hasRecall=" + hasRecall
				+ ", hasLicensePlate=" + hasLicensePlate + ", isRegistered=" + isRegistered + ", mileage=" + mileage
				+ "]";
	}
}
