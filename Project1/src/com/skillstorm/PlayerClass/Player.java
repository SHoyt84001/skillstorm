package com.skillstorm.PlayerClass;

public class Player {
	
	String name;
	int hitPoints; 
	int strength; 
	int stamina; 
	boolean isAlive;
	int EXP; 

	
	public Player () {}
	
	public Player(String name, int hitPoints, int strength, int stamina, int EXP) {
		this.name = name;
		this.hitPoints = 100; 
		this.strength = 20; 
		this.stamina = 20;
		this.EXP = 0; 
		
	}
	
	public void displayInfo() {
		System.out.println("Stats: ");
		System.out.println("Name: " + name);
		System.out.println("Health Points: " + hitPoints);
		System.out.println("Strength: " + strength);
		System.out.println("Stamina " + stamina);
		System.out.println("Experience Points: " + EXP);
	}
	
	public String getName() {
		return name;
	}
	
	public int getHP() {
		return hitPoints;
	}
	
	public int getSTR() {
		return strength; 
	}
	
	public int getSTA() {
		return stamina;
	}
	
	public int getEXP() {
		return EXP; 
	}
	
	@Override
	public String toString() {
		return ("Your player's stats are: " 
	+ "\nName: " + name 
	+ "\nHP: " + hitPoints
	+ "\nStrength: " + strength
	+ "\nStamina: " + stamina
	+ "\nExperience: " + EXP);
	}
	
	
}
