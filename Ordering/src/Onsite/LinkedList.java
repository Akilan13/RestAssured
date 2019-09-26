package Onsite;

public class LinkedList{
	
	Node head;
	
	class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
	
	
	/* Inserts a new Node at front of the list. */
	
	public void push(int data) {
		
		Node newnode = new Node(data);
		
	if (head==null) {
		
		head = newnode;
		return;
	}
		
		newnode.next = head;
		
		head = newnode;
		
		return;
	}
	
	
    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data) {
    	
    	
    	 if (prev_node==null) {
    		 
    		 System.out.println("data cannot be inserted");
    	 }
    	 
    	 Node newnode = new Node(new_data);
    	 
    	 newnode.next=  prev_node.next ;
    	 prev_node.next=newnode;
    	 return;   	 
    	
    }
    
    
    /* Appends a new node at the end.  This method is  
    defined inside LinkedList class shown above */
 public void appends(int new_data) {
	 
	 Node current = head;
	 
	 Node newnode = new Node(new_data);
	 
	 if (head==null) {
	
		 head = newnode;
		 return;
		 
	 }
	 
	 while (current.next!=null) {
		 
		 current = current.next;
	 }
	 
	 current.next = newnode;
	 
	 return;
 
 }
 
 public void printList() 
 {
	 
	 Node tnode = head;
	 
	 while (tnode.next!=null) {
		 
		System.out.println(tnode.data); 
		
		tnode = tnode.next;
	 }
	 
 }
 
 
 public static void main(String[] args) 
 { 
     /* Start with the empty list */
     LinkedList llist = new LinkedList(); 

     // Insert 6.  So linked list becomes 6->NUllist 
     
     llist.appends(2);
     llist.push(6); 
     llist.push(5); 
     llist.push(9); 
     llist.insertAfter(llist.head.next, 4);
     llist.printList();
     
 }	
	
}

 

 