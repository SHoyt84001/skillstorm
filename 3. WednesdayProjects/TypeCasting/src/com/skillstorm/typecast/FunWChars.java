package com.skillstorm.typecast;

import java.util.Scanner;

public class FunWChars {
	
	public static void main (String[] args) {
		
		Scanner decScan = new Scanner(System.in); 
		
		System.out.print("Provide your encoded message: ");
		
		String encMessage = decScan.nextLine();
		
		if (encMessage.length() == 10) {
			char first   =   (char) (encMessage.charAt(0) - 1);
			char second  =   (char) (encMessage.charAt(1) - 3);
			char third   =   (char) (encMessage.charAt(2) - 5);
			char fourth  =   (char) (encMessage.charAt(3) - 7);
			char fifth   =   (char) (encMessage.charAt(4) - 9);
			char sixth   =   (char) (encMessage.charAt(5) - 11);
			char seventh =   (char) (encMessage.charAt(6) - 13);
			char eighth  =   (char) (encMessage.charAt(7) - 15);
			char ninth   =   (char) (encMessage.charAt(8) - 17);
			char tenth   =   (char) (encMessage.charAt(9) - 19);
		
		System.out.println("Here is your decoded message: " + (char)first + (char)second + (char)third + (char)fourth + (char)fifth + (char)sixth 
				+ (char)seventh + (char)eighth + (char)ninth + (char)tenth);
		}
		
		else System.out.println("That's not 10.");
		
		decScan.close();
	}
}
