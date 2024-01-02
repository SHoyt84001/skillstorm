package com.skillstorm.assignmentFriday;

import java.util.ArrayList;
import java.util.Scanner;

public class IceCreamShop {

    private double amountEarned;
    private ArrayList<IceCream> flavors; // Are the flavors available at a given store
    private ArrayList<Customer> customerLine; 
    
    public IceCreamShop() {
    	this.customerLine = new ArrayList<>();
    	this.flavors = new ArrayList<>();
    	this.amountEarned = 0.0;
    }
   
    public void serviceCustomer() throws IceCreamShopException {
    	if (customerLine.isEmpty()) { 
    		throw new IceCreamShopException("No customers are in line!");
    	}
    	
    	Customer customer = customerLine.remove(0);
    	IceCream iceCream = customer.getIceCream();
    	String flavor = customer.getIceCream().getFlavor();
    	
    	if (!flavors.contains(iceCream)) {
    		throw new IceCreamShopException("That flavor isn't available!");
    	}
    	double iceCreamCost = iceCream.getPrice();
    	amountEarned += iceCreamCost;
    }
    
 
    public void addCustomer(Customer customer) {
        customerLine.add(customer);
    }

    public void addFlavor(IceCream flavor) {
        flavors.add(flavor);
    }

    public void removeFlavor(IceCream flavor) {
        flavors.remove(flavor);
    }
    
    public double getAmountEarned() {
    	return amountEarned;
    }
}

class IceCreamShopException extends Exception {
	/**
	 * I don't know why I have to do this serialVersionUID whenever I extend something. Something to research.
	 */
	private static final long serialVersionUID = 1L;

	public IceCreamShopException(String message) {
		super(message);
	}
}