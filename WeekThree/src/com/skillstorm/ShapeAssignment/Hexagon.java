package com.skillstorm.ShapeAssignment;

public class Hexagon extends Shape{
	
	int equalSide; 
	
	public Hexagon () {}
	
	public Hexagon (int equalSide) {
		this.equalSide = equalSide; 
	}
	
	public double area() {
		return 3*Math.sqrt(3)*Math.pow(equalSide, 2)/2;
	}
	
	public double perimeter() {
		return equalSide * 6;
	}
}
