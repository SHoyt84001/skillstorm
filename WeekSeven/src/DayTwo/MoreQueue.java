package DayTwo;

import java.util.Deque;
import java.util.LinkedList;

public class MoreQueue {
	public static void main(String[] args) {
		Deque<String> line = new LinkedList<>();
		line.add("Sean");
		line.add("Steve");
		System.out.println(line);
		
		line.addFirst("caroline"); // adds a name to the back of the queue
		System.out.println(line);
		
		line.poll(); // queue method, removes a name from the front of the queue
		
		//line.addFirst();
	}
}
