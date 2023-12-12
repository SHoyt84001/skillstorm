package com.skillstorm.WeekThree;

import java.util.*;

public class Circle {
	
	int center; 
	double radius; 
	double diameter; 
	double perimeter;
	double circumference;
	double area;

	public Circle() {
		this.center = 0;
		this.radius = 0;
		this.diameter = 0;
		this.perimeter = 0;
		this.circumference = 0;
		this.area = 0;
	}
	
	
	public Circle(double radius) throws InvalidSizeException {
		this();
		if(radius < 0 ) {
			throw new InvalidSizeException("Radius cannot be negative");
		}
		this.radius = radius;
	}


	public void setRadius(double radius) throws InvalidSizeException{
		if(radius < 0 ) {
			throw new InvalidSizeException("Radius cannot be negative");
		}
		this.radius = radius;
	}

	
	public double diameter() {
		return diameter = radius * 2;
	}
	
	public double perimeter() {
		return Math.PI * diameter;
	}
	
	public double circumference() {
		return 2 * (Math.PI * radius);
	}
	
	public double area() {
		return Math.PI * (radius * radius);
	}
	
	
	public double getRadius() {
		return radius;
	}

	public boolean checkCircles(Circle circleOne, Circle circleTwo) {
		
		boolean isSame = false;
		
		if (circleOne == circleTwo) {
			isSame = true;
		} else isSame = false;
			
		return isSame;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + ", diameter=" + diameter + ", perimeter=" + perimeter
				+ ", circumference=" + circumference + ", area=" + area + "]";
	}
	
	
}
