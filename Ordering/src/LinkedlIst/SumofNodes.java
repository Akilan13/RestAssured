package LinkedlIst;

import LinkedlIst.DeletionNNode.Node;

public class SumofNodes {
	
	 Node head;
	
	class Node {
		int data;
		
		Node next;
		
		Node(int d){
			
			data=d;
			next = null;
			
		}
		
	}
	
	public void push(int data) {
		
		Node newnode = new Node(data);
		
		newnode.next = head;
		head = newnode;
		
	}
	
	 public void printList() 
	    { 
	        Node tnode = head; 
	        while (tnode != null) { 
	            System.out.print(tnode.data + " "); 
	            tnode = tnode.next; 
	        } 
	    } 
	 
	 
	 public int sum() {
		 
		 Node p = head;
		 Node q = head.next;
		 int sum =0;
		 while (q.next!=null) {
		 if (p.data>q.data) {
			 
			sum = sum + p.data;
		 }
		 p= p.next;
		 q = q.next;
		 
		 }
		 
		 p = p.next;
		if (p.data>head.data) {
			
			sum=sum+p.data;
		}
		
		return sum;
	 }
	 
	    public static void main(String[] args) 
	    { 
	    	SumofNodes llist = new SumofNodes(); 
	    	
	    	llist.push(9); 
	        llist.push(2); 
	        llist.push(3); 
	        llist.push(5); 
	        llist.push(4);
	        llist.push(6); 
	        llist.push(8); 
	  
	        System.out.println("\nCreated Linked list is:"); 
	        llist.printList();  
	        
	        
	        int p =llist.sum();
	        
	        System.out.println(p);
	 
	    }
}
