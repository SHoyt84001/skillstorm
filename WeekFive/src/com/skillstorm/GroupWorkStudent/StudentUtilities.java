package com.skillstorm.GroupWorkStudent;

import java.util.ArrayList;

public class StudentUtilities {
	
	/**
	 * For each student in the array, return the student with a 4.0 GPA
	 * 
	 * @param students A list of students
	 * @return A list of students with all A's
	 */
	public static ArrayList<Student> getStraightAStudents(ArrayList<Student> students) {
		// TODO 04 return all students with a GPA of 4.0
		ArrayList<Student> straightAStudents = new ArrayList<>();
		for (Student student: students) {
			if (student.calculateGPA() == 4.0) {
				straightAStudents.add(student);
			}
		}
		return straightAStudents;
	}
	
	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students) {
		// TODO 05 return all students with a GPA of 2.5 or higher
		return null;
	}

}