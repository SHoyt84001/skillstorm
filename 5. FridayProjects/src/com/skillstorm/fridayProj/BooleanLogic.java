package com.skillstorm.fridayProj;

import java.util.Scanner;

public class BooleanLogic {

		public static void main(String[] args) {
			
			// Example 1: prompt user to provide yes or no, and give different output depending
		
		Scanner askScan = new Scanner(System.in);
		
		System.out.println("Are you dumb?" + "\nY/N: ");
		
		String response = askScan.nextLine().toLowerCase();
			if (response.contains("y")) {
				System.out.println("Well that's a silly thing to say!");
			} else {
				System.out.println("Well that's just ignorant to say!");
			}
			
			
			// Example 2: nested logic
			
			System.out.println("What is your age? >");
			int age = askScan.nextInt(); askScan.nextLine();
			
			System.out.println("Do you live in the US? Y/N: >");
			String liveInUS = askScan.nextLine();
			
			if (!liveInUS.toLowerCase().contains("y")) {
				if (age >= 18) {
					System.out.println("Here ya go!");
				} else {
					System.out.println("You're way too young, fella.");
				}
			} else {
				if (age >= 21) {
					System.out.println("Enjoy your drink!");
				} else {
					System.out.println("Go away!");
				}
			}
			
			// Example 2 version 2: logic combinators
			
			if  (age <= 18) {
				System.out.println("Go away!");
			} else if (!liveInUS.toLowerCase().contains("y") && age >= 18) {
				System.out.println("Here ya go!");
			} else {
				
			}
			
		askScan.close();
		
		}
		
}
