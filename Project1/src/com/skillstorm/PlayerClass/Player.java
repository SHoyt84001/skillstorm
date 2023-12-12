package com.skillstorm.PlayerClass;
import java.io.*;
import java.util.Random;

public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private static int hitPoints; 
	private static int strength; 
	private static int stamina; 
	private boolean isAlive;
	private int EXP; 
	private int score;

	
	public Player() {
		this.name = "CORRUPTED";
		this.hitPoints = 100; 
		this.strength = 20; 
		this.stamina = 20;
		this.EXP = 0; 
		this.score = 0;
	}
	
	public void increaseScore(int points) {
		score += points;
	}
	
	public void statReducer() {
		// use getters to create an array of stats
		int[] stat = {Player.strength, Player.stamina, Player.hitPoints};
		// create a new object of the random utility
		Random random = new Random();
		// select a random index in the array above between 1 and the 
		//    length of the array
		int randomStatIndex = random.nextInt(stat.length);
		// create a variable that points directly at this index
		int selectedStat = stat[randomStatIndex];
		
		int reduction = random.nextInt(10) + 1;
		
		if(selectedStat == strength) {
		Player.setStrength(strength - reduction);
		System.out.println("You suddenly feel nauseated. Strength down.");
		} else if(selectedStat == stamina) {
		Player.setStamina(stamina - reduction);
		System.out.println("You suddenly feel nauseated. Stamina down.");
		} else if(selectedStat == hitPoints) {
		Player.setHitPoints(hitPoints - reduction);
		System.out.println("You suddenly feel nauseated. HP down.");
		}
	
}
	
	
	public void saveScore() {
		try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(new File("score.dat")))) {
			fileOut.writeObject(Player.loadPlayer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Player loadPlayer() {
		Player player = null;
		try (ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("score.dat"))){
			player = (Player) fileIn.readObject();
		} catch (IOException | ClassNotFoundException e) {
			player = new Player();
		}
		
		return player;
	}
	
	
	
	public void displayInfo() {
		System.out.println("Stats: ");
		System.out.println("Name: " + name);
		System.out.println("Health Points: " + hitPoints);
		System.out.println("Strength: " + strength);
		System.out.println("Stamina " + stamina);
		System.out.println("Experience Points: " + EXP);
		System.out.println("Current points: " + score);
	}
	
	public String getName() {
		return name;
	}
	
	public static int getHP() {
		return hitPoints;
	}
	
	public static int getSTR() {
		return strength; 
	}
	
	public static int getSTA() {
		return stamina;
	}
	
	public static void setHitPoints(int hitPoints) {
		Player.hitPoints = hitPoints;
	}

	public static void setStrength(int strength) {
		Player.strength = strength;
	}

	public static void setStamina(int stamina) {
		Player.stamina = stamina;
	}

	public int getEXP() {
		return EXP; 
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return ("Your player's stats are: " 
	+ "\nName: " + name 
	+ "\nHP: " + hitPoints
	+ "\nStrength: " + strength
	+ "\nStamina: " + stamina
	+ "\nExperience: " + EXP
	+ "\nScore: " + score);
	}
	
	
}
