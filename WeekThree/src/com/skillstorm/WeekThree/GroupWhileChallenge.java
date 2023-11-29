package com.skillstorm.WeekThree;

import java.util.Arrays;

public class GroupWhileChallenge {
	
	public static void main(String[] args) {
		int[] newArray = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] newArray2 = {-1, 1, 2, 3, 4};

        int start = 2;
        int end = 5;
        int rotate = 4;
        String str = "Cave Bear";

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(copyRange(newArray,start,end)));
        System.out.println(Arrays.toString(append(newArray, newArray2)));
        System.out.println(containsNegatives(newArray));
        System.out.println("evens:" + allEven(newArray));
        System.out.println(rotate(str, rotate));
    }
		
	
	
	/**
	 * Copy All returns a new array with all the elements from the original array
	 * copied over. Not using the Arrays utility class's copy method!
	 * @author Erica
	 */
	public static int[] copy(int[] numbers) {
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		return copy;
	}
	
	/**
	 * Copy range from start index (inclusive) to end index (exclusive)
	 * @return A new array with all the elements between the start and end index
	 *         If end > length what should we do? returns everything up to the end of the array and nothing beyond
	 *         If start >= end what should we do? returns an empty array
	 * @author Team
	 */
	public static int[] copyRange(int[] numbers, int start, int end) {
		
		if (start < 0 || end >= numbers.length || start > end) {
			return null;
		}
		
		int newArraySize = end - start;
		
		int [] newArray = new int[newArraySize];
		
		for (int i = 0; i < newArraySize; i++) {
			newArray[i] = numbers[start + i];
		}

		return newArray;
	}
	
	/**
	 * Append returns a new array with all the elements of arr1 and all the elements of arr2
	 * @author Team
	 */
	
	/**
	 * Parameters: arraycopy(object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
	 * 
	 * source_arr: array to be copied from
	 * sourcePos: position in source array from where to copy
	 * dest_arr: array to be copied in
	 * destPos: starting position in destination array, where to copy
	 * len: total no. of components to be copied
	 * 
	 * @param arr1
	 * @param arr2
	 * @return combined arr
	 */
	public static int[] append(int[] arr1, int[] arr2) {
		
		// estimate the length of the two combined arrays
		int combinedLen = arr1.length + arr2.length;
		
		// name the new array and size it to the length of the combined arr1 and arr2
		int[] combinedArr = new int[combinedLen];
		
		// starting at the first index of, add the elements of arr1
		// then starting at and add it to combinedArr
		System.arraycopy(arr1, 0, combinedArr, 0, arr1.length);
		
		// take arr2
		System.arraycopy(arr2, 0, combinedArr, arr1.length, arr2.length);
		return combinedArr;
	}
	
	/**
	 * Write a method that takes in a number array
	 * and returns true if the array contains negative values
	 * @author Erica
	 */
	public static boolean containsNegatives(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				return true;
		}
		return false;
	}
	
	/**
	 * Write a method that returns true if all the number are even
	 * @author Team
	 */
	public static boolean allEven(int[] numsArray) {
		
		for (int i = 0; i < numsArray.length; i++) {
			if (numsArray[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Write a method that takes in a String 
	 * and encodes it by rotating all the letters by n characters.
	 * @author Team
	 */
	public static String rotate(String str, int rotation) {
		String result = "";
		
		return result;
	}
	
	// Helper method
	

}
