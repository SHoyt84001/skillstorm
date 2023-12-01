package com.skillstorm.groupWork;

public class Animal {
	
	public String name;
	public boolean isAlive;
	public boolean isExtinct;
	
	public Animal() {
}
	
	
	public Animal(String name, boolean isAlive, boolean isExtinct) {
		super();
		this.name = name;
		this.isAlive = isAlive;
		this.isExtinct = isExtinct;
//		if (isAlive == true && isExtinct == false) {
//				System.out.println(this.name + " is both alive and definitely not extinct!");
//		} else {
//				System.out.println(this.name + " has unfortunately passed. :(");}
	}



	public void talk() {
		System.out.println("yadayadayada");
	}
	
	public Animal reproduce() {
		return new Animal(this.name, true, false);
	}
}
