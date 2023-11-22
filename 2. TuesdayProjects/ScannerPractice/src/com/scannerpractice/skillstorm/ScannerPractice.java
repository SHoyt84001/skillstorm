package com.scannerpractice.skillstorm;

//brings in existing class "scanner"

import java.util.Scanner;

// making new class

public class ScannerPractice {

	// creating main method
	
	public static void main(String[] args) {
		
		// creating a new object that the scanner can use at the input
		
		// system contains several classes that are useful
		// .in simply denotes user input at console
		
		Scanner inputObj = new Scanner(System.in);
		
		// tell user at console to provide specific input
		System.out.print("Please provide your name: ");
		
		// assigns input to variable "name" and outputs at the next line
		String name = inputObj.nextLine();
		
		// tell user at new console to provide specific inpou
		System.out.print("and now your age: ");
		
		// assigns input to variable "age" and outputs at the next line
		int age = inputObj.nextInt();
		
		// we concatonate the description of the input along with the user input
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		//close the scanner object to avoid a resource leak
		inputObj.close();
	}
}
