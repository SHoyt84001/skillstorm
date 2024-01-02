package com.skillstorm.assignmentFriday;

/**
* TODO
* Fully encapsulate the IceCream class
*/
public class IceCream {
    private String flavor;
    private double price;
    
    public IceCream(String flavor, double price) {
    	this.flavor = flavor; 
    	this.price = price;
    }
    
    public String getFlavor() {
    	return flavor;
    }
    
    public Double getPrice() {
    	return price;
    }
}
