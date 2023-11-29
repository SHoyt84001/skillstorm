package com.skillstorm.WeekThree;

public class Person {
	
	String name;
	int age;
	String favoriteFood;
	String favoriteSport;

	public Person(String name) {
	// null is the default value of strings
	// 0 would be default for primitive data types

		this.name = name;
		this.age = 0;
		this.favoriteFood = null;
		this.favoriteSport = "soccer";
//		Person.population++; //population++; alternative to access static property, omits class name
	}
	
	public static void main (String[] args) {
		Person person1 = new Person("mark");
		
		
	}
}


