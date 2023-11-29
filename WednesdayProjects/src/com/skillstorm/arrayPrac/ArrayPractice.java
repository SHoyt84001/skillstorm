package com.skillstorm.arrayPrac;

import java.util.*;

public class ArrayPractice {
	public static void main(String[] args) {

		// part 1: setting an initial list of "favorite foods" and listing them out
		String[] favoriteFoods = new String[] { "Steamed Salmon", "Squash Soup", "Dahl" };
		System.out.println("Some of my favorite foods are: ");
		
		// i made a for loop to dump the contents of the array
		for (int i = 0; i < favoriteFoods.length; i++)
			System.out.println(favoriteFoods[i] + " ");
		
		// change my mind and replace index 1 of favoriteFoods with "raspberries"
		System.out.format("\nI've changed my mind about %s%n ",
				favoriteFoods[1] + ", " + "\nso let's change that to Raspberries.");
		favoriteFoods[1] = "Raspberries";

		System.out.println("\nAn updated list of my favorites are: ");
		for (int i = 0; i < favoriteFoods.length; i++)
			System.out.println(favoriteFoods[i] + " ");
		
		// decide to append the index with coffee at the end
		System.out.format("\nNow let's add something after %s%n ",
				favoriteFoods[2] + ", " + "\nlike a coffee, let's say.");
		
		// resize the array and assign "A nice coffee" to the end 
		favoriteFoods = Arrays.copyOf(favoriteFoods, 4);
		favoriteFoods[3] = "A nice coffee!";

		System.out.println("\nAn updated list of my favorites are: ");

		for (int i = 0; i < favoriteFoods.length; i++)
			System.out.println(favoriteFoods[i] + " ");

		
		// part 2
		
		
		int[] test1 = {1, 3, 5};
		System.out.print("\nHere is your last element: " + getLastElement(test1));

		int[] test2 = {1};
		System.out.print("\nHere is your last element: " + getLastElement(test2));
		
		// bonus
		int[] test3 = {};
		System.out.print("\nHere is your last element: " + getLastElement(test3));
		
		int[] test4 = null;
		System.out.print("\nHere is your last element: " + getLastElement(test4));
		
		
	}

	public static int getLastElement(int[] array) {

		// i want to find the length of the array and assign it to an int variable
		
		if (array == null || array.length == 0) 
			return 0;
		
		int lastPos = array.length - 1;
		
		return array[lastPos];

	}
	
}
