package com.skillstorm.groupWork;

import java.util.Objects;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}
	
	public void climb() {
		if (isAlive = false) {
			
		}
	}
	
	public void talk() {
		System.out.println("meow!");
	}
	
	public Cat reproduce() {
		return new Cat();
	}
	
	public String isEqual(Animal cat) {
		if (Objects.equals(cat.name, name)) {
			String response = " is the same name as ";
			return response; 
		} return "yes";
	}
	
	
}
