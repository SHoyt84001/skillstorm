package com.skillstorm.GroupWorkStudent;

import java.util.ArrayList;

public class Student {
	
	///////////////////////////////////////////////
	// Static properties
	private static long numberStudents = 0;
	
	///////////////////////////////////////////////
	// Instance properties
	private final long studentId;
	
	private String name;
	
	private final ArrayList<String> grades;
	
	///////////////////////////////////////////////
	// Constructors
	public Student() {
		this("unknown");
	}
	
	public Student(String name) {
		this.name = name;
		this.studentId = numberStudents++;
		this.grades = new ArrayList<>();
	}
	
	///////////////////////////////////////////////
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStudentId() {
		return studentId;
	}
	
	public ArrayList<String> getGrades() {
		return new ArrayList<>(grades); // return a copy
	}
	
	///////////////////////////////////////////////
	// Methods
	public void addGrade(String grade) {
		if (!validGrade(grade))
			return;
		this.grades.add(grade);
	}
	

	public void updateGrade(int index, String newGrade) {
		if (!validGrade(newGrade))
			return;
		this.grades.set(index, newGrade);
	}
	
	static boolean validGrade(String grade) {
		// validates letter grades
		
		if (grade == null || grade.trim().isEmpty()) {
			return false;
		}
		
	    switch (grade.toUpperCase()) {
		case "A":
		      return true;
		case "B": 
		      return true;
		case "C":
		      return true; 
		case "D": 
		      return true;
		case "F": 
		      return true;
		default:	 
		      return false;
		}
	} 

	// Hoyt: alternative to the above switch statement: 
	//    an array that holds valid char grade values
	//    and only returns true if the char grade passed
	//    to the method matches one of the index values in validGrades
	
//	public boolean validGrade(char grade) {
//		char[] validGrades = {'A', 'B', 'C', 'D', 'F'};
//		
//		for (char validGrade : validGrades) {
//			if (grade == validGrade) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	 
	
	public double calculateGPA() {
		// TODO 03 Calculate GPA
		if (grades.isEmpty()){
			return 0.0;
		}
		
		double sum = 0.0; 
		
		for (String grade: grades) {
			sum += convert(grade);
		}
		
		return sum / grades.size();
	}
	
	
	// Hoyt: nested ifs to check whether the given gpa
	//   passes the expressions. else return F.
	
//	public char calculateGPA(double gpa) {
//        // TODO 03 Calculate GPA
//        if (gpa >= 90.0) {
//            return 'A';
//        } else if (gpa >= 80.0) {
//            return 'B';
//        } else if (gpa >= 70.0) {
//            return 'C';
//        } else if (gpa >= 60.0) {
//            return 'D';
//        } else {
//            return 'F';
//        }
//    }
//    
	
	/**
	 * Converts the String "A" to a number 4.0
	 * Converts the String "B" to a number 3.0
	 * Converts the String "C" to a number 2.0
	 * Converts the String "D" to a number 1.0
	 * Converts the String "F" to a number 0.0
	 * @param grade
	 * @return
	 * @throws IllegalArgumentException if grade is not A, B, C, D, or F
	 */
	 
	public double convert(String grade) {
		// TODO 02 convert string to double
		switch(grade) {
			case "A":
			   return 4.0;
			case "B":
			   return 3.0;
			case "C":
			   return 2.0;
			case "D":
			   return 1.0;
			case "F":
			   return 0.0;
			default: 
			   return 0.0;
		}
	}
	
	public String toString() {
		return String.format("Student %s has a gpa of %.2f", name, calculateGPA());
	}

}