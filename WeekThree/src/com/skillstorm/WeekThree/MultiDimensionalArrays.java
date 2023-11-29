package com.skillstorm.WeekThree;

import java.util.*;

public class MultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		///////////////////////EXAMPLE 1.1: FOR LOOP, INDIRECTLY DECLARED/////////////////////
		
		int[][] nums = new int [5][15];
		
		nums[0][0] = 1; nums[1][0] = 1; nums[2][0] = 1; nums[3][0] = 1; nums[4][0] = 1; 
		nums[2][1] = 1; nums[0][2] = 1; nums[1][2] = 1; nums[2][2] = 1; nums[3][2] = 1;
		nums[4][2] = 1; 
		
		
		System.out.println("Indirectly-declared 2D Array with an initialized value:");
		for (int i = 0; i < 5;i++) {
			 for (int j = 0; j < 15; j++) {
				 System.out.print(nums[i][j] + " "); // instead of println, we can do print and add a space between each element
			 }
			 System.out.println(); // and after every row is output, just printl
		} 
		//////////////////////////////////////////////////////////////////////////////////////
		
		
		
		////////////////////////EXAMPLE 1.2: FOR LOOP, DIRECTLY DECLARED//////////////////////
		
		System.out.println("\nDirectly-declared 2D array with specified values initialized:");
		
		int[][] nums2 = {{1, 2, 3},{3, 5, 3},{9, 6, 34}};
		
		for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 System.out.print(nums2[i][j] + " ");
			 } System.out.println();
		} 
		//////////////////////////////////////////////////////////////////////////////////////
		
	
		
		
		// If we want to assign numbers to each element, let's say random 1(incl) to 10 (excl)
		
/**
		 for (int i = 0; i < 3;i++) {
		 	  for (int j = 0; j < 4; j++) {
		 	    	 nums[i][j] = (int) (Math.random() * 10);
		 	  } 
		    }
		 // To call a specific number on a row and column, simply call the 2D array
		 System.out.println("This is the number at position nums[1][3]: " + nums[1][3]);
*/
		
		
		
		
		// In multi-dimensional arrays, we have to use nested loops to output the contents

		
		
		
		// EXAMPLE 2: ENHANCED FOR LOOP
		
/**
		for (int n[]: nums) {
			for (int m: n) {
				System.out.print(m + " ");
			} System.out.println(); 
		}
*/
		
		//_______________________________VISUAL FOR-LOOP_________________________________//
		
		///////////////////////////////////////////////////////////////////////////////////
		//
		//     c0 c1 c2 c3         The order of the for loop output is as follows:  
		// r0 [ 4, 6, 5, 8 ]         start! (r0, c0), (r0, c1), (r0, c2), (r0, c3) ->
		// r1 [ 2, 7, 1, 9 ]             -> (r1, c0), (r1, c1), (r1, c2), (r1, c3) ->
		// r2 [ 4, 6, 2, 3 ]             -> (r2, c0), (r2, c1), (r2, c2), (r2, c3) end!
		//
		///////////////////////////////////////////////////////////////////////////////////
		
		
	}
}
