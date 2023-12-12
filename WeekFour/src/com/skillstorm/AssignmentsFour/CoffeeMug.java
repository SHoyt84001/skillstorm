package com.skillstorm.AssignmentsFour;

public class CoffeeMug implements Fillable{

    private final double OUNCES;
    private double coffee;
    private double percentCoffee; 
    
    public CoffeeMug() {
    	this.OUNCES = 0;
    }
    
    public CoffeeMug(double ounces, double coffee) {
        this.OUNCES = ounces;
        this.coffee = coffee; 
        this.percentCoffee = (this.coffee / this.OUNCES) * 100;
    }

	@Override
	public void fill() {
		this.coffee = this.OUNCES;
		System.out.printf("\nYour mug is filled to the brim, with %,.2f ounces of coffee inside", this.coffee);
	}

	@Override
	public void empty() {
		this.coffee = 0; 
		System.out.printf("\nYour mug is empty. Time for a refill.");
	}

	@Override
	public void fill(double quantity) {
		if ((this.coffee + quantity) > this.OUNCES) {
			this.coffee = this.OUNCES;
			System.out.printf("\nWell, it's got %,.2f ounces in it, but you just spilled a bunch of coffee. Must be a Monday.", this.OUNCES);
		} else {
			this.coffee = this.coffee + quantity;
			System.out.printf("\nYou now have %,.2f ounces of coffee.", this.coffee);
		}
	}

	@Override
	public void empty(double quantity) {
		quantity = this.coffee - quantity; 
		System.out.printf("\nYour mug is now empty, with %,.2f coffee left.", quantity);
		
	}

	@Override
	public String toString() {
		return "\n\n-------------COFFEE-------------"
				+"\nMug Capacity: " + OUNCES + " ounces"
				+ "\nAmount of coffee in container: " + coffee + " ounces"
				+ String.format("\nYou are at: %,.2f" , percentCoffee) + "% capacity";
	}

}
