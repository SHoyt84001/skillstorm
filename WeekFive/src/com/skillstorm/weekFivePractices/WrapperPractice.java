package com.skillstorm.weekFivePractices;

public class WrapperPractice {
	public static void main(String[] args) {
	
		int x = 0;
		
		switch(x) {
		case 0: 
			System.out.println(0);
			break;
		default: 
			System.out.println("default");
			break;
		case -1: System.out.println(-1);
		case 1: System.out.println(1);
		}
	}
}