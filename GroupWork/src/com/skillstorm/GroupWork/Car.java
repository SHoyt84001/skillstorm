package com.skillstorm.GroupWork;

public class Car implements Vehicle {
	
	private String make;
	private String model;
	private int year;
	
	public Car () {}
	
	public Car(String make, String model, int year) {
		this.make = make; 
		this.model = model;
		this.year = year;
	}
	
	public void go() {
		System.out.println("Vroom");
		
	}
}
