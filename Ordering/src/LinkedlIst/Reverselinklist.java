package LinkedlIst;

import com.graphbuilder.struc.LinkedList;

public class Reverselinklist {
	
	static Node head;
	
	
	class Node{
		
		Node next;
		int data;
		
		Node (int d){
			
			next=null;
			data = d;
		}
	}
	
	public Node reverse(Node root) {
		
		Node curr=root,prev=null,next=null;
		
		while(curr!=null) {
            next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
		}
		
		root = prev;
		return root;
		
	}
	
	public Node Push(Node root,int d) {
		
		Node temp,ptr;
		
		temp = new Node(d);
		temp.next = null;
		
		if (root == null) {
			root = temp;
						
		} else {
			
			ptr = root;
			while(ptr.next!=null) 
				ptr = ptr.next;
				
				
			ptr.next = temp;
			
		}

		return root;
		}
		
	
	
	
	public static void main(String[] args) {
		Node root = null;
		
		Reverselinklist reverselinklist	 = new Reverselinklist();
		
		root = reverselinklist.Push(root, 10);
		root = reverselinklist.Push(root, 20);
		root = reverselinklist.Push(root, 30);	
		root = reverselinklist.Push(root, 40);
		
		root = reverselinklist.reverse(root);
	}
}
