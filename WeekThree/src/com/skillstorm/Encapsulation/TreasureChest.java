package com.skillstorm.Encapsulation;

import java.util.Arrays;

public class TreasureChest {
	// TODO add access modifiers
	
    public double weightInLbs;
    public double height;
    public double length;
    public double width;

    public boolean isLocked;

    public Treasure[] contents;
    
    private int MAX_CONTENTS = 9;
    
    // TODO add no-args and all-args constructors
    
    public TreasureChest() {}
    
    public TreasureChest(double weightInLbs, double height, double length, 
    		double width, boolean isLocked, Treasure... contents) {
    	this.weightInLbs = weightInLbs;
    	this.height = height; 
    	this.length = length; 
    	this.width = width; 
    	this.isLocked = isLocked; 
    	this.contents = new Treasure[MAX_CONTENTS];
    	for (int i = 0; i < contents.length; i++) {
    		this.contents[i] = contents[i];
    	}
    }
    
    
    
    
//    public TreasureChest(double weightInLbs, double height, double length, 
//    		double width, boolean isLocked, Treasure[] contents) {
//    	
//    	this.weightInLbs = weightInLbs;
//    	this.height = height; 
//    	this.length = length; 
//    	this.width = width; 
//    	this.isLocked = isLocked; 
//    	this.contents = contents;
//    }

//    public Student(String name, double gpa, int mAX_NUM_COURSES, String... courses) {
//		this.name = name;
//		this.gpa = gpa;
//		this.numCourses = courses.length;
//		this.MAX_NUM_COURSES = mAX_NUM_COURSES;
//		this.courses = new Course[mAX_NUM_COURSES];
//		for (int i = 0; i < courses.length; i++) {
//			this.courses[i] = new Course(courses[i]);
//		}
//	}
	
    // TODO add getter and setter methods for each property
	public double getWeightInLbs() {
		return weightInLbs;
	}

	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Treasure[] getContents() {
		if (isLocked == true) {
			return null;
		}
		return contents;
	}

	public void setContents(Treasure[] contents) {
		this.contents = contents;
	}

	
	
    // TODO add toString method
	
	//The 16.0" x 18.0" x 24" treasure chest weighs 25.0lbs and is locked.
	
	@Override
	public String toString() {
		if (isLocked == false) {
			return String.format("The dimensions are: %,.2f" , weightInLbs) + ", height=" + height + ", length=" + length + ", width="
					+ width + ", isLocked=" + isLocked + ", contents=" + Arrays.toString(contents) + ", MAX_CONTENTS="
					+ MAX_CONTENTS + "]";
		} return "You don't get to look inside here, but here's some useless details: " 
					+ weightInLbs + " " + height + " " + length + " " + width;
	} 

}