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
	private int EXP;
	private int points;
	
	private boolean switchFlipped = false;
	private boolean panelTwoActive = false;
	private boolean panelThreeActive = false;
	private boolean doorOneOpened = false;
	private boolean doorTwoOpened = false;
	private boolean doorThreeOpened = false;
	
	private int corruptionCount;
	private boolean completeCorruption = false;
	
	private int randomRoom;
	
	private List<String> visitedRooms = new ArrayList<>();
	
	//////////////////////// CONSTRUCTOR(S) ////////////////////////
	
	public Scene() {}
	
	public Scene(Scanner userIn, Player player) {
		this.userIn = userIn;
		this.player = player;
	}
	
	public Scene(String description, String userPrompt, String[] promptOptions, int points, Player player) {
		this.description = description;
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
	
	public int getEXP() {
		return EXP;
	}
	
	public int getCorruptionCount() {
		return corruptionCount;
	}

	//////////////////////// SCENE STARTER ////////////////////////

	public void gameStart() {
		
		// Had a lot of issues with reading and writing to the save file
		// so i found someone's method of checking files for 
		// .get, .exists, and .isReadable
		try {
			String filePath = "testSave.dat";
	        Path path = Paths.get(filePath);

	        // Check if the file exists
	        if (Files.exists(path)) {
	        	
	            // Check if the file is readable
	            boolean isReadable = Files.isReadable(path);
	            // if it's readable, load the player that's been saved
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
		
		
		// instead of putting all of the switch cases and printlines inside the gameStart method
		// i chose to call methods that do all of that
		handleIntroduction();
		handleFirstChoice();
		handleSecondChoice();
		handleThirdChoice();
		
		if (corruptionCount == 3) {
			System.out.println("FULL CORRUPTION");
			this.completeCorruption = true;
		}
		
		ArrayList<String> roomList = new ArrayList<String>();
		roomList.add("sceneRoomOne");
		roomList.add("sceneRoomTwo");
		roomList.add("sceneRoomThree");
		
		sceneRoomOne();
	}
	

	public String handleNextRoom(List<String> roomList, List<String> visitedRooms) {
		// run the shuffle method using the provided roomList as input
		roomShuffle(roomList);
		
		// for-each loop to check that the room given by 
		// roomShuffle is not in visitedRooms, then returns if not
		for (String room : roomList) {
			if (!visitedRooms.contains(room))
			return room;
		}
		return null;
	}
	
	//////////////////// ROOM SHUFFLER (HATED THIS) //////////////////
	public void roomShuffle(List<String> list) {
		// make new random number obj
		Random random = new Random();
		// starting at last element of list, iterates down to the first
		for (int i = list.size() - 1; i > 0; i--) {
			// get random number 1 to 3 exclusive, so add one
			int index = random.nextInt(i + 1);
			// get the third element
			String room = list.get(i);
			// replace value at position i with random number
			list.set(i, list.get(index));
			// temporarily store max size of the list to the third element
			// otherwise every time this is run, an index will be lost
			list.set(index, room);
		}
	}
	
	////////////// GAMESTART handlers ////////////////
	public void handleIntroduction() {
		System.out.println("\nYou wake to see a screen in front of you displaying a question.");
		System.out.println("\nPLEASE SELECT FROM THE FOLLOWING OPTIONS");
		System.out.println("\nHOW DO YOU FEEL");
		System.out.println("***CORRUPT***");
		System.out.println("***TIRED***");
		System.out.println("***CORRUPTED***");
	}		
	// forgot about the random thing
	// 1. The corruption choices remain at the start. 
	// 2. When the player finishes a room and exits to the next,
	//    they get put into a random scene


	/////////////////// CHOICE handlers ///////////////////
	public void handleFirstChoice() {
		String firstChoice = userIn.nextLine().toLowerCase();
		
		switch (firstChoice) {
		case "corrupt":
			handleCorruptionChoice();
			handleCorruptionCounter();
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
	}

	public void handleSecondChoice() {
		String secondChoice = userIn.nextLine().trim().toLowerCase();
		
		switch (secondChoice) {
		case "corrupt":
			handleCorruptionChoice();
			handleCorruptionCounter();
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
	}

	public void handleThirdChoice() {
		String thirdChoice = userIn.nextLine().trim().toLowerCase();
		
		switch (thirdChoice) {
		case "corrupt":
			handleCorruptionChoice();
			handleCorruptionCounter();
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
	
	public void handleExitDescription() {
		System.out.println("\nEXITING MODULE. STANDBY.");
		System.out.println("\nA sudden rush of humid air fills the module.");
		System.out.println("\nThe screen in front of you fades to black and the door of the capsule lifts.");
		//System.out.println("\nAs the door clicks into place above you, the echoes reveal a small, dark room.");
	}
	
	
	/////////// CORRUPTION effect handlers ///////////
	public void handleCorruptionChoice() {
		player.statReducer();
		System.out.println("\nC O R R U P T I O N");
	}
	
	public void handleCorruptionCounter(){
		corruptionCount++;
	}
	
	
	/////////////////// SCENE ONE ///////////////////
	public void sceneRoomOne() {
		/*
		 * 1. In the first scene, you are prompted to look around and try the panel
		 * 2. Trying the door before it is opened will fail
		 * 3. Once the panel is fixed and the door is opened, the user will be able to go through
		 * 4. Then random other scenes will start
		 */
		System.out.println("\nYou are in a dark room. At the end of the room, you see a panel and a door.");
		System.out.println("\nWhat do you do?\n");
		String[] roomOneOptions;
		
		if(!doorOneOpened) {
			roomOneOptions = new String[]{"1. Examine the control panel", "2. Look around", "3. Try the door"};
		} else {
			roomOneOptions = new String[]{"1. Examine the control panel", "2. Look around", "3. Go through the door"};
		}
		
		System.out.println(Arrays.toString(roomOneOptions));

		String roomOneChoice;
		
		do {
			roomOneChoice = sanitizeInput(userIn.nextLine());
			
			if (roomOneChoice.equalsIgnoreCase("Examine") || roomOneChoice.equalsIgnoreCase("1") || roomOneChoice.equalsIgnoreCase("panel")) {
				examinePanelOne();
			} else if (roomOneChoice.equalsIgnoreCase("Look around") || roomOneChoice.equalsIgnoreCase("2")) {
				System.out.println("\nA door is illuminated faintly next to the control panel.\n"); 
				sceneRoomOne();
			} else if (!doorOneOpened && (roomOneChoice.equalsIgnoreCase("3") || roomOneChoice.equalsIgnoreCase("door") || roomOneChoice.equalsIgnoreCase("try the door"))) {
				System.out.println("\nYou try the door. It is completely smooth, with no handles.\n");
				System.out.println("\nYou turn around.\n");
				sceneRoomOne();
			// logic for going to next random room if the first door is open
			} else if (doorOneOpened){
				System.out.println("\nAs you exit this room, the door immediately closes behind you.");
				String nextRoom = handleNextRoom(Arrays.asList("sceneRoomTwo", "sceneRoomThree"), visitedRooms);
				 switch (nextRoom) {
                 case "sceneRoomTwo":
                     sceneRoomTwo();
                     break;
                 case "sceneRoomThree":
                     sceneRoomThree();
                     break;
				 }
			} else {
				System.out.println("Invalid input. Try again.");
			}
			
		} while (!(roomOneChoice.equalsIgnoreCase("Examine") 
				|| roomOneChoice.equalsIgnoreCase("1") 
				|| roomOneChoice.equalsIgnoreCase("panel")
				|| roomOneChoice.equalsIgnoreCase("Look around") 
				|| roomOneChoice.equalsIgnoreCase("2") 
				|| roomOneChoice.equalsIgnoreCase("3") 
				|| roomOneChoice.equalsIgnoreCase("door") 
				|| roomOneChoice.equalsIgnoreCase("try the door")));
	}

	/////////////// SCENE ONE HANDLERS //////////////
	public void examinePanelOne() {
		
		/*
		 * 1. Display the panel to the user and guide them to fix it
		 * 2. Before the issue is fixed, it will output E R R O R
		 * 3. Once fixed, the panel will allow the user to open the door
		 */
		String bioError = "\nB I O M E T R I C E R R O R";
		String bioFixed = "\nB I O M E T R I C I N P U T";
		
		if(!switchFlipped) {
			System.out.println("\nThe panel is hanging by a wire going into the wall, and panel flickers a message: ");		
		} else {
			System.out.println("\nAs you flip the panel back over, the panel's message has changed: ");
		}
		
		System.out.println("\nA U T H E N T I C A T E U S E R");
		
		if (!switchFlipped) {
			System.out.println(bioError + "\n");
		} else {
			System.out.println(bioFixed + "\n");
		}
		
		String[] panelOptions;
		
		if(!switchFlipped) {
			panelOptions = new String[]{"1. Place hand on panel", "2. Flip panel over", "3. Go back"};
			System.out.println(Arrays.toString(panelOptions));
		} else {
			panelOptions = new String[] {"1. Place hand on panel", "2. Go back"};
			System.out.println(Arrays.toString(panelOptions));
		}
		
		String panelChoice;
		boolean invalidInput;
		
		do {
			
			panelChoice = sanitizeInput(userIn.nextLine());
			invalidInput = false;
			
			if (switchFlipped && (panelChoice.equalsIgnoreCase("2")) || panelChoice.equalsIgnoreCase("go back")){
				sceneRoomOne();
			}
			
			if (panelChoice.equalsIgnoreCase("1") || panelChoice.equalsIgnoreCase("place hand") || panelChoice.equalsIgnoreCase("place hand on panel")) {
				System.out.println("Nothing seems to happen.");
				examinePanelOne();
			} else if (panelChoice.equalsIgnoreCase("flip panel over") || panelChoice.equalsIgnoreCase("flip") || panelChoice.equalsIgnoreCase("2")) {
				System.out.println("\nFlipping the panel over, you see a red switch.");
				handleRedSwitch();
			} else if(panelChoice.equalsIgnoreCase("3") || panelChoice.equalsIgnoreCase("go back") || panelChoice.equalsIgnoreCase("back")) {
				sceneRoomOne();
//			} else if(panelChoice.equalsIgnoreCase("die")) {
//				loseTrigger();
//				winLoseCount();
			} else {
				System.out.println("Invalid choice, please choose again.");
				invalidInput = true;
			}
		} while (!(panelChoice.equalsIgnoreCase("1") || panelChoice.equalsIgnoreCase("place hand") || panelChoice.equalsIgnoreCase("place hand on panel") ||
	            panelChoice.equalsIgnoreCase("flip panel over") || panelChoice.equalsIgnoreCase("flip") || panelChoice.equalsIgnoreCase("2") ||
	            panelChoice.equalsIgnoreCase("3") || panelChoice.equalsIgnoreCase("go back") || panelChoice.equalsIgnoreCase("back")));
	}
	
	
	public void handleHandPanelOne() {
		String[] panelOptions = {"1. OPEN DOOR", "2. Go back"};
		System.out.println(Arrays.toString(panelOptions));
		String panelChoice = sanitizeInput(userIn.nextLine());
		
		if (panelChoice.equalsIgnoreCase("1") || panelChoice.equalsIgnoreCase("OPEN DOOR") || panelChoice.equalsIgnoreCase("open")) {
			System.out.println("\nA mechanical snap is heard as the door unlocks and opens.");
			doorOneOpened = true;
			sceneRoomOne();
		} else if (panelChoice.equalsIgnoreCase("back") || panelChoice.equalsIgnoreCase("go back")) {
			doorOneOpened = false;
			examinePanelOne();
		}
	}
	
	public void handleRedSwitch() {
		String[] switchOptions = {"1. Press red switch", "2. Go back"};
		System.out.println(Arrays.toString(switchOptions));
		
		String switchChoice = sanitizeInput(userIn.nextLine());
		
		if (switchChoice.equalsIgnoreCase("1") || switchChoice.equalsIgnoreCase("press red switch") || switchChoice.equalsIgnoreCase("press")) {
			System.out.println("You press the red switch, and the panel makes a chirping sound.");
			switchFlipped = true;
			handleHandPanelOne();
		} else if (switchChoice.equalsIgnoreCase("2") || switchChoice.equalsIgnoreCase("back") || switchChoice.equalsIgnoreCase("go back")) {
			examinePanelOne();
		}	
	}
	
	
	/////////////////// SCENE TWO ///////////////////
	public void sceneRoomTwo() {
		System.out.println("\nYou enter a dark room. "
				+ "There is a desk and a flickering lamp illuminating a desk. "
				+ "\n\nYou also see an identical door as the last room, and another control panel. "
				+ "This control panel is secured to the wall, it seems. ");
		String[] roomTwoOptions;
		
		if(!doorTwoOpened) {
			roomTwoOptions = new String[]{"1. Examine the control panel", "2. Check the desk", "3. Try the door"};
		} else {
			roomTwoOptions = new String[]{"1. Examine the control panel", "2. Check the desk", "3. Go through the door"};
		}
		
		System.out.println(Arrays.toString(roomTwoOptions));

		String roomTwoChoices = userIn.nextLine().toLowerCase().trim();
		
		switch (roomTwoChoices) {
		case "1":
			examinePanelTwo();
			break;
		case "panel":
			examinePanelTwo();
			break;
		case "desk":
			handleCheckDesk();
			break;
		case "2":
			handleCheckDesk();
			break;
		case "3":
			handleDoorCheck();
			break;
		case "door":
			handleDoorCheck();
			break;
		default: 
			System.out.println("Invalid action. Try again.");
			sceneRoomTwo();
		}
		
	}
	
	/////////////// SCENE TWO HANDLERS //////////////
	public void handleDoorCheck() {
		if (panelTwoActive) {
			System.out.println("\nAs you exit this room, the door immediately closes behind you.");
			String nextRoom = handleNextRoom(Arrays.asList("sceneRoomTwo", "sceneRoomThree"), visitedRooms);
			 switch (nextRoom) {
             case "sceneRoomTwo":
                 sceneRoomTwo();
                 break;
             case "sceneRoomThree":
                 sceneRoomThree();
                 break;
			 } 
		} else {
        	System.out.println("The door is locked. You need to activate the panel first.");
        	sceneRoomTwo();
		}
	}
	
	public void examinePanelTwo() {
		
		String panelTwoError = "\nS Y S T E M L O C K O U T";
		String panelTwoFixed = "\nS Y S T E M R E A D Y";
		
		if (!panelTwoActive) {
			System.out.println("\nThe panel does not allow input.");
		} else {
			System.out.println("\nThe panel is already active.");
		}
		
		System.out.println("\nA U T H E N T I C A T E U S E R");
		
		if(!panelTwoActive) {
			System.out.println(panelTwoError + "\n");
			sceneRoomTwo();
		} else	{
			System.out.println(panelTwoFixed + "\n");
			sceneRoomTwo();
		}
		
	}
	
	public void handleCheckDesk() {
		System.out.println("\nYou approach the desk. A computer blinks a question at you.");
		System.out.println("\nHello, Corrupted.");
		System.out.println("\nIs your corruption complete?");
		
		String[] answerComputer1 = {"YES", "NO"};
		System.out.println(Arrays.toString(answerComputer1));
		String computerChoice1 = sanitizeInput(userIn.nextLine());
		
		if (completeCorruption && (computerChoice1.equalsIgnoreCase("yes"))) {
			System.out.println("\nYour corruption is adequate. Open door?");
			
			String[] answerComputer2 = {"YES", "NO"};
			System.out.println(Arrays.toString(answerComputer2));
			String computerChoice2 = sanitizeInput(userIn.nextLine());
			
			if (computerChoice2.equalsIgnoreCase("yes")) {
				System.out.println("\nThe panel lights up next to the door.");
				doorTwoOpened = true;
				panelTwoActive = true;
				sceneRoomTwo();
			} else if (computerChoice2.equalsIgnoreCase("no")){
				System.out.println("\nGuess you'll be here for a while. Game over.");
				loseTrigger();
			} else {
				System.out.println("Invalid input. Try again.");
				handleCheckDesk();
			}
			
		} else if (computerChoice1.equalsIgnoreCase("no")){
			System.out.println("\nThe computer at the desk whirs.");
			loseTrigger();
		}
	}
	////////////////// SCENE THREE //////////////////
	public void sceneRoomThree() {
	    System.out.println("\nYou find yourself in a dark room.");
	    System.out.println("At the end of the room, where a panel might be, there are archaic, glowing symbols. Next to the symbols is a door.");
	    System.out.println("What do you want to do?\n");

	    String[] roomThreeOptions = {"1. Examine the symbols on the walls", "2. Approach the panel", "3. Try to open the door"};
	    System.out.println(Arrays.toString(roomThreeOptions));

	    String roomThreeChoice = userIn.nextLine().toLowerCase().trim();

	    switch (roomThreeChoice) {
	        case "1":
	            examineSymbols();
	            break;
	        case "symbols":
	            examineSymbols();
	            break;
	        case "2":
	            approachPanel();
	            break;
	        case "panel":
	            approachPanel();
	            break;
	        case "3":
	            tryOpenDoor();
	            break;
	        case "door":
	            tryOpenDoor();
	            break;
	        default:
	            System.out.println("Invalid action. Try again.");
	            sceneRoomThree();
	    }
	}

	/////////////// SCENE THREE HANDLERS //////////////
	public void examineSymbols() {
	    System.out.println("\nThe symbols seem to glow more intensely as you approach.");
	    System.out.println("As you try to decipher their meaning, your mind fills with flashes of war and ruin.");

	    int expGain = 20;
	    player.setExperience(player.getEXP() + expGain);

	    System.out.printf("You gain %d experience points.\n", expGain);

	    sceneRoomThree();
	}

	public void approachPanel() {
	    System.out.println("\nAs you move to the panel, you notice a handprint there.");
	    System.out.println("What will you do?\n");

	    String[] panelOptions = {"1. Touch the panel", "2. Go back"};
	    System.out.println(Arrays.toString(panelOptions));

	    String panelChoice = userIn.nextLine().toLowerCase().trim();

	    switch (panelChoice) {
	        case "1":
	            touchPanel();
	            break;
	        case "touch":
	            touchPanel();
	            break;
	        case "2":
	            sceneRoomThree();
	            break;
	        case "go back":
	        	sceneRoomThree();
	        	break;
	        default:
	            System.out.println("Invalid action. Try again.");
	            approachPanel();
	    }
	}

	public void touchPanel() {
		if (!panelThreeActive) {
            System.out.println("\nAs your hand makes contact with the panel, more visions flood your mind.");
            System.out.println("\nThe world must have been corrupted by an alien technology.");
            System.out.println("\nThe corruption that greeted you seems to have destroyed everything...");

            int pointsGain = 15;
            player.setPoints(player.getPoints() + pointsGain);

            System.out.printf("You gain %d points.\n", pointsGain);

            panelThreeActive = true;
        } else {
            System.out.println("\nThe panel has already been touched.");
        }

        sceneRoomThree();
    }

	public void tryOpenDoor() {
		if (panelThreeActive == true) {
            System.out.println("\nThe door opens with a hiss. A blinding light staggers you.");
            System.out.println("\nAs your eyes adjust, blistering air inundates your senses. "
            		+ "A metallic taste enters your mouth, and the smell of fire and ash nauseates you.");
            System.out.println("\nA collapsed building is revealed around you as you adjust to the light. "
            		+ "Indiscernable rubble, bent metal and ash in the air paint a grim picture.");
            winTrigger();
        } else {
            System.out.println("\nNothing happens.");
        }
	}
	////////////// SCENE THREE HANDLERS /////////////
	
	
	//////////////////// PROMPT USER TO PLAY AGAIN ////////////
	
	/*
	 * System.out.println("Do you want to play again? yes/no: "); String playAgain =
	 * userIn.nextLine().trim().toLowerCase();
	 * 
	 * if (!playAgain.equals("yes")){ System.out.println("Thanks for playing!");
	 * break; }
	 */
	
	
	//////////////// RANDOM STAT REDUCER ////////////////
	
	// takes a random user stat and lowers it by a random int 1-10(incl)
	
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
	
	/////////////// SANITIZE INPUT ////////////////////
	public String sanitizeInput(String input) {
		return input.trim().toLowerCase();
	}
}
