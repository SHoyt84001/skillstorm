package DayTwo;

public class Example {
	public static void main(String[] args) {
		// create a reference to an object 
		String example1 = new String("Hello, World!");
		String example2 = new String("Hello, World!");
		
		// point to the reference of the object
		System.out.println(example1);
		
		// make example1 available for garbage collection
		// and now example2 contains the memory address of the object
		example1 = example2; 
		
		// null is the default value of objects and primitives,
		// however, by assigning null we mark it for GC
		example2 = null;
		
		// by making a null reference, no object is being referenced
		// but it can be useful to note an important value for later
		String example3 = null;
		
		// another reference to a string object
		String example4 = new String("This is a list of: ");
		
		// this method will not change the original object 
		modifyString(example4);	
		
		// example4 is still a reference to the
		// string object "This is a list of: "
		System.out.println(example4);
	}
	
	public static void modifyString(String string) {
		string = string + "random words";
	}
	
}
