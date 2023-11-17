package com.skillstorm.mathFunctions;

public class MathFunctions {

		public static void main (String[] args) {
			
			// noteable math functions:
			//  pow
			//  sqrt
			//  random
			//  abs
			//  ceil
			//  floor
			
			// noteable string methods
			// 	length()
			// 	concat(String)
			//	charAt(int)
			// 	.indexOf(string or char)
			// 	.substring(start, end)
			// 	.toUpperCase() and .toLowerCase()
			// 	.replace (String, String) and .trim()
			
			// exclusive and inclusive numbers
			//  (1,5) - 1 to 5 EXCLUSIVE - only shows 2, 3, 4
			//  [3,6] - 3 to 6 INCLUSIVE - 3, 4, 5, 6
			//  [5,10) - 5 inclusive to 10 exclusive - 5, 6, 7, 8, 9
			//  [0,4) - 0, 1, 2, 3
			//  str.substring(7,9) would return the 7th and 8th slot
			
			
			// indexOf example 1:
//			String students = "Matt, Steve, Parker, Hunter";
//			
//			int indexOfComma = students .indexOf(",");
//			String firstStudent = students.substring(0, indexOfComma);
//			System.out.println("The first student is " + firstStudent);
			
			// indexOf example 2: using indexOf(char, startlocation)
			String students = "Matt, Steve, Parker, Hunter";
			System.out.println("These are the existing students: " + students);
			
			// first set the value of the place of that comma
			int indexOfComma = students.indexOf(",");
			// then use the reference of that comma as a limiter to know when the first name ends
			// and finally, using substring, start from 0 and end at the first comma to show the first name
			String firstStudent = students.substring(0, indexOfComma);
			System.out.println("This is the first student: " + firstStudent);
			
			int indexOfSecondComma = students.indexOf(",", indexOfComma + 1);
			String secondStudent = students.substring(indexOfComma + 1, indexOfSecondComma).trim();
			System.out.println("This is the second student: " + secondStudent);
			
			
			
			
		}
		
}
