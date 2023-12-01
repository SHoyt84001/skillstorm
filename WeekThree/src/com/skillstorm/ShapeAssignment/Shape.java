package com.skillstorm.ShapeAssignment;

public class Shape {
	
	public double area; 
	public double perimeter; 
	public int sides; 
	public int vertices;
	
	public Shape () {}
	
	public Shape(int sides, int vertices) {
		return;
	}
	
	public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Area: " + area + "\nPerimeter: " + perimeter + "\nSides: " + sides + "\nVertices: " + vertices;
	}
}
