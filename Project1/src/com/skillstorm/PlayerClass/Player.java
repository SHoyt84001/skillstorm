package com.skillstorm.PlayerClass;

import java.io.*;
import java.util.List;
import java.util.Random;

public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int hitPoints; 
	private int strength; 
	private int stamina; 
	private boolean isAlive;
	private int EXP; 
	private int score;
	private int winCount;
	private int loseCount;
	private int points;
	
	public Player() {
		this.name = "CORRUPTED";
		this.hitPoints = 100; 
		this.strength = 20; 
		this.stamina = 20;
		this.EXP = 0; 
		this.score = 0;
	}
	
	public Player(String name, int hitPoints, int strength, int stamina, int EXP, int score) {
		this.name = name;
		this.hitPoints = hitPoints; 
		this.strength = strength; 
		this.stamina = stamina;
		this.EXP = EXP; 
		this.score = score;
	}
	
	public void increaseEXP(int amount) {
		EXP += amount;
		System.out.println("You gained " + amount + " EXP!");
	}
	
	public void statReducer() {
		// use getters to create an array of stats
		int[] stat = {this.strength, this.stamina, this.hitPoints};
		// create a new object of the random utility
		Random random = new Random();
		// select a random index in the array above between 1 and the 
		//    length of the array
		int randomStatIndex = random.nextInt(stat.length);
		// create a variable that points directly at this index
		int selectedStat = stat[randomStatIndex];
		
		int reduction = random.nextInt(10) + 1;
		
		if(selectedStat == strength) {
		this.setStrength(strength - reduction);
		System.out.println("A heavy drowsiness overcomes you. Strength down.");
		} else if(selectedStat == stamina) {
		this.setStamina(stamina - reduction);
		System.out.println("Your heart begins pounding. Stamina down.");
		} else if(selectedStat == hitPoints) {
		this.setHitPoints(hitPoints - reduction);
		System.out.println("Your head feels like it's about to explode. HP down.");
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
	
	public int getHP() {
		return this.hitPoints;
	}
	
	public int getSTR() {
		return strength; 
	}
	
	public int getSTA() {
		return stamina;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getEXP() {
		return this.EXP; 
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public String toString() {
		return ("Your player's stats are: \n" 
	+ "\nName: " + name 
	+ "\nHP: " + hitPoints
	+ "\nStrength: " + strength
	+ "\nStamina: " + stamina
	+ "\nExperience: " + EXP
	+ "\nScore: " + score);
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int i) {
		this.points += i;
	}

	public void setExperience(int i) {
		this.EXP += i;		
	}
}
