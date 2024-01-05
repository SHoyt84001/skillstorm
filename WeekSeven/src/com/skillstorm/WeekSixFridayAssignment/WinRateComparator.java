package com.skillstorm.WeekSixFridayAssignment;

import java.util.Comparator;

public class WinRateComparator implements Comparator<Athlete>{
	
	@Override
	public int compare(Athlete o1, Athlete o2) throws NullPointerException{
		if(o1.equals(null) || o2.equals(null)) {
			throw new NullPointerException();
		} 
		return Double.compare(o1.getWinRate(), o2.getWinRate());
	}
}