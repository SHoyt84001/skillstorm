package com.skillstorm.PatternForLoops;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter a grade: ");
		
		int inputGrade = userIn.nextInt();
		
		if (inputGrade >= 90 && inputGrade <= 100) {
			System.out.println('A');
		} else if(inputGrade >= 80 && inputGrade <= 90) {
			System.out.println('B');
		} else if(inputGrade >= 70 && inputGrade <= 80) {
			System.out.println('C');
		} else if(inputGrade >= 65 && inputGrade <= 70) {
			System.out.println('D');
		} else if(inputGrade <= 65 && inputGrade >= 0) {
			System.out.println('F');
		} else System.out.println("invalid inpuyt");

	}

}
