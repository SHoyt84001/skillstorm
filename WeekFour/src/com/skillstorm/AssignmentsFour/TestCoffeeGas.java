package com.skillstorm.AssignmentsFour;

public class TestCoffeeGas {
	public static void main(String[] args) {
		
		testDisplayGasStats();
		testFillGas();
		testEmptyGasTank();
		
		testDisplayCoffeeStats();
		testEmptyCoffeeMug();
		testFillCoffee();
	}
	
	// GAS RELATED METHODS
	
	public static void testDisplayGasStats() {
		GasTank gasTank = new GasTank(17.5, 3);
		System.out.println(gasTank);
	}
	
	public static void testFillGas() {
		GasTank tankFill = new GasTank();
		tankFill.fill(4);
	}
	
	public static void testEmptyGasTank() {
		GasTank emptyTank = new GasTank();
		emptyTank.empty();		
	}
	
	//COFFEE RELATED METHODS
	
	public static void testDisplayCoffeeStats() {
		CoffeeMug coffeeMug = new CoffeeMug(17.5, 3);
		System.out.println(coffeeMug);
	} 
	
	// change the arguments to switch between manual and default fill/empty
	
	public static void testEmptyCoffeeMug() {
		CoffeeMug emptyMug = new CoffeeMug();
		emptyMug.empty();
	}
	public static void testFillCoffee() {
		CoffeeMug mugFill = new CoffeeMug(16, 4.2);
		mugFill.fill(3);
	}

}
