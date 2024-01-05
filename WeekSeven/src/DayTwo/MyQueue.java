package DayTwo;

import java.util.NoSuchElementException;

public class MyQueue<T> {
	/*
	 * Stacks vs. Queues
	 * 
	 * Stacks are "Last in, first out"
	 *  - new items pushed to the stack go to the front
	 *  
	 * Queues are "first in, first out"
	 *  - new items are added to the queue go to the back of the queue and wait until they get to the front
	 *  
	 *  For queues, just think of them as a line
	 *  
	 *  Real life examples of queues: 
	 *   - standing in line at a grocery store
	 *   - waiting for a rep on the phone
	 *   - jukebox machine queues you at the end of the list
	 *   - HTML traffic flow
	 *   
	 *   
	 *   
	 *   Queues are perfect when handling tasks or items sequentially, or one at a time
	 *   
	 *   There's also a "Dequeue" (pronounced deck), which stands for double ended queue
	 *   
	 *   Three key methods/functions for a queue:
	 *   
	 *   1. Peek() - same as the stack's peek, but returns value of the front
	 *   2. Poll() - same as the stack's pop, but removes from the front
	 *   3. Add() - same as the stack's push, but adds to the back
	 *   4. element() - same as Peek() for queue, but throws an exception if the queue is empty
	 */
	
	private Node<T> front;
	private Node<T> back;
	private int size;
	
	public MyQueue () {}
	
	public void add(T value) {
		Node<T> newBack = new Node<>(value);
		
		if(back != null) {
			back.setPrev(newBack);
		}
		
		newBack.setNext(back);
		back = newBack;
		
		// allows us to create 
		if (front == null) {
			front = newBack;
		}
		size++;
	}
	
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return front.getValue();
	}
	
	public T poll() {
		if (isEmpty()) {
			throw new NoSuchElementException("Cannot remove an element from an empty queue!");
		}
		
		T value = front.getValue();
		
		if (front.hasPrev()) {
			back = null;
			front = null;
		}
		else {
			front = front.getPrev();
			front.setNext(null);
		}
		size--; // decrement size
		return value;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		String str = "[";
		// starting with the front of the queue and print the whole queue without removing anything
		Node<T> currNode = front;
		
		while (currNode != null) {
			// add the value stored in that node to our string
			str += currNode.getValue();
			
			// if there are no next, that means its the final element in our queue, so no comma
			if(currNode.hasPrev()) {
				// if there is a prev node, add a comma
				str += ",";
			}
			// advance the pointer
			currNode = currNode.getPrev(); // changes our pointer from one node to that node's neighboring node
			}
		str += "]";
		return str;
	}
	
	public static void main(String[] args) {
		MyQueue<City> cityQueue = new MyQueue<>();
		
		System.out.println(cityQueue.size() + " " + cityQueue);
		
		cityQueue.add(new City("Anaheim", 345940));
		cityQueue.add(new City("Atlanta"));
		cityQueue.add(new City("D.C."));
		cityQueue.add(new City("Jacksonville"));
		cityQueue.add(new City("Pittsburg"));
		
		System.out.println(cityQueue);
		
		try {
			cityQueue.poll(); //the size should be zero
			cityQueue.poll(); //the size should be zero
			cityQueue.poll(); //the size should be zero
			cityQueue.poll(); //the size should be zero
			cityQueue.poll(); //the size should be zero
			cityQueue.poll(); //the size should be zero
			System.out.println(cityQueue.peek());
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("You cannot poll an empty queue");
		}
	}
}
