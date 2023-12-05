package com.skillstorm.AssignmentsFour;

public class GasTank implements Fillable {

    private final double GALLONS; // how much it can hold
 
    private double gas; // how much is in it 
    
    private double percentGas; // get % of max volume in tank

    public GasTank() {  
		this.GALLONS = 0;  
    } 
    
    public GasTank(double gallons, double gas) {  
        this.GALLONS = gallons;  
        this.gas = gas; 
        this.percentGas = (this.gas / this.GALLONS) * 100;
    }

	@Override
	public void fill() {
		this.gas = this.GALLONS;
		System.out.printf("\nYour tank is filled, with %,.2f gallons", this.gas);
	}

	@Override
	public void empty() {
		this.gas = 0;
		System.out.println("\nYour tank is now bone dry.");
	}

	@Override
	public void fill(double quantity) {
		if ((this.gas + quantity) > this.GALLONS) {
			this.gas = this.GALLONS;
			System.out.printf("\nsdfsdfsdfsdf gas everywhere ", this.gas);
		} else {
			this.gas = this.gas + quantity;
			System.out.printf("\nYou now have %,.2f gallons of gas.", this.gas);
		}
	}

	@Override
	public void empty(double quantity) {
		quantity = this.gas - quantity; 
		System.out.printf("\nYour tank is now empty, with %,.2f gallons left.", quantity);
	}

	@Override
	public String toString() {
		return "\n-------------GAS-------------"
				+ "\nGas tank capacity: " + GALLONS + " gallons"
				+ "\nAmount of gas in tank: " + gas + " gallons"
				+ String.format("\nYou are at: %,.2f" , percentGas) + "% capacity";
	}

}
