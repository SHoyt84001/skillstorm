package com.skillstorm.weekFivePractices;

public class TestClass {   
	 public static void main(String[] args) {
		    int count = 11;
		    if(count <= 10 || ++count > 11) {
		    	count += 1;
		    } else if(++count >= 10 && count < 12) {
		    	count += 4;
		    } else {
		    	count += 7;
		    }
		    System.out.println(count);
		  }
 
}
