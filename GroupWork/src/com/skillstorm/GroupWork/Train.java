package com.skillstorm.GroupWork;

public class Train implements Vehicle{

	private String color;
	private int numCars;
	
	public Train() {}
	
	public Train(String color, int numCars) {
		this.color = color;
		this.numCars = numCars;
	}
	
	public void go() {
		System.out.println("Chugga-chugga-chugga(choo choo)");
	}

}
