package LinkedlIst;

public class DeletionNNode {
	
	Node head;
	
	
	class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
	
	
	public void deletion(int n) {
		
		Node first = head;
		Node second = head;
		
		for (int i =0;i<n;i++) {
			
			if (second.next==null) {
				
				if (i==n-1) {
				
				head = head.next;
				return;
				
				}
			}
			
			second = second.next;
			
		}
		
		
		while (second.next!=null) {
			
			first = first.next;
			second = second.next;
		}
		
		first.next = first.next.next;
		
		
		
	}
	
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }
    
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) { 
            System.out.print(tnode.data + " "); 
            tnode = tnode.next; 
        } 
    } 

    
    public static void main(String[] args) 
    { 
    	DeletionNNode llist = new DeletionNNode(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
        llist.push(9); 
  
        System.out.println("\nCreated Linked list is:"); 
        llist.printList(); 
  
        int n = 3; 
        llist.deletion(n); 
  
        System.out.println("\nLinked List after Deletion is:"); 
        llist.printList(); 
    } 
}

