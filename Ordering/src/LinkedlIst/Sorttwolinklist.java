package LinkedlIst;

import LinkedlIst.Createnew.Node;

public class Sorttwolinklist {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data =d;
			next=null;
		}
	}
	
	public Node createlink(Node root,int d) {
		
		Node pt;
				
		Node temp = new Node(d);
		temp.next=null;
		
		if (root==null) {
			
			root = temp;
			
		}else {
			
			pt=root;
			
			while(pt.next!=null) 
				
				pt = pt.next;
				
				
			pt.next=temp;
			
		}
		
		return root;
		
		
	}
	
	public Node compare (Node root1,Node root2) {
		
		Node p = root1,q= root2,s,temp,root=null,ptr;
		int d;
		while (p!=null && q!=null) {
		if (p.data<q.data)	{
			s=p;
			p =p.next;
			d =s.data;
		} else {
			s=q;
			q=q.next;
			d =s.data;
			
		}
		
		
			
		temp = new Node(d);
		temp.next = null;
		
		if (root==null) {
			root =temp;
			
		} else {
			ptr=root;
			 while(ptr.next!=null)
				 ptr = ptr.next;
			 
			 ptr.next=temp;
			
		}
		
		
			
		}
		
		while (p!=null) {
			
			d =p.data;
			p =p.next;
			temp = new Node(d);
			temp.next = null;
			ptr=root;
			 while(ptr.next!=null)
				 ptr = ptr.next;
			 
			 ptr.next=temp;
		}
		
		while (q!=null) {
			
			d =q.data;
			q =q.next;
			temp = new Node(d);
			temp.next = null;
			ptr=root;
			 while(ptr.next!=null)
				 ptr = ptr.next;
			 
			 ptr.next=temp;
		}
		return root;
		
	
	}
	
public void display(Node root) {
		
		while (root!=null) {
			//System.out.print("list");
			
			System.out.print(root.data + ">");
			root = root.next;
			
		}
		System.out.println();
		
	}
	
	
	public static void main (String[] args) {
		
		Node root1=null,root2=null,root=null;
		
		Sorttwolinklist create = new Sorttwolinklist();
		

		root1 = create.createlink(root1, 10);
		root1 = create.createlink(root1, 20);
		root1 = create.createlink(root1, 50);
		root1 = create.createlink(root1, 60);
		create.display(root1);
		
		root2 = create.createlink(root2, 30);
		root2 = create.createlink(root2, 40);
		root2 = create.createlink(root2, 80);
		root2 = create.createlink(root2, 90);
		
		create.display(root2);
		
		root = create.compare(root1, root2);
		
		create.display(root);
		
	}

}
