package DayTwo;

import java.util.Deque;
import java.util.LinkedList;

public class StackExamples {
	public static void main(String[] args) {
		Deque<Integer> stack1 = new LinkedList<>();
		
		// create a reference to an object
		String example = new String("Hello, World!");
		
		// point to the reference of the object
		System.out.println(example);
		
		Deque<String> food = new LinkedList<>();
		food.push("canned tuna");
		food.push("Steamed rice");
		food.push("tomato soup");
		food.push("garbanzo beans");
		
		System.out.println("My pantry has: ");
		prettyPrintStack((LinkedList<String>)food);
;
	}
	
	public static <E> void prettyPrintStack(LinkedList<E> list) {
		System.out.println("-------------");
		System.out.println("|    TOP    |");
		System.out.println("-------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
