package com.skillstorm.courseWkThree;

public class MethodOverriding {
	
	public static void main(String[]args) {
		
	}
}

class A {
	int x;
	public A getStuff() {
		System.out.println("Stuff: A");
		return new A();
	}
}
class B extends A {
	
	public A getStuff() {
		System.out.println("Stuff: A from B");
		return new A();
	}
	
	public A getMoreStuff(){
		A a1 = super.getStuff();
		A a2 = super.getStuff();
		A a3 = getStuff();
		return new A();
	}
}