package LinkedlIst;

public class Createnew {
	
	Node head;
	
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next=null;
		}
		
		
	}
	
	
	public Node createnewlist(Node root,int d) {
		
		Node p,temp;
		
		temp = new Node(d);
		temp.next = null;
		
		
		if (root==null) {
			
			root = temp;
		}
			else {
				
				p = root;
				
				while (p.next!=null) 
				p =p.next;	
					
			p.next=temp;
			
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
	
	public Node comparenewlist(Node root1,Node root2) {
		
	    Node ptr1 = root1, ptr2 = root2, ptr;  
	    Node root = null, temp; 
	    int d;
	    while (ptr1 != null) {  
	    	d =  (ptr1.data>ptr2.data)?ptr1.data:ptr2.data;
	        temp = new Node(d);  
	        temp.next = null; 
	        
	    	if (root==null) {
			
			root=temp;
		} else {
			
			ptr = root;
			 while(ptr.next!=null)
				 ptr = ptr.next;
			 
			 ptr.next=temp;
		}
		
		ptr1 = ptr1.next;
		ptr2 = ptr2.next;
		
	    }
	    
	    return root;
	}
	
	public static void main(String args[]) {
		
		Node root=null,root1=null,root2=null;
		
		Createnew create = new Createnew();
		
		root1 = create.createnewlist(root1, 3);
		root1 = create.createnewlist(root1, 5);
		root1 = create.createnewlist(root1, 8);
		
		
		create.display(root1);
		
		
		root2 = create.createnewlist(root2, 9);
		root2 = create.createnewlist(root2, 4);
		root2 = create.createnewlist(root2, 7);
		
		create.display(root2);
		
		root = create.comparenewlist(root1, root2);
		create.display(root);
	}

}
