package com.skillstorm.mathFunctions;

import java.util.Scanner;

public class SimpleInterest {
	public static void main (String[] args) {
		
		// Simple Interest Calculator
		// It needs to ask the user for their principal, rate (as a percentage), 
		// and the amount of time Print out the results with 2 decimal places
		
		
		//  A = P + I = P + (Prt)
		//  A = P(1 + rt)
		//
		//	 A = Total Accrued Amount (principal + interest)
		//	 P = Principal Amount
		//	 I = Interest Amount
		//	 r = Rate of Interest per year in decimal; r = R/100
		//	 R = Rate of Interest per year as a percent; R = r * 100
		//	 t = Time Period involved in months or years

		
		
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
	
		
		simpleScan.close();
	}
}
