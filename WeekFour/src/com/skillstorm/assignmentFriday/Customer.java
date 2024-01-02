package com.skillstorm.assignmentFriday;

/**
 * TODO
 * Fully encapsulate the Customer class
 */
public class Customer {
    private IceCream iceCream;
    private String name;
    
    public Customer(String name, IceCream iceCream) {
    	this.name = name;
    	this.iceCream = iceCream;
    }
    
    public IceCream getIceCream() {
    	return iceCream;
    }
    
    public String getName() {
    	return name;
    }
}