package com.skillstorm.tuesday2;

public class ParameterNamesIgnoredExamples {
	
		public static void main(String [] args) {
			printSum(1, 2); 
			System.out.println();
		}
	
		public static void printSum(int x, int y) {
			System.out.println("x = " + x + ", y = " + y);
		}
}
