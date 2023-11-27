package com.skillstorm.WeekThree;

import java.util.Arrays;

public class FindMax {
	/**
	 * Write a method named findMax that takes in an int array  
	 * and uses a for loop to find the max value in the array. 
	 * You can assume all the values in the array are non-negative numbers. 
	 * (Do not use the Collections class, instead practice writing the logic by hand.)
	 */
	
	public static void main (String[] args) {
		
		// test for positive numbers
		int[] testLargePos = {400, 8, 1, 401, 289};
		System.out.printf("The highest positive value in your array is: %d\n", findMaxPos(testLargePos));
		
		// test for largest negative number
		int[] testLargeNeg = {5, -10, -1, 4, -400, -14, -5, -9, -18, -57, 6};
		System.out.printf("The highest negative value in your array is: %d\n", findMaxNeg(testLargeNeg));
	
		// test for negative numbers
		int[] testLowNeg = {4, -1, -4, -6, -10};
		System.out.printf("The lowest negative value in your array is: %d\n", findLowNeg(testLowNeg));
		
		// test for minimum value in an array
		int[] testMinPos = {4, 12, 1};
		System.out.printf("The lowest positive value in your array is: %d\n", findMinPos(testMinPos));
		
		// test for empty
		int[] testEmpty = {}; 
		System.out.printf("ERROR: EMPTY ARRAY! ARRAY VALUE: %d\n",findMaxPos(testEmpty));
		
		int[] testNull = null;
		System.out.printf("ERROR: NULL VALUE FOUND! ARRAY VALUE: %d\n", findMaxPos(testNull));
		
		
	}
	
	public static int findMaxPos(int[] array) {

		
		
		if (array == null || array.length == 0){
			return 0;
		}
		
		// declare variables 
		int largestValue = 0; 

		int i;
		
		// i want to take the first index in the array and compare it to the next
		// then i want it to loop every time, going to the next position in the array
		// replacing the value of largestValue with the value at the index 
		
		
		//{4, 19, 1};
		
		for (i = 0; i < array.length; i++) {
			if (largestValue > array[i]) {
			} else largestValue = array[i];
		
		}
		
		return largestValue; 
		
	}
	
	public static int findMaxNeg(int[] array) {
		
		if (array == null || array.length == 0) {
			return 0;
		}
		
		// declare variables 
		Arrays.sort(array);
		
		int maxNeg = array[0]; 
		
		int i;
		
		// {5, -10, -1, 4, -400, -14, -5, -9, -18, -57, 6}
		
		for (i = 1; i < array.length; i++) {
			if (array[i] < 0 && maxNeg < array[i]) {
				maxNeg = array[i];
			}
			
		}
		
		return maxNeg; 
	}

	public static int findLowNeg(int[] array) {
		
		if (array == null || array.length == 0) {
			return 0;
		}
		
		// declare variables 
		int lowestValue = 0; 

		int i;
		
		for (i = 0; i < array.length; i++) {
			if (array[i] < lowestValue) {
				lowestValue = array[i];
			}
		
		}
		
		return lowestValue; 
	}

	public static int findMinPos(int[] array) {
		
		if (array == null || array.length == 0) {
			return 0;
		}
		
		int minValue = array[0];
		int i;
		
		for (i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	
}

