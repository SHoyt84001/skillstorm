package com.skillstorm.assignmentMonday;

import java.util.Scanner;

public class MainProgrammer extends Programmer {
	
	public static void main(String[] args) {
		
		String userName; 
		
		Scanner userQ = new Scanner(System.in);
		
        System.out.print("  ________      ___    ___ ________  _______   ________  ___       __   ________  ___      ___ _______                                                                 \r\n");
        System.out.print(" | \\   ____\\    |\\  \\  /  /|\\   __  \\|\\  ___ \\ |\\   __  \\|\\  \\     |\\  \\|\\   __  \\|\\  \\    /  /|\\  ___ \\                                           \r\n");
        System.out.print("  \\ \\  \\___|    \\ \\  \\/  / | \\  \\|\\ /\\ \\   __/|\\ \\  \\|\\  \\ \\  \\    \\ \\  \\ \\  \\|\\  \\ \\  \\  /  / | \\   __/|                                  \r\n");
        System.out.print("   \\ \\  \\        \\ \\    / / \\ \\   __  \\ \\  \\_|/_\\ \\   _  _\\ \\  \\  __\\ \\  \\ \\   __  \\ \\  \\/  / / \\ \\  \\_|/__                                   \r\n");
        System.out.print("    \\ \\  \\____    \\/  /  /   \\ \\  \\|\\  \\ \\  \\_|\\ \\ \\  \\\\  \\\\ \\  \\|\\__\\_\\  \\ \\  \\ \\  \\ \\    / /   \\ \\  \\_|\\ \\                         \r\n");
        System.out.print("     \\ \\_______\\__/  / /       \\ \\_______\\ \\_______\\ \\__\\\\ _\\\\ \\____________\\ \\__\\ \\__\\ \\__/ /     \\ \\_______\\                                   \r\n");
        System.out.print("      \\|_______|\\___/ /        \\|_______|\\|_______|\\|__|\\|__|\\|____________|\\|__|\\|__|\\|__|/       \\|_______|                                               \r\n");
        System.out.print("               \\|___|/                                                                                                                                                \r\n");
        System.out.print(" _________  _______   ________  ___  ___  ________   ________  ___       ________  ________  ___  _______   ________                                                   \r\n");
        System.out.print("|\\___   ___\\\\  ___ \\ |\\   ____\\|\\  \\|\\  \\|\\   ___  \\|\\   __  \\|\\  \\     |\\   __  \\|\\   ____\\|\\  \\|\\  ___ \\ |\\   ____\\                        \r\n");
        System.out.print("\\|___ \\  \\_\\ \\   __/|\\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\|\\  \\ \\  \\    \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\ \\   __/|\\ \\  \\___|_          \r\n");
        System.out.print("     \\ \\  \\ \\ \\  \\_|/_\\ \\  \\    \\ \\   __  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\  __\\ \\  \\ \\  \\_|/_\\ \\_____  \\        \r\n");
        System.out.print("      \\ \\  \\ \\ \\  \\_|\\ \\ \\  \\____\\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\ \\  \\____\\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\ \\  \\_|\\ \\|____|\\  \\  \r\n");
        System.out.print("       \\ \\__\\ \\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\ \\_______\\ \\_______\\ \\_______\\ \\__\\ \\_______\\____\\_\\  \\              \r\n");
        System.out.print("        \\|__|  \\|_______|\\|_______|\\|__|\\|__|\\|__| \\|__|\\|_______|\\|_______|\\|_______|\\|_______|\\|__|\\|_______|\\_________\\                              \r\n");
        System.out.print("                                                                                                              \\|_________|                                            \r\n");
		System.out.println("\n\n\nWelcome, Valued Employee!");
		
		Programmer user1 = new Programmer("Kevin", "Xerox", 5);
		Programmer user2 = new Programmer("Charles", "Xerox", 3);
		
		System.out.println(user1);
		System.out.println(user2);
		
		user1.setName("William");
		System.out.println(user1);
		
		String[] setLearnedLangs = {"java", "c"};
		
		String langToForget = "java";

		
//		do {
//			System.out.print("\nPlease input your name: ");
//			userName = userQ.nextLine(); System.out.println();
//			
//			if (userName.matches(".*\\d.*") || userName.isBlank()) {
//				System.out.print("\nPlease input a valid name: ");
//				
//			} else {
//			System.out.printf("\nWelcome, %s" , userName + "!");
//			}
//			
//		} while (userName.matches(".*\\d.*") || userName.isBlank());
//		
//		
//		System.out.print(" We'd like to get to know you a bit more. "
//				+ "\n\nHow many programming languages do you know?");
//		

		int numOfLearned = userQ.nextInt();
		
		String[] langsLearned = new String[numOfLearned];
		
		learnLanguage(langsLearned);
		
		System.out.println("\nEnter a language you forgot: ");
		
		System.out.println();
		
		userQ.close();
	}
}
