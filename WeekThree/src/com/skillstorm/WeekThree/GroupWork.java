package com.skillstorm.WeekThree;

public class GroupWork {
	
	public static void main(String[] args) {
		// Warm-up 1.1: Count to 100 by 2's
		 
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
			
		}
		
		
		// Warm-up 1.2
		
		for (int i = 1; i < 51; i++) {
            System.out.println(i * 2);
        }
		
		
		// Warm-up 2: Add up the numbers 1 to 10
		int result = 0;
		// YOUR CODE HERE
		for (int i = 1; i < 11; i ++) {
			result = result + i;
		}
		
		System.out.println(result);
	}
	

	
	/**
	 * Reverse a String. 
	 * 
	 * For example, given "Hello" it will return "olleH" 
	 * 
	 * @param s The String to reverse
	 * @return A new String containing the characters in reverse order
	 * 
	 */
	
	public static String challenge1(String[] str) {
		// YOUR CODE HERE 
		String helloString = "hello";
		helloString.valueOf(0);
		helloString.valueOf('e');
		
		String newString = ""; 
		
		char ch; 
		
		for (int i = 0; i < helloString.length(); i++) {
			
			// if i is less than the length of "hello", then go to the body here
			// ch is equal to the charAt of 0
			// we concatonate ch to a new string
			
			ch = helloString.charAt(i);
			newString = ch + newString;
		}
		
		System.out.println(newString);
		
		
		return null;
	}
	
	
	public static String challenge1v2(String s) {
		
		String newString = "";
		
		for (int i = s.length() - 1; i >= 0 ; i--) {
			newString += s.charAt(i);
		}
		return newString.trim();
		
	}
	
	
	/**
	 * Capitalizes every other letter in a String. 
	 * 
	 * For example, given "hello" it will return "HeLlO" 
	 * 
	 * @param s The String to capitalize
	 * @return A new String with every other letter capitalized
	 * 
	 */
	
}
