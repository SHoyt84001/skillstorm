package com.skillstorm.typecast;

public class arithmeticPractice {

		public static void main (String[] args) {

			
			// There are several equations that result in fractions or decimals,
			//    so I decided to set the data type to double for all of these remainder questions
			

			// The only way I could keep the float value of certain problems
			//    was to manually assign at least one integer value to float 
			//    at either the multiplication or division step of equations
			
			double remainder1 = (5 + 7 % 6);
			double remainder2 = (12 % 6);
			double remainder3 = (6 % 12);
			double remainder4 = (3 % 5);
			double remainder5 = (5 % 3);
			double remainder6 = (5 % 5);
			double remainder7 = (1 % -2);
			double remainder8 = (-1 % 2);
			double remainder9 = (-1 % -2);
			double remainder10 = (0 % 2);

			// cannot modulus 0 in java, so 11 is omitted
			// double remainder11 = (2 % 0); 
			
			double remainder12 = (6 * 2 % 6); 
			double remainder13 = (12 % 4); 
			
			// double modulus is really complex to me,
			//    but as I understand it now, 7 % 3 does happen first, then
			//    the remainder of the actual equation is left over as 1
			double remainder14 = (7 % 3 % 2);
			

			
			System.out.print(
					"Solution to remainder problem 1 is " + remainder1 + ", while my answer was 6."
					+ "\nSolution to remainder problem 2 is " + remainder2 + ", while my answer was 0."
					+ "\nSolution to remainder problem 3 is " + remainder3 + ", while my answer was 6."
					+ "\nSolution to remainder problem 4 is " + remainder4 + ", while my answer was 3."
					+ "\nSolution to remainder problem 5 is " + remainder5 + ", while my answer was 2."
					+ "\nSolution to remainder problem 6 is " + remainder6 + ", while my answer was 0."
					+ "\nSolution to remainder problem 7 is " + remainder7 + ", while my answer was 1."
					+ "\nSolution to remainder problem 8 is " + remainder8 + ", while my answer was -1."
					+ "\nSolution to remainder problem 9 is " + remainder9 + ", while my answer was -1."
					+ "\nSolution to remainder problem 10 is " + remainder10 + ", while my answer was 0."
					+ "\nSolution to remainder problem 11 is null, as you cannot modulus zero." + " This was not my answer." 
					+ "\nSolution to remainder problem 12 is " + remainder12 + ", while my answer was 0."
					+ "\nSolution to remainder problem 13 is " + remainder13 + ", while my answer was 0."
					+ "\nSolution to remainder problem 14 is " + remainder14 + ", This was not my answer."
					);
			
			
			
			int order1 = (10 - 12 * 2);
			int order2 = (5 * (3 - 2)); 
			int order3 = (5 + 2 * 3);
			
			// Originally I thought that order4 could be int datatype,
			//    but they were not being treated as doubles during the computation
			//    so I changed the datatype and manually added floats to numbers
			
			double order4 = (7.0 + 2.0 * 3.0 / 5.0 - 1.0);
			
			// Originally I thought that the order of precedence was (), then *, then /, then %
			//    but the precedence is equal between *, / and %, so it just goes left-right
			
			double order5 = (18.0 / 3.0 % 7.0 * (4.0 + 1.0));
			
			System.out.println(
					"\n\nThe solution to order problem 1 is " + order1 + ", while my answer was -14."
					+ "\nThe solution to order problem 2 is " + order2 + ", while my answer was 5."
					+ "\nThe solution to order problem 3 is " + order3 + ", while my answer was 11."
					+ "\nThe solution to order problem 4 is " + order4 + ", while my answer was 7.2."
					+ "\nThe solution to order problem 5 is " + order5 + ", while my answer was 6."
					);
			
			int intArith1 = (15 / 3 / 5); 
			double intArith2 = (1.0 / 2.0); 
			double intArith3 = (3.0 / 4.0);
			int intArith4 = (4 / 3);
			int intArith5 = (Integer.MAX_VALUE + 1);
			int intArith6 = (Integer.MIN_VALUE - 1);
			int intArith7 = (Integer.MAX_VALUE + Integer.MIN_VALUE);
			int intArith8 = (Short.MAX_VALUE + 1);
			int intArith9 = (Short.MIN_VALUE - 1); 
			int intArith10 = (Short.MAX_VALUE + Short.MIN_VALUE); 
			
			System.out.println(
					"\n\nThe solution to integer arithmetic problem 1 is " + intArith1  + ", while my answer was 1."
					+ "\nThe solution to integer arithmetic problem 2 is " + intArith2 + ", while I thought this would fail."
					+ "\nThe solution to integer arithmetic problem 3 is " + intArith3 + ", while I thought this would fail."
					+ "\nThe solution to integer arithmetic problem 4 is " + intArith4 + ", while my answer was 1."
					+ "\nThe solution to integer arithmetic problem 5 is " + intArith5 + ", while my answer was -2,147,483,647."
					+ "\nThe solution to integer arithmetic problem 6 is " + intArith6 + ", while my answer was 2,147,483,648."
					+ "\nThe solution to integer arithmetic problem 7 is " + intArith7 + ", while my answer was 1."
					+ "\nThe solution to integer arithmetic problem 8 is " + intArith8 + ", while my answer was -32,768."
					+ "\nThe solution to integer arithmetic problem 9 is " + intArith9 + ", while my answer was -32,768."
					+ "\nThe solution to integer arithmetic problem 10 is " + intArith10 + ", while my answer was 1."
					);
			
			// Originally, I misunderstood the meaning of narrow and wide casting, but Erica explained it and I revised
			//    my previous answers from implicit casting to explicit casting
			int typeCasting11 = ((int) 7.9 - 3); 
			double typeCasting12 = typeCasting11;
			
			int typeCasting21 = ((int) 84.3 / (int) 2.8); 
			double typeCasting22 = typeCasting21;
			
			byte typeCasting31 = ((byte) 1000 - 10 ); 
			int typeCasting32 = typeCasting31;
			
			short typeCasting41 = ((short) 100000); 
			int typeCasting42 = typeCasting41;
			
			long typeCasting51 = (10 + -10);
			int typeCasting52 = (int) typeCasting51;

			System.out.println(
					"\n\nThe solution to type casting problem 1 is " + typeCasting12 + ", and my solution was to widecast from int to double."
					+ "\nThe solution to type casting problem 2 is " + typeCasting22 + ", and my solution was to widecast from int to double."
					+ "\nThe solution to type casting problem 3 is " + typeCasting32 + ", and my solution was to widecast from byte to int."
					+ "\nThe solution to type casting problem 4 is " + typeCasting42 + ", and my solution was to widecast to int."
					+ "\nThe solution to type casting problem 5 is " + typeCasting52 + ", and my solution was to narrowcast from long to int."
					);
		}
}
