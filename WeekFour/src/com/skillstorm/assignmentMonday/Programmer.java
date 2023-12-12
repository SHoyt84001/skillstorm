package com.skillstorm.assignmentMonday;

import java.util.*;

public class Programmer {

	/**
	 * Create a class, Programmer, that describes a real-life programmer. 
	 * The class should be able to learn + forget programming languages,
	 *  in addition to having unique properties such as the person's name and the company they work for. 
	 * The class should be encapsulated and the languages that a person knows should be stored in a String array
	 *  and should not allow entry of empty Strings.

	Requirements:

	- Defines properties such as programming languages, name, and the company the Programmer works for
	- Have the data be full encapsulated via private fields and public getters and setters
	- Have the ability to create multiple Programmer objects and have their data be independent of one another
	- Possess the ability to learn and forget programming languages at will through publicly accessible methods on the Programmer class
	- Prevent the addition of empty Strings to the programming languages array 
	- Override the toString method to allow the printing of a Programmer object
	
	-Bonus Challenge:

		Override the equals method to compare two Programmer objects 
		(only compare the array of known programming languages not any other properties such as name)
	 */
	
	private String name; 
	private String employer;
	private int numOfLearned;
	private String[] learnedLangs;

	
	public Programmer() {}
	
	public Programmer(String name, String employer, int numOfLearned) {
		this.name = name; 
		this.employer = employer;
		this.numOfLearned = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployer() {
		return employer;
	}
	
	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getNumOfLearned() {
		return numOfLearned;
	}

	public void setNumOfLearned(int numOfLearned) {
		this.numOfLearned = numOfLearned;
	}

	public String[] getlearnedLangs() {
		return learnedLangs;
	}
	
	public void setLearnedLangs(String[] learnedLangs) {
		this.learnedLangs = learnedLangs;
	}

	public static String[] learnLanguage(String[] learned) {
		Scanner userLearned = new Scanner(System.in);
		
		for (int i = 0; i < learned.length; i++) {
			System.out.println("Enter new language you learned: ");
			learned[i] = userLearned.next();
		}
		
		return learned;
	}
	
	
	public static String[] forgetLanguage(String[] learnedLangs, String languageForgotten) {
		Scanner userQ = new Scanner(System.in);
		
		for (int i = 0; i < learnedLangs.length; i++) {
			System.out.println("Enter the language you forgot: ");
			String langToForget = userQ.nextLine();
			if (learnedLangs[i].equals(langToForget)) {
				for (int j = i; j < learnedLangs.length - 1; j++) {
					learnedLangs[j] = learnedLangs[j + 1];
				}
				learnedLangs[learnedLangs.length - 1] = null;
			}	
		}
		
		return Arrays.copyOf(learnedLangs, learnedLangs.length - 1);
	}

	@Override
	public String toString() {
		return "Programmer name: " + name + ", employer: " + employer + ", numOfLearned: " + numOfLearned
				+ ", learnedLangs: " + Arrays.toString(learnedLangs);
	}
}
