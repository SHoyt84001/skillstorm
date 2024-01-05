package DayThree;

import java.util.LinkedList;

public class PointerPractice {            
    
    /* 
     * Stored values can be Int, Str, Bool, Float, Char, etc.
     * 
     * Singly Linked List
     * 
     *  Head                       Null
     * -------  -------  -------  -------
     * |  A  |  |  B  |  |  C  |  | NULL| // stored values
     * | B-> |  | C-> |  |NULL>|  | NULL| // pointers forward
     * -------  -------  -------  -------
     * 
     * 
     * Doubly Linked List
     * 
     *  Head                       Tail
     * -------  -------  -------  -------
     * |  A  |  |  B  |  |  C  |  |  D  | // stored values
     * |  B->|  |  C->|  |  D->|  |NULL>| // pointers forward
     * |<NULL|  |<-A  |  |<-B  |  |<-C  | // pointers backward
     * -------  -------  -------  -------
     */
	
	//defining a node in singly linked list  
    class Node {    
    	int data;    
        Node next;                

        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    } 
    
    //defining the head and tail of a singly linked list   
    public Node head = null;    
    public Node tail = null;          

    public void addNode(char data) {    

        //Creating a new node   
        Node newNode = new Node(data);               

        //checking of the list is empty   
        if(head == null) { 
        	
        	head = newNode;
        	tail = newNode;
        }    
        // if list is not empty, the tail's next will point to newNode
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }
}