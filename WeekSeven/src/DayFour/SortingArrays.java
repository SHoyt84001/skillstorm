package DayFour;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingArrays {
	public static void main(String[] args) {
		Random generator = new Random();
		Cat cat1 = new Cat("Yugi", generator.nextInt(10) +1);
		Cat cat2 = new Cat("Momi", generator.nextInt(10) +1);
		Cat cat3 = new Cat("Yuki", generator.nextInt(10) +1);
		Cat cat4 = new Cat("Boots", generator.nextInt(10) +1);
		
		Cat[] cats = new Cat[4];
		
		cats[0] = cat1; 
		cats[1] = cat2; 
		cats[2] = cat3; 
		cats[3] = cat4; 
		
		System.out.println(Arrays.asList(cats));
		
		Arrays.sort(cats, new AlphabeticalCatComparator());
		System.out.println(Arrays.asList(cats));
	}
}



class Cat implements Comparable<Cat> {
	String name; 
	int cuteness; 
	
	public Cat(String name, int cuteness) {
		this.name = name; 
		this.cuteness = cuteness;
	}
	
	@Override
	public String toString() {
		return name + " (cuteness: " + cuteness + ")";
	}
	
	@Override
	public int compareTo(Cat that) {
		return that.cuteness - this.cuteness; // larger cuteness returns positive number
	}
}