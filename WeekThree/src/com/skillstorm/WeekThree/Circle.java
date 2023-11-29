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
	
	
	public Circle(double radius) {
		this();
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
	
	public boolean checkCircles(Circle circleOne, Circle circleTwo) {
		
		boolean isSame = false;
		
		if (circleOne == circleTwo) {
			isSame = true;
		} else isSame = false;
			
		return isSame;
	}
}
