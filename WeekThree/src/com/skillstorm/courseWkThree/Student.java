package com.skillstorm.courseWkThree;

import java.util.Arrays;

public class Student {

	// Local variables
	String name;
	double gpa;
	Course[] courses;
	int numCourses = 0;
	int MAX_NUM_COURSES = 5;
	
	public Student() { } 
	
	public Student(String name, double gpa,  int numCourses, int mAX_NUM_COURSES, Course[] courses) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.courses = courses;
		this.numCourses = numCourses;
		MAX_NUM_COURSES = mAX_NUM_COURSES;
	}
	
	public Student(String name, double gpa,  int numCourses, int mAX_NUM_COURSES, String course1) {
		this.name = name;
		this.gpa = gpa;
		this.numCourses = 1;
		this.MAX_NUM_COURSES = mAX_NUM_COURSES;
		this.courses = new Course[mAX_NUM_COURSES];
		this.courses[0] = new Course(course1);
	}
	
	public Student(String name, double gpa, int mAX_NUM_COURSES, String... courses) {
		this.name = name;
		this.gpa = gpa;
		this.numCourses = courses.length;
		this.MAX_NUM_COURSES = mAX_NUM_COURSES;
		this.courses = new Course[mAX_NUM_COURSES];
		for (int i = 0; i < courses.length; i++) {
			this.courses[i] = new Course(courses[i]);
		}
	}

	/*package private */ void add(Course course) {
		this.courses[numCourses] = course;
	}

	@Override
	public String toString() {
		String str = "Student [name=" + name + ", gpa=" + gpa + ", courses= ";
		for (int i = 0; i < numCourses; i++) {
			str += courses[i].getName() + ", ";
		}
		str += " numCourses="
				+ numCourses + ", MAX_NUM_COURSES=" + MAX_NUM_COURSES + "]";
		return str;
	}
	
	
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s == s); // compares memory addresses
		Student s2 = new Student();
		System.out.println(s == s2);
		
//		Course[] courses = new Course[3];
//		courses[0] = new Course("Math");
//		courses[1] = new Course("Englisgh");
//		courses[2] = new Course("Spanish");
//		Student s3 = new Student("Jo", 1.0, 0, courses.length, courses);
		Student s4 = new Student("Jo", 1.5, 6, "Math", "English", "Spanish");
	}
}