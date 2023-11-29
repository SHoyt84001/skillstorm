package com.skillstorm.WeekThree;

public class TestCircle {
	public static void main(String[] args) {
		
		Circle defaultCircle = new Circle();
		Circle circleOne = new Circle(1.81);
		Circle circleTwo = new Circle(2.9);
		
		System.out.println("Testing default: " + defaultCircle.area());
		
		System.out.println("\nThis is your circleOne radius: " + circleOne.radius);
		System.out.println("This is your circleOne diameter: " + circleOne.diameter());
		System.out.println("this is your circleOne perimeter: " + circleOne.perimeter());
		System.out.println("this is your circleOne area: " + circleOne.area());
		System.out.println("this is your circleOne circum: " + circleOne.circumference());
		
		System.out.println("\nThis is your circleTwo radius: " + circleTwo.radius);
		System.out.println("This is your circleTwo diameter: " + circleTwo.diameter());
		System.out.println("this is your circleTwo perimeter: " + circleTwo.perimeter());
		System.out.println("this is your circleTwo area: " + circleTwo.area());
		System.out.println("this is your circleTwo circum: " + circleTwo.circumference());
		
		System.out.println("\nChecking to see if the circles are the same: " + circleOne.checkCircles(circleOne, circleTwo));
	}
}
