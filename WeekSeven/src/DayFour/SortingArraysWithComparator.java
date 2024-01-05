package DayFour;

import java.util.Comparator;

public class SortingArraysWithComparator {

}

// Create a comparator that orders the cats by name
class AlphabeticalCatComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.name.compareTo(o2.name);
	}
	
}