package com.skillstorm.WeekThree;
import java.util.*;

public class TestCircle {
	public static void main(String[] args) {
		Scanner userQ = new Scanner(System.in);
		
		System.out.println("Please provide your radius, testing InvalidSizeException: ");
		
		double userR = userQ.nextDouble();
		
//		Circle defaultCircle = new Circle(userR);
//		
//		System.out.println("Your radius: " + defaultCircle);

		try {
			Circle newCircle = new Circle();
			newCircle.setRadius(userR);
			System.out.println("Your radius: " + newCircle.getRadius());
		} catch (InvalidSizeException e){
			System.out.println("Exception in thread \"main\" com.skillstorm.WeekThree.InvalidSizeException: Radius cannot be negative" + e.getMessage);
		}

		userQ.close();
	}
}
