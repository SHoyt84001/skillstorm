package com.skillstorm.WeekThree;

import java.util.*;

public class ForLoopPractice {
	
	public static void main (String[] args) {
		
		// all components of the loop are optional
		// but the semi-colon is REQ
			
		
		// initialization 1: int i = 0
		// initialization 2: run the condition: i < 3
		// if init 2 is true, run the body: sysout
		// initialization 3: runs i++ iteration if body runs
		// tests condition again, runs i++, keeps going
		
		// Example 1: for
		System.out.println("One way to do it, initializing the integer first and iterating by 10 each loop: ");
		int i; 
		
		for (i = 0; i <= 100; i += 10) {
			System.out.println(i);
		}
		
		// Example 2: for-each		
		System.out.println("\nAnother way to do it, declaring a set series of expected integers in an array, then dump the results with for-each: ");
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		// must declare data type
		// "item" is what we're calling each item in the array
		// numbers is the array we're passing to it
		// +item moves to the next item in the array and prints, until it reaches the end of the array
		
		// if you manipulate the array, you are manipulating a copy of it, not the actual array
		for (int item: numbers) {
			System.out.println(+item);
		}
		
		int[] forLoopArray = {10,20,30,40,50,60,70,80,90,100};
	
        for(int n : forLoopArray) {
            System.out.println(+n);
        }
        
        // uppercase the list of fruits
        
        String[] fruits = {"pineapple", "strawberry", "banana"};
        
        for (String fruit : fruits) {
        	System.out.println(fruit.toUpperCase());
        	
        }
        
        
        // example: concatonating a string array into a single line
        
        String[] bigCats = {"tiger", "lion", "cheetah", "panther"};
        String bigCatOut = "";
        
        for (String cat : bigCats) {
        	bigCatOut += cat + " ";
        }
        
        System.out.println(Arrays.toString(bigCats));
        System.out.println(bigCatOut);
        
        // example: iterating each letter on a separate line
        
        String str = "Will this work";
        
        for (char c : str.toCharArray()) {
        	System.out.println(c);
        }
	
		
	/* regarding for-each statements
		pros
		
		concise
		useful when you don't need the index 

		cons
	
		cannot access multiple elements and cannot update them
	*/
	
		
	}
	}