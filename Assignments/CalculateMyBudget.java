package com.skillstorm.scanners;
// importing collection for scanners
import java.util.Scanner;

public class CalculateMyBudget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			// declare and define new scanner object
			// new Scanner() can take <System.in> for user input OR even a variable/array/string/etc. See other class in this project for example
			Scanner calculatorInput = new Scanner(System.in);
		
			System.out.println("Welcome to the budget calculator!\n");
			System.out.print("How much do you make a month? ");
			
			double userIncome = calculatorInput.nextDouble();
			System.out.println("\nNow, let's look at your expenses.\n");
			System.out.print("How much is your rent? ");
			
			double userRent = calculatorInput.nextDouble();
			System.out.print("How much is your utility? ");
			
			double userUtility = calculatorInput.nextDouble();
			System.out.print("How much is your car insurance? ");
			
			double userCarIns = calculatorInput.nextDouble();
			
			double remainder = userIncome - (userRent + userUtility + userCarIns);
			System.out.println("After expenses, you should save: $" + remainder + ".");
			
			// Remember to close the scanner
			calculatorInput.close();
					
	}

}
