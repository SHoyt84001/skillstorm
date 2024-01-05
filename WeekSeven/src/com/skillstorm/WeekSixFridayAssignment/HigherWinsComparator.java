package com.skillstorm.WeekSixFridayAssignment;

import java.util.Comparator;

public class HigherWinsComparator implements Comparator<Athlete>{
	@Override
	public int compare(Athlete o1, Athlete o2) throws NullPointerException {
		if (o1.equals(null) || o2.equals(null)) {
			throw new NullPointerException();
		}
		return Integer.compare(o1.getWins(), o2.getWins());
	}

}
