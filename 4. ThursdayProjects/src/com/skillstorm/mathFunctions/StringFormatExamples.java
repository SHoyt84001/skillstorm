package com.skillstorm.mathFunctions;

public class StringFormatExamples {
	
	public static void main(String[] args) {
		
		// at the store, they have cookies for sale
		// 1.99 for 5 but i don't wanna eat 5
		// i just want to buy 1
		double costFor5 = 1.99 / 5;
		String formattedString = String.format("One cookie is $%.2f today!", costFor5);
		
		System.out.println(formattedString);
		
		
	}
}
