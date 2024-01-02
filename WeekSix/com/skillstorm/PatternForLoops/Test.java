package com.skillstorm.PatternForLoops;

public class Test {
	static int var2 = 200;
	String string = "";
	String String = "";
	
	public static void print() {
		System.out.println(var2);
	}
	
	public void print (int var1) {
		System.out.println(var1);
		var2 = var2 + var1;
		print();
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.print(100);
	}
}
