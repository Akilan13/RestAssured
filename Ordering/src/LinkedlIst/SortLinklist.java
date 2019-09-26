package LinkedlIst;

public class SortLinklist {
	
	Node head;
	
	class Node{
		
		Node next;
		int data;
		
		Node(int d){
			
			data=d;
			next = null;
		}
	}
	
	
	public  Node createlink(Node root,int de) {
		
		Node Temp,ptr;
		
		Temp = new Node(de);
		Temp.next=null;
		
		if (root==null) {
			
			root =Temp;
		} else {
			
			ptr=root;
			
			while (ptr.next!=null) 
				ptr = ptr.next;
				
				
				ptr.next = Temp;
				
			
		}
		
		return root;
		
	}
	
	
	public void display(Node root) {
		
		while (root!=null) {
			
			System.out.print(root.data + "<");
			root = root.next;
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Node root1 = null,root= null;
		
		SortLinklist list = new SortLinklist();
		
		root1 = list.createlink(root1, 10);
		root1 = list.createlink(root1, 30);
		root1 = list.createlink(root1, 20);
		root1 = list.createlink(root1, 50);
		root1 = list.createlink(root1, 40);
		
		list.display(root1);
		
		
	}

}
