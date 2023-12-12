package com.skillstorm.Scene;

import java.lang.reflect.Array;
import java.util.*;

import com.skillstorm.PlayerClass.*;


public class Scene {
	
	//////////////////////// LOCAL VARIABLES ////////////////////////
	private Scanner userIn;
	private String description; 
	private String userPrompt;
	private String[] promptOptions;
	
	private String secretEnding; 
	private String ending1; 
	private String ending2; 
	private int points;
	
	//////////////////////// CONSTRUCTOR(S) ////////////////////////
	
	public Scene() {}
	
	public Scene(Scanner userIn) {
		this.userIn = userIn;
	}
	
	public Scene(String description, String userPrompt, String[] promptOptions, int points) {
		this.description = description;
		this.userPrompt = userPrompt;
		this.promptOptions = promptOptions;
		this.points = points; 
	}

	//////////////////////// GETTERS AND SETTERS ////////////////////////
	
	public String getDescription() {
		return description;
	}

	public int getPoints() {
		return points;
	}
	
	//////////////////////// SCENE STARTER ////////////////////////
	
	public void gameStart() {
		do {
			Player player1 = new Player();
			System.out.println("You wake to see a screen in front of you displaying a question.");
			System.out.println("\nPLEASE SELECT FROM THE FOLLOWING OPTIONS");
			System.out.println("\nHOW DO YOU FEEL");
			System.out.println("***CORRUPT***");
			System.out.println("***TIRED***");
			System.out.println("***CORRUPTED***");
			
			
			/*
			 * The reason why I'm not going for this simpler if statement is that I
			 * specifically target "corrupt" and "corrupted" as a part of the game vision.
			 * If I had just passed stat reducer on any other answer than "tired", then
			 * non-corrupt-related game-endings would require different logic anyways
			 * 
			 * if (!firstChoice.toLowerCase().trim().equals("tired")) {
			 * player1.statReducer(); }
			 */
			String firstChoice = userIn.nextLine().toLowerCase();
			do {
				
				switch (firstChoice) {
				case "corrupt":
					player1.statReducer();
					break;
				case "corrupted":
					player1.statReducer();
					break;
				case "tired":
					System.out.println("\nYOU ARE TIRED. ARE YOU FIT TO MOVE ABOUT?");
					System.out.println("YES");
					System.out.println("***CORRUPTED***");
					System.out.println("***CORRUPT***");
					break;
				default: 
					System.out.println("C O R R U P T I O N.");
					break;
				}
			} while (!firstChoice.equalsIgnoreCase("corrupt") && !firstChoice.equalsIgnoreCase("corrupted") && !firstChoice.equalsIgnoreCase("tired"));
				
			String secondChoice = userIn.nextLine().trim().toLowerCase();
			
			switch (secondChoice) {
			case "corrupt":
				player1.statReducer();
				break;
			case "corrupted":
				player1.statReducer();
				break;
			case "yes":
				System.out.println("\nUSER IS FIT. EXIT LIFE SUPPORT MODULE?");
				System.out.println("***CORRUPTED***");
				System.out.println("***CORRUPT***");
				System.out.println("***EXIT***");
				break;
			default:
				System.out.println("C O R R U P T I O N.");
				break;
			}
			
			String thirdChoice = userIn.nextLine().trim().toLowerCase();
			
			switch (thirdChoice) {
			case "corrupt":
				player1.statReducer();
				break;
			case "corrupted":
				player1.statReducer();
				break;
			case "exit":
				System.out.println("\nEXITING MODULE. STANDBY.");
				System.out.println("A sudden rush of humid air fills the small space you are in.");
				System.out.println("The screen in front of you fades to black and the door of the capsule lifts.");
				System.out.println("As the door clicks into place above you, the echoes reveal a small, dark room.");
				break;
			default: 
				System.out.println("C O R R U P T I O N.");
				break;
			} 
			
			System.out.println("Do you want to play again? yes/no: ");
			String playAgain = userIn.nextLine().trim().toLowerCase();
			
			if (!playAgain.equals("yes")){
				System.out.println("Thanks for playing!");
				break;
			}
		} while(true);
		
}
	
	public void sceneOne(Player player) {
		String description = "You exit the module to the dark room. "
				+ "\nAt the other end of the room, you see a sparking control panel.";
		String userPrompt = "\nWhat do you do?";
		String[] promptOptions = {"Examine the control panel", "Look around", "Try the door"};
		int points = 10;
		
		Scene sceneOne = new Scene(description, userPrompt, promptOptions, points);
		
		Scanner playerIn = new Scanner(System.in);
		System.out.println(description);
		
		String choice = sanitizeInput(playerIn.nextLine());
		
		
		// i want to make a switch case that looks for player input and gives the result
		// ideally i want all cases to include all possible scenes and results
		
		
		// checking player input for wincondition
		if (choice.equalsIgnoreCase("win") || choice.equalsIgnoreCase("press the button") || choice.equalsIgnoreCase("button")) {
			System.out.println("Congratulations! Here's 10 points.");
			player.increaseScore(points);
		} else {
			System.out.println("You lose.");
		}
	}
	
	///////////////// RANDOM STAT REDUCER /////////////////
	public void statReducer() {
		// use getters to create an array of stats
		int[] stat = {Player.getSTR(), Player.getSTA(), Player.getHP()};
		// create a new object of the random utility
		Random random = new Random();
		// select a random index in the array above between 1 and the 
		//    length of the array
		int randomStatIndex = random.nextInt(stat.length);
		// create a variable that points directly at this index
		int selectedStat = stat[randomStatIndex];
		
		int reduction = random.nextInt(10) + 1;
		
		if(selectedStat == Player.getSTR()) {
			Player.setStrength(Player.getSTR() - reduction);
		} else if(selectedStat == Player.getSTA()) {
			Player.setStamina(Player.getSTA() - reduction);
		} else if(selectedStat == Player.getHP()) {
			Player.setHitPoints(Player.getHP() - reduction);
		}
	}
	
	
	///////////////// SWITCH CASE FOR CORRUPT ///////////////
	
	public String handleChoice(String choice) {
		switch(choice.toLowerCase()) {
			case "corrupt":
				System.out.println("\"You suddenly feel nauseated\"");
				statReducer();
				System.out.println();
				break;
		}
		
		return choice;
	}
	
	/////////////// SANITIZE INPUT ////////////////////
	public String sanitizeInput(String input) {
		return input.trim();
	}
}
