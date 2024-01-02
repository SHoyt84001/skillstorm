package com.skillstorm.PatternForLoops;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Hello! How many stars would you like?");
		
		int userChoice = userIn.nextInt();
		
		if (userChoice <= 0) {
			System.out.println("Choose a positive number, please.");
			userIn.nextInt();
		}
		
		for(int i = 1; i <= userChoice; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = userChoice - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// make a method to handle the star pattern
	public void handleStarMethod(Scanner scanner) {
		
	}
}
