package com.skillstorm.WeekSixFridayAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AthleteComparable {
	public static void main(String[] args) {
	//	Athlete test1 = new Athlete("Serena Williams", 75, 687);
	//	Athlete test2 = new Athlete("Candry Brooks", 16, 351);
	//	Athlete test3 = new Athlete("Ashley deMyers", 42, 754);
	//	System.out.println(test2);
		
		List<Athlete> athletes = new ArrayList<>(8);
		athletes.add(new Athlete("Jack Nicklaus", 75, 595));
		athletes.add(new Athlete("Lindsey Vonn", 82, 395));
		athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
		athletes.add(new Athlete("Novak Djokovic", 92, 280));
		athletes.add(new Athlete("Rafael Nadal", 92, 304));
		athletes.add(new Athlete("Roger Federer", 103, 367));
		athletes.add(new Athlete("Serena Williams", 73, 240));
		athletes.add(new Athlete("Tiger Woods", 82, 395));
		
	
		
		for (Athlete athlete : athletes) {
			System.out.printf("\n The winrate of %s is %2.2f%%", athlete.getName() , (double)athlete.getWins() / athlete.getCareerEvents() * 100);
		}
		
		
	}
}

