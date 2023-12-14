package com.skillstorm.Scene;

import java.lang.reflect.Array;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.*;
import com.skillstorm.projectData.*;
import com.skillstorm.PlayerClass.*;


public class Scene {
	
	//////////////////////// LOCAL VARIABLES ////////////////////////
	private int winCount = 0;
	private int loseCount = 0;
	
	private Player player;
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
	
	public Scene(Scanner userIn, Player player) {
		this.userIn = userIn;
		this.player = player;
	}
	
	public Scene(String description, String userPrompt, String[] promptOptions, int points, Player player) {
		this.description = description;
		this.userPrompt = userPrompt;
		this.promptOptions = promptOptions;
		this.points = points; 
		this.player = player;
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
		
		
		try {
			String filePath = "testSave.dat";
	        Path path = Paths.get(filePath);

	        // Check if the file exists
	        if (Files.exists(path)) {
	        	
	            // Check if the file is readable
	            boolean isReadable = Files.isReadable(path);
	            if(isReadable == true) {
	            SaveLoad load = new SaveLoad(new Player());
	    		load.load();
	    		this.player = load.getPlayer();
	            } else this.player = new Player();
	            System.out.println(this.player);
	        } else {
	            this.player = new Player();
	            System.out.println(this.player);
	        }
	      
		} catch (Exception e) {
			this.player = new Player();
			System.out.println(this.player);
		}
		
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
		 * player.statReducer(); }
		 */
		
		String firstChoice = userIn.nextLine().toLowerCase();
		
			switch (firstChoice) {
			case "corrupt":
				handleCorruptionChoice();
				handleFitToMove();
				break;
			case "corrupted":
				handleCorruptionChoice();
			handleFitToMove();
			break;
			case "tired":
				System.out.println("\nYOU ARE TIRED.");
				handleFitToMove();
				break;
			default: 
				System.out.println("\nC O R R U P T I O N");
				handleFitToMove();
				break;
			}

			
		String secondChoice = userIn.nextLine().trim().toLowerCase();
		
		switch (secondChoice) {
		case "corrupt":
			handleCorruptionChoice();
			handleExitModule();
			break;
		case "corrupted":
			handleCorruptionChoice();
		handleExitModule();
		break;
		case "yes":
			handleExitModule();
			break;
		default:
			System.out.println("\nC O R R U P T I O N");
			handleExitModule();
			break;
		}
		
		String thirdChoice = userIn.nextLine().trim().toLowerCase();
		
