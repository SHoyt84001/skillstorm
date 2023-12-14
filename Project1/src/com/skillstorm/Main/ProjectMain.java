package com.skillstorm.Main;

import java.util.*;
import com.skillstorm.projectData.*;
import com.skillstorm.PlayerClass.Player;
import com.skillstorm.Scene.*;

public class ProjectMain{
	
	public static void main(String[] args) {
		/**
		 * Welcome to CORRUPT! This is a text-based adventure game.
		 * You will play as yourself in an attempt to be free of the place you find yourself in.
		 * 
		 * !!!!!!!!!!!!!!!!!!!
		 * What I want to happen: 
		 * 1. Player wakes up
		 * 
		 * 2.1 Player is asked, "How are you feeling?" from a screen in front of them
		 * 2.2 then they are prompted with three possible responses: 
		 *    
		 * 	     1-***CORRUPTED***
		 * 	     2-EXHAUSTED
		 * 	     3-***CORRUPTED***
		 * 
		 * 3. If the player inputs 1, 3, or the string "CORRUPT"
		 * 	  3.1 run a STAT_REDUCTION method that reduces on one of their random stats, between HP, STR and STA 
		 * 	  3.2 indicate that player that "You suddenly feel nauseated"
		 *    3.3 move to step 4.2 
		 * 
		 * 4. If the player inputs 2 or any of the strings "exhausted", "tired" or "yes"  
		 *    4.1 Player is asked, "Are you fit to move about?"
		 *    4.2 prompt with three possibilities: 
		 *       
		 *       1-***CORRUPTED***
		 *       2-YES
		 *       3-***CORRUPTED***
		 *    4.3 say "Very good! User is fit."
		 *    4.4 
		 */
		
		
		System.out.println("Welcome to the game. \n\n");
		
		Player player1 = new Player();
		
		// Starting the initial game "screen"
		Scanner userIn = new Scanner(System.in);
		
		Scene startScene = new Scene(userIn, player1);
		startScene.gameStart();
		
		
		
		Scene roomOneScene = new Scene(userIn, player1);
		roomOneScene.sceneRoomOne(player1);
		
	}
}
