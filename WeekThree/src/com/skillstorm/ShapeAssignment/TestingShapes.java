package com.skillstorm.ShapeAssignment;

public class TestingShapes {
	public static void main(String[] args) {

		Triangle triArea = new Triangle(2, 4);
		Triangle triPerim = new Triangle(1, 3, 4);
		Hexagon hexArea = new Hexagon(2);
		Hexagon hexPerim = new Hexagon(162);
		
		System.out.printf("Triangle perim: %,.2f", triPerim.perimeter()); 
		System.out.printf("\nTriangle area: %,.2f" , triArea.area());
		System.out.printf("\nHex area: %,.2f " , hexArea.area());
		System.out.printf("\nHex perim: %,.2f ", hexPerim.perimeter());
	}
}
