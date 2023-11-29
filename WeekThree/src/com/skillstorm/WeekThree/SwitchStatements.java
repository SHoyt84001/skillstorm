package com.skillstorm.WeekThree;

public class SwitchStatements {

		public static void main (String[] args) {
			
			
			// without a break;, it will fall through to the rest of the statements
			switch ('b') {
			case 'a' : System.out.println("hi");
			case 'b' : System.out.println("bye");
			
			default : System.out.println("oops");
			}
			

			// as soon as java finds a match, it will run the cases until it hits a break or a return statement
			
			String gradeStr = "A, B, C, D, F"; 
			
			char[] gradeArr = gradeStr.replace(", ", "").toCharArray();
			
			char memberGrade = 'F';
			
			for (char grade : gradeArr) {
				switch (grade) {
				case 'A' :
				case 'B' :
				case 'C' :
					System.out.println("pass");
					break;
				case 'D' :
				case 'F' :
					System.out.println("fail");
					System.out.println("Repeat the course due to the grade of " + grade);
					break;
				default: 
					System.out.println("Incomplete grade");
				}
				
			System.out.println("result of member grade: " + memberGrade);
			}
		
	}
}

