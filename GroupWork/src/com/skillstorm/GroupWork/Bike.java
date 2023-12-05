package com.skillstorm.GroupWork;

public class Bike implements Vehicle {
	
	private String color; 
	private int numGears; 
	
	public Bike() {}
	
	public Bike(String color, int numGears) {
		this.color = color; 
		this.numGears = numGears;
	}

	@Override
	public void go() {
		System.out.println("peddle");
	}

	@Override
	public String toString() {
		return "Bike color: " + color + ", numGears: " + numGears;
	}
	
	
}
