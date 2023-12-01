package com.skillstorm.groupWork;

public class Dog extends Animal {

	
	public Dog() {}
	
	public Dog(String name, boolean isAlive, boolean isExtinct) {
		this.name = name;
		this.isAlive = isAlive; 
		this.isExtinct = isExtinct;
		if (isAlive == false || isExtinct == true) {
			System.out.println(this.name + " is suffering from a lack of alive");
		}
	} 
	
	public void talk() {
		System.out.println("bark");
	}
	
//	public boolean equals(Object obj) {
//		if (obj == this)
//			return true;
//		if (obj == null)
//		if (!super.equals(obj)) {
//			return false;
//		} return false;
//		Dog other = (Dog) obj;
//		return super.equals(obj) && other.talk == this.talk && other.howGoodOutOfTen &&
//	}
	
}
