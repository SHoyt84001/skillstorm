package com.skillstorm.mathFunctions;

import java.util.Scanner;

class CompoundAndSimple {
	
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
				"To use the simple interest calculator, please type \"simple\"."
				+ 
				"\nHowever, if you would like to use compound calculator, please type \"compound\"."
				);
		
		String userInput = scanner.next();
		
		if (userInput.contains("simple")) {
			
			Scanner simpleScan = new Scanner(System.in);
			
			// Principal is P
			System.out.print("Please provide your principal. >");
			double P = simpleScan.nextDouble();
			
			// Interest is r
			System.out.print("Please provide your interest rate per year. >");
			double r = simpleScan.nextDouble() / 100;
			
			// years is t
			System.out.print("How many years will the loan be out for? >");
			double t = simpleScan.nextDouble();
			
			// accrued is A = P(1 + ir)
			double A = P * (1 + (r * t));
			
			System.out.format("\nThis is your accrued interest: $%,.2f " , (A - P));
			System.out.format("\nThis is your simple interest amount: $%,.2f" , A);
			
			System.out.println("\nThank you for using this calculator! Would you like to try out the compound calculator?");
		
			
			simpleScan.close();
			
		} 
		
		else if (userInput.contains("compound")) {
			
			Scanner compScan = new Scanner(System.in);
			
			System.out.print("Please provide your principle payment. >");
			double P = compScan.nextDouble();
			
			// r is rate of interest
			System.out.print("Please provide your yearly interest rate. >");
			double r = compScan.nextDouble() / 100;
			
			// t is time in years
			System.out.print("How many years is your loan out for? >");
			double t = compScan.nextDouble();
			
			// n is periods per year that compounding interest will accrue
			System.out.print("How many times does your interest compound per year? >");
			double n = compScan.nextDouble();
			
			// Following this formula: A = P * math.pow((1+r/n), (n*t))
			double compoundAmt = P * Math.pow(1 + (r / n), (t * n));
			
			System.out.format("\nThis should be your compound interest number: $%,.2f" , compoundAmt);
		
			compScan.close();
			
		} else {
			System.out.println("You typed: " + userInput);
		}
		
		scanner.close();
	}
}
