package com.skillstorm.WeekSixFridayAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Athlete {
	private String name; 
	private int wins; 
	private int careerEvents;

	public Athlete(int wins, int careerEvents) {
		this.wins = wins;
		this.careerEvents = careerEvents;
	}
	public Athlete(String name, int wins, int careerEvents) {
		this.name = name;
		this.wins = wins;
		this.careerEvents = careerEvents;
	}
	public double getWinRate() {
		return ((double) wins / careerEvents * 100);
	}
	public String getName() {
		return name;
	}
	public int getWins() {
		return wins;
	}
	public int getCareerEvents() {
		return careerEvents;
	}
	
	@Override 
	public String toString() {
		return String.format(
				"\n%s has a winrate of %2.2f%% with %d games won and %d games played" 
				, name 
				, ((double) wins / careerEvents * 100) 
				, wins 
				, careerEvents
				);

	}
	
	public static void main(String[] args) {
		
		List<Athlete> athletes = new ArrayList<>(8);
		athletes.add(new Athlete("Jack Nicklaus", 75, 595));
		athletes.add(new Athlete("Lindsey Vonn", 82, 395));
		athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
		athletes.add(new Athlete("Novak Djokovic", 92, 280));
		athletes.add(new Athlete("Rafael Nadal", 92, 304));
		athletes.add(new Athlete("Roger Federer", 103, 367));
		athletes.add(new Athlete("Serena Williams", 73, 240));
		athletes.add(new Athlete("Tiger Woods", 82, 395));
		
		// win-rate comparator that sorts players in decending order by their win %
		Collections.sort(athletes, new WinRateComparator().reversed());
		System.out.println("Players in order of their % of wins: ");
		System.out.println(athletes);
		
		// BONUS 
		// total wins comparator that sorts players in decending order by their amount of wins
		Collections.sort(athletes, new HigherWinsComparator().reversed());
		System.out.println(athletes);
		
		

		
	}
}
