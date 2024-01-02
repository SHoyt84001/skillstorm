package com.skillstorm.Wednesday;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ConstructorChaining.*;

public class JavaGenerics {
	/*
	 * 	Java Generics are a language feature that allow for definition and use of
	 * 	generic types and methods
	 * 
	 * 	  -> CODE REUSABILITY
	 *    -> DO NOT work with primitive data types
	 *    		-> must use wrapper class
	 *    -> FORCES type safety, so you don't have to type-cast
	 * 
	 *    ->LinkedList<String> indicates that the parameter is type String
	 *    
	 *    -> Bounded generics
	 *    		-> gives your bound a limit on what types can be passed in
	 *    		-> can extend classes
	 *    			-> Printer<T extends Animals>
	 *    
	 *    		-> can extend interfaces
	 *    			-> Printer<T extends Interface>
	 *    
	 *    ->extend ONE class and MULTIPLE interfaces
	 *    		->multiple inheritance is not supported in java
	 *    		-> extend class must be first
	 *    		-> Printer <T extends Animal & Interface1 & Interface2>
	 *    -> use WILDCARD if type is unknown: ?
	 */
	
	
	public static void main(String[] args) {
		AllPrinter<Dog> stringPrint = new AllPrinter<>(new Dog());
		stringPrint.print();
		shout("Bark");
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(1);

		
		printList(intList);
		
		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog());
		dogList.add(new Dog());
		dogList.add(new Dog());
		
		printList(dogList);
		
	}
	
	// Generic Method
	private static <S, T> void shout(String thingToShout){
		System.out.println(thingToShout + "!!!!!!!");
	}
	
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}
}
