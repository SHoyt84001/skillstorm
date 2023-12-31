package com.skillstorm.typecast;

public class typeCast {

	public static void main (String[] args) {
		
		// we create two variables that we will use to widen and narrow their data types, respectively
		int isInt = 10; 
		double isDouble = 1239.1481; 
		
		// we change the int variable isInt into a double
		// leading zeroes will be converted to a single 0 
		double changedFromInt = isInt;		
		
		// we change the double variable isDouble into an int
		// this removes all integers to the right of the decimal, and the decimal itself
		int changedFromDouble = (int)isDouble; 
		
		// this process of changing an int to a double is called: 
		// WIDENING
		System.out.println("This was an int, holding the value of 10: " + changedFromInt);
		
		// this process of changing a double to an int is called:
		// NARROWING
		System.out.println("This was a double, holding a value of 1239.1481: " + changedFromDouble);
		
		
		
		
		
		
		// observing how bit-flipping occurs with the space used by a max_value + 1 int
		int x = Integer.MAX_VALUE + 1;
		System.out.println(x);
		
		// observing how converting a double to a float cuts and rounds up the last number
		// does not matter what the number is, it will round up
		double y = 1.123456989123456;
		float z = (float) y; 
		System.out.println(z); 
			
	}
}