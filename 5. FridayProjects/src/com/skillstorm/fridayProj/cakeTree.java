package com.skillstorm.fridayProj; 

public class cakeTree {

	public static void main (String[] args) {
		
		boolean isSpoiled = true; 
		
		boolean hasUsedByDatePassed = true;
		
		boolean useByDateMoreThan3Days = true;
		
		boolean funnySmell = true;
		
		if (!hasUsedByDatePassed) {
			// Not spoiled?
			isSpoiled = false;
			
		} else if (!useByDateMoreThan3Days) {
			isSpoiled = true;
			
		} else if (!funnySmell) {
			isSpoiled = true;
		} else {
			isSpoiled = true;
		}
		
		System.out.println("Is the milk spoiled? " + isSpoiled);
			
		
	}
}
