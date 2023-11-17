package com.skillstorm.libs;

import java.util.Scanner;

public class MadLib {
	
	public static void main(String[] args) {

		Scanner MadLibIn = new Scanner(System.in);

		System.out.println("Welcome to my version of MadLibs.");

		System.out.print("\nPlease give a noun: ");

		String noun = MadLibIn.nextLine();

		System.out.print("\nPlease give a number: ");

		int number = MadLibIn.nextInt();

		// scanner.nextInt(); and scanner.next(); both do a similar thing.
		// scanner.nextInt(); reads the integer and keeps the \R induced by
		// carriage-return
		// scanner.next(); reads the line and keeps the \R induced by carriage-return
		// UNLIKE both of these methods, nextLine(); sees the carriage-return and
		// skips/eats it
		// Another method to avoid it is the scanner.skip(); method alongside regex to
		// find the carriage-return
		// standard practice, therefor, seems to indicate that scanner.nextLine(); is a
		// best-practice behavior
		// following the use of scanner.nextInt();

		/*
		 * in summary, these two methods achieve the same goal of removing the
		 * carriage-return:
		 * 
		 * MadLibIn.nextLine(); AND MadLibIn.skip("((?<!\\R)\\s)*");
		 *
		 * 
		 *
		 */

		MadLibIn.nextLine();

		System.out.print("\nPlease give a location: ");

		String location = MadLibIn.nextLine();

		System.out.print("\nPlease give an animal: ");

		String animal = MadLibIn.nextLine();

		System.out.print("\nPlease give another number: ");

		int amazedPopulace = MadLibIn.nextInt();

		System.out.println("\nExcellent! Let's make something creative out of all of that!\n");

		System.out.println("A " + noun + " was launched " + number
				+ " feet into the air by a bored NASA experimental-research team in " + location + ".\n" + "The town "
				+ animal + " demonstrated great courage by being present during the test-flight.\n"
				+ "Local news reports indicate that up to " + amazedPopulace
				+ " people are waiting in line to meet the brave " + animal + " and share in their limelight.");

		MadLibIn.close();
	}
}