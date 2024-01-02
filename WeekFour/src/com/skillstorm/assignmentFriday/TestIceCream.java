package com.skillstorm.assignmentFriday;

public class TestIceCream {
	public static void main(String[] args) {
		
		// create ice cream shop
		IceCreamShop iceCreamShop = new IceCreamShop();
		
		// create flavors and prices
		IceCream chocolateIceCream = new IceCream("Chocolate", 2.5);
		IceCream vanillaIceCream = new IceCream("Vanilla", 1.5);
		IceCream pistachioIceCream = new IceCream("Vanilla", 3.5);
		
		// add flavors to list
		iceCreamShop.addFlavor(vanillaIceCream);
		iceCreamShop.addFlavor(chocolateIceCream);
		iceCreamShop.addFlavor(pistachioIceCream);
		
		try {
		// testing application
		Customer test1 = new Customer("Jules", chocolateIceCream);
		iceCreamShop.addCustomer(test1);
		iceCreamShop.serviceCustomer();
		System.out.println("Total earnings: " + iceCreamShop.getAmountEarned());
		
		// testing addition of earnings
		Customer test2 = new Customer("Verne", vanillaIceCream);
		iceCreamShop.addCustomer(test2);
		iceCreamShop.serviceCustomer();
		System.out.println("Total earnings: " + iceCreamShop.getAmountEarned());
		
		// testing for no customers
		Customer test3 = new Customer("Terrance", pistachioIceCream);	
//		iceCreamShop.addCustomer(test3); // replace when test4 is ready to be done
		iceCreamShop.serviceCustomer();
		System.out.println("Total earnings: " + iceCreamShop.getAmountEarned());
		
		//testing removed flavors
		Customer test4 = new Customer("Andrew", pistachioIceCream);
		iceCreamShop.addCustomer(test4);
		iceCreamShop.removeFlavor(pistachioIceCream); // removed flavor specifically when andrew comes around
		iceCreamShop.serviceCustomer();
		System.out.println("Total earnings: " + iceCreamShop.getAmountEarned());
		
		} catch (IceCreamShopException e) {
			System.out.println("Error: " + e.getMessage());
			}
		}
}
