package com.skillstorm.WeekThree;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		// Arrays are declared with []
		
		// 2D declares with [][]

		/////////////////////////EXAMPLE 1: FOR LOOP, DIRECTLY DECLARED///////////////////////

		System.out.println("Directly-declared 2D array with specified values initialized "
				+ "\n(A small minesweeper field):");

		int[][] nums1 = {{1, 1, 1, 0},{1, 0, 0, 1},{1, 2, 0, 0}};

		for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 4; j++) {
				 System.out.print(nums1[i][j] + " ");
			 } System.out.println();
		} 

		//////////////////////////////////////////////////////////////////////////////////////

		
		
		
		//////////////////////////////EXAMPLE 2: ENHANCED FOR LOOP////////////////////////////

		// INDIRECTLY DECLARED

		int[][] nums2 = new int [4][4];

		System.out.println("\nUse Enhanced for loops to cut down on errors. It also looks much prettier in code.");
		
		for (int array[]: nums2) {
			for (int item: array) {
				System.out.print((int) (Math.random() * 10) + item + " ");
			} System.out.println(); 
		}

		//////////////////////////////////////////////////////////////////////////////////////


		
		
		
		
		
		
		
		
		
		
/**		///////////////////////EXAMPLE 1.1: FOR LOOP, INDIRECTLY DECLARED/////////////////////
		
		int[][] nums = new int[3][4];
		
		nums[0][0] = 1; nums[1][0] = 1; nums[2][0] = 1; 
		nums[0][1] = 1; nums[0][2] = 1; nums[2][1] = 2;
		nums[1][3] = 1;
		
		System.out.println("Indirectly-declared 2D Array with an initialized value:");
		
		for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 4; j++) {
				 System.out.print(nums[i][j] + " "); // instead of println, we can do print and add a space between each element
			 }
			 System.out.println(); // and after every row is output, just printl
		} 
		
*/		//////////////////////////////////////////////////////////////////////////////////////
	}
}
