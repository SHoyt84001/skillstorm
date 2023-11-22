package com.skillstorm.mathFunctions;

import java.util.Scanner;

public class AssignmentZodiac {
	public static void main (String[] args) {
		
		
		// Part I, output the following to console:
		//  ello
		//  world
		//  o
		//  !
		
		String helloWorld = "Hello world!";
		System.out.println(helloWorld.substring(1, 5));
		System.out.println(helloWorld.substring(6, 11));
		System.out.println(helloWorld.substring(4, 6));
		System.out.println(helloWorld.substring(11));
		
		
	
		
		// Part II, Zodiac Animals
		
		String zodAnimals = 
                "Monkey    " +
                "Rooster   " +
                "Dog       " +
                "Pig       " +
                "Rat       " +
                "Ox        " +
                "Tiger     " +
                "Rabbit    " +
                "Dragon    " +
                "Snake     " +
                "Horse     " +
                "Goat      "
                ;
		
		
		
		Scanner zodiacScan = new Scanner(System.in);
		System.out.print("Please input your birth year: ");
		
		int birthYear = zodiacScan.nextInt(); zodiacScan.nextLine();
		
		int positionInList = birthYear % 12;
		System.out.println("This is your zodiac month: " + positionInList);
		
		int startPositionInString = positionInList * 10;
		int nextPositionInList = positionInList + 1;
		int endPositionInList = nextPositionInList * 10;
		
		String zodYear = zodAnimals.substring(startPositionInString, endPositionInList).trim();
		System.out.println("Your zodiac month is " + zodYear);
		
		
		zodiacScan.close(); 
		
	}
}
