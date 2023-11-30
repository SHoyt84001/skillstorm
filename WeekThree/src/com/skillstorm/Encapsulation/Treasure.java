package com.skillstorm.Encapsulation;

public class Treasure {
	// TODO add necessary access modifiers
    
	private String name; // name of treasure (coin, bullion)

    private String description; // what is it?

    private double value; // worth in dollars
    
    // TODO add no-arg and all-args constructors
    public Treasure() {
    	
    }
    
    public Treasure(String name, String description, String value) {
    	this.name = name;
    	this.description = description;
    	this.value = Double.parseDouble(value); 
    	
    }
 
    // TODO add getter and setter methods for each property


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

    // TODO add toString method
	
	@Override
	public String toString() {

		return "Treasure [name=" + name + ", description=" + description + String.format(", value= $%,.2f" , value) + "]";
	}
}
	
    
    
    
    
    