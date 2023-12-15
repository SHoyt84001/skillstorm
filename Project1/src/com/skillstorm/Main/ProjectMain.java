package com.skillstorm.Main;

import java.util.*;
import com.skillstorm.PlayerClass.Player;
import com.skillstorm.Scene.*;

public class ProjectMain{
	
	public static void main(String[] args) {
		/**
		 * Welcome to CORRUPT! This is a text-based adventure game.
		 * You will play as yourself in an attempt to be free of the place you find yourself in.
		 */
		
		
		System.out.println("Welcome to CORRUPT. \n\n");
		
		Player player1 = new Player();
		
		// Starting the initial game "screen"
		Scanner userIn = new Scanner(System.in);
		
		Scene startScene = new Scene(userIn, player1);
		startScene.gameStart();

		
	}
}
