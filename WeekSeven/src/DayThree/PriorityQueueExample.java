package DayThree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Task> todos = new PriorityQueue<>(new TaskComparator());
		todos.offer(new Task("Study"));
		todos.offer(new Task("Clean dishes"));
		todos.offer(new Task("Read"));
		todos.offer(new Task("Run"));
		todos.offer(new Task("Clean laundry"));
		System.out.println("Prioritizing todos: ");
		while(!todos.isEmpty()) {
			System.out.println(todos.poll().name);
		}
	}
}

class Task {
		String name; 
		
		public Task(String name) {
			this.name = name;
		}
}

class TaskComparator implements Comparator<Task>{
	@Override
	public int compare(Task o1, Task o2) {
		if(o1.name.equals("clean")) {
			return 1;
		}
		return 2;
	}
}