package com.skillstorm.mathFunctions;

import java.util.Scanner;

public class CompoundInterest{
	public static void main (String[] args) {
		
		// Compound Interest Calculator
		// it needs to ask the user for the principal, interest rate, 
		// number of times per year the interest is compounded, 
		// and the time in years
		
		// A = P(1 + r/n)^nt
		//
		//  A = Principal(amount) + Interest(amount)
		//  r = Annual nominal interest rate
		//  R = Annual nominal interest rate as a percent
		//  r = R/100
		//  n = number of compounding periods per unit of time
		//  t = time in decimal years
		//  I = interest amount
		//  ln = natural logarithm
		
		
		Scanner compScan = new Scanner(System.in);
		
		// P is principal
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
		
		
		
	}
}