package com.skillstorm.Wednesday;

import ConstructorChaining.*;

public class AllPrinter<S extends Animal> {
	
	S thingToPrint;
	
	
	public AllPrinter(S thingToPrint) {
		this.thingToPrint = thingToPrint;

		System.out.println(thingToPrint);

	}
	
	public void print() {
		thingToPrint.makeNoise();
		System.out.println(thingToPrint);
	}
	

}
