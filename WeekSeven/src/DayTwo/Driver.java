package DayTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		
		State florida = new State("Florida");
		City jacksonville = new City("Jacksonville", 962970, florida);
		City miami = new City("Miami", 439890, florida);
		City tallahassee = new City("Tallahassee", 197102, florida);
		
		ArrayList<City> floridaCities = new ArrayList<>(Arrays.asList(jacksonville, miami));
		florida.setCapital(tallahassee);
		florida.setCities(floridaCities);
		System.out.println(florida);
		
		/*
		 * This is method chaining
		 *  - get an object from another object and with that object we get the property off it all at once
		 *  
		 * Pros and Cons
		 * 
		 * Pros: 
		 *  - no wasted space with a local variable
		 *  - more concise syntax, you can do it all in one line
		 *  
		 * Cons: 
		 *  - if you have to use it more than once, it quickly becomes redundant to do it in the chaining way
		 */
		State miamiState = miami.getState();
		System.out.println(miamiState);
		
		//City miamiStateCapital = miami.getCapital();
	}
}
