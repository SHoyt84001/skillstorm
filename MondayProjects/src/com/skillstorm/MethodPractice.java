package com.skillstorm;

public class MethodPractice {

//	Method 1: invalid parameter array placement-- should be main(String[] args)

	public static void main(String[] args) {
	    System.out.println(myMethod());
	}

//	Method 2: invalid modifier-- should be "public static String"

	public static String myMethod() {
	    return "Something";
	}
}