		switch (thirdChoice) {
		case "corrupt":
			handleCorruptionChoice();
			break;
		case "corrupted":
			handleCorruptionChoice();
		break;
		case "yes":
			handleExitDescription();
			break;
		case "exit":
			handleExitDescription();
		break;
		default: 
			handleExitDescription();
			break;
		}
	}
	
	public void handleExitModule() {
		System.out.println("\nUSER IS FIT. EXIT LIFE SUPPORT MODULE?");
		System.out.println("***CORRUPTED***");
		System.out.println("***CORRUPT***");
		System.out.println("***EXIT***");
	}
	public void handleFitToMove() {
		System.out.println("\nARE YOU FIT TO MOVE ABOUT?");
		System.out.println("YES");
		System.out.println("***CORRUPTED***");
		System.out.println("***CORRUPT***");
	}
	public void handleCorruptionChoice() {
		player.statReducer();
		System.out.println("\nC O R R U P T I O N");
	}
	public void handleExitDescription() {
		System.out.println("\nEXITING MODULE. STANDBY.");
		System.out.println("A sudden rush of humid air fills the small space you are in.");
		System.out.println("The screen in front of you fades to black and the door of the capsule lifts.");
		System.out.println("As the door clicks into place above you, the echoes reveal a small, dark room.");
	}
	
	public void sceneRoomOne(Player player) {
		String description = "You exit the module to the dark room."
				+ "\nAt the other end of the room, you see a sparking control panel.";
		String userPrompt = "\nWhat do you do?";
		String[] promptOptions = {"1. Examine the control panel", "2. Look around", "3. Try the door"};
		int points = 10;
		
		Scene sceneOne = new Scene(description, userPrompt, promptOptions, points, this.player);
		
		System.out.println(description);
		System.out.println(userPrompt);
		System.out.println(Arrays.toString(promptOptions));
		
		String choice = sanitizeInput(userIn.nextLine());
		
		if (choice.equalsIgnoreCase("Examine") || choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("panel")) {
			examinePanel();
			
		} else if (choice.equalsIgnoreCase("Look around") || choice.equalsIgnoreCase("2")) {
			System.out.println("The room is dark, but the broken panel lights the area near it.");
			System.out.println("'\nA door is illuminated faintly next to the panel. It has no handles or obvious hold points.");
		} else if(choice.equalsIgnoreCase("touch door")) {
			loseTrigger();
			winLoseCount();
		}
	}
	
	
	
	// What I want to happen: 
	// 1. User either flips the panel or touches panel
	// 2. if user touches panel without flipping panel and activating a switch, nothing happens
	// 3. if user flips the panel, they see a switch and are asked to flip it
	// 4. 
	
	/////////////////////// EXAMINE PANEL METHOD //////////////////
	public void examinePanel() {
		// I'd like to set these strings, and once the user has flipped the red switch, for bioFixed to be 
		// placed where bioError is and get printed when i call the examinePanel method in the if statement
		
		String bioError = "\nB I O M E T R I C E R R O R";
		String bioFixed = "\nB I O M E T R I C I N P U T";
		boolean switchFlipped = false;
		
		System.out.println("The panel is hanging by a wire going into the wall.");
		System.out.println("\nIts screen flickers a message: ");		
		System.out.println("\nA U T H E N T I C A T E U S E R");
		if (switchFlipped = false) {
			System.out.println(bioError);
		} else if (switchFlipped = true)
			System.out.println(bioFixed);
		
		String[] panelOptions = {"1. Place hand on panel", "2. Flip panel over", "3. Go back"};
		
		System.out.println(Arrays.toString(panelOptions));
		String panelChoice = sanitizeInput(userIn.nextLine());
		
		
		
		if (panelChoice.equalsIgnoreCase("flip panel over") || panelChoice.equalsIgnoreCase("flip") || panelChoice.equalsIgnoreCase("2")) {
			System.out.println("\nFlipping the panel over, you see a red switch.");
			
			
//			if (switchChoice.equals("1") || switchChoice.equalsIgnoreCase("press red switch") || switchChoice.equalsIgnoreCase("press")) {
//				System.out.println("*the panel makes a chirping sound*");
//				System.out.println(Arrays.toString(switchOptions));
//				
//			}
		} else if (panelChoice.equals("1") || panelChoice.equalsIgnoreCase("place hand") || panelChoice.equalsIgnoreCase("place hand on panel")) {
			System.out.println("Nothing seems to happen.");
		} else if(panelChoice.equalsIgnoreCase("3") || panelChoice.equalsIgnoreCase("go back") || panelChoice.equalsIgnoreCase("back")) {
			examinePanel();
		}
	}
	
	public void handleRedSwitch() {
		String[] switchOptions = {"1. Press red switch", "2. Go back"};
		System.out.println(Arrays.toString(switchOptions));
		String switchChoice = sanitizeInput(userIn.nextLine());
		
		
	}
	
	//////////////////// PROMPT USER TO PLAY AGAIN ////////////
	
	/*
	 * System.out.println("Do you want to play again? yes/no: "); String playAgain =
	 * userIn.nextLine().trim().toLowerCase();
	 * 
	 * if (!playAgain.equals("yes")){ System.out.println("Thanks for playing!");
	 * break; }
	 */
	
	
	///////////////// RANDOM STAT REDUCER /////////////////
	public void statReducer() {
		// use getters to create an array of stats
		int[] stat = {player.getSTR(), player.getSTA(), player.getHP()};
		// create a new object of the random utility
		Random random = new Random();
		// select a random index in the array above between 1 and the 
		//    length of the array
		int randomStatIndex = random.nextInt(stat.length);
		// create a variable that points directly at this index
		int selectedStat = stat[randomStatIndex];
		
		int reduction = random.nextInt(10) + 1;
		
		if(selectedStat == player.getSTR()) {
			player.setStrength(player.getSTR() - reduction);
		} else if(selectedStat == player.getSTA()) {
			player.setStamina(player.getSTA() - reduction);
		} else if(selectedStat == player.getHP()) {
			player.setHitPoints(player.getHP() - reduction);
		}
	}
	
	///////////////// CHECKING FOR WIN/LOSE and KEEP TRACK /////////////
	
	
	public void loseTrigger() {
		loseCount++;
		
		System.out.println("T H E C O R R U P T I O N T A K E S Y O U");
		System.out.println("\nDo you want to play again? yes/no: "); 
		
		String playAgain = userIn.nextLine().trim().toLowerCase();
				  
		if (!playAgain.equals("yes")){ 
			System.out.println("Thanks for playing!");
			SaveLoad save = new SaveLoad(this.player);
			save.save();
		} else {
			SaveLoad save = new SaveLoad(this.player);
			save.save();
			gameStart();
		}
	}
	
	public void winTrigger() {
		winCount++;
		System.out.println("C O R R U P T I O N C L E A N S E D");
		System.out.println("\nDo you want to play again? yes/no: "); 
		
		String playAgain = userIn.nextLine().trim().toLowerCase();
		  
		if (!playAgain.equals("yes")){ 
			System.out.println("Thanks for playing!");
			SaveLoad save = new SaveLoad(this.player);
			save.save();
		} else {
			SaveLoad save = new SaveLoad(this.player);
			save.save();
			gameStart();
		}
	}
	
	public void winLoseCount() {
		System.out.printf("You have played %s games", (loseCount + winCount));
		
	}
	
	
	
	///////////////// SWITCH CASE FOR CORRUPT ///////////////
	
	public String handleChoice(String choice) {
		switch(choice.toLowerCase().trim()) {
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
		return input.trim().toLowerCase();
	}
}
