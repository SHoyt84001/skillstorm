package com.skillstorm.groupWork;

public class TestAnimal {
	public static void main (String[] args) {
		Dog husky = new Dog();
		
		Cat maineCoon = new Cat();
		
		husky.reproduce();
		
		System.out.println(maineCoon);
		
		compareAnimals(maineCoon, husky);
		
		
	}
	


	
	static void compareAnimals(Animal cat, Animal dog) {
		
		if (cat.getClass() == dog.getClass()) {
			System.out.println("animals are the same");
		} else {
			System.out.println("these are not the same animal");
		}
	}
}
