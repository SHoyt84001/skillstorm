package com.skillstorm.WeekThree;

public class SwitchPrac {
	
	public static void main (String[] args) {
		
		int n = 4; 
		
		switch (n) {
			case 10:
				System.out.println(" = 10");
				break;
			case 2*2:
				System.out.println(n + " is equivalent to 2*2");
				break;
			default: 
				System.out.println("not equivalent to the above");
		}
	}
}
