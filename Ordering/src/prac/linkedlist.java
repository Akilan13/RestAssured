package prac;

public class linkedlist {
	
	static Node head;
	
	static class Node {
		
		int data;
		Node next;
	
	
	 Node(int d) {
		
		data = d;
		next=null;
		
	}
	}
	
	public static void main(String[] args) {
		
		Node root1 = null, root2  = null, root3;
		
		linkedlist list = new linkedlist();
		list.head = new Node(10);
		list.head.next = new Node(30);
		list.head.next.next = new Node(20);
		list.head.next.next.next = new Node(40);
		
		linkedlist list2 = new linkedlist();
		
		list2.head = new Node(10);
		list2.head.next = new Node(20);
		list2.head.next.next = new Node(40);
		list2.head.next.next.next = new Node(30);
		
		//list.removeduplicates();
		
		//list.reverse();
		
		//list.display();
		
		//root1 = list.createnew(root1, 10);
		//root1 = list.createnew(root1, 20);
		//root1 = list.createnew(root1, 30);
		//root1 = list.createnew(root1, 40);
		//root1 = list.createnew(root1, 50);
		linkedlist list4 = new linkedlist();
		
		list4.display(list.head);
		list4.display(list2.head);
		
		root3 = list4.sorting(list.head, list2.head);
		
		list4.display(root3);
		
		Node root4 = list4.addtwo(list.head, list2.head);
				list4.display(root4);
		
	}
	
	
	public  void display (Node n) {
		//Node n = head;
		while (n!=null) {
			
			System.out.print(n.data+">");
			n = n.next;
		}
		
		System.out.println();
	}
	
	public void removeduplicates() {
		
		Node ptr1=head,ptr2;
		
		while (ptr1!=null && ptr1.next!=null) {
			
			ptr2 = ptr1;
			
			if (ptr1.data == ptr2.next.data) {
				
				ptr2.next = ptr2.next.next;
			} else {
				
				ptr2 = ptr2.next;
			}
			
			ptr1 = ptr1.next;
		}
	}
	
	public void reverse() {
		
		Node curr = head;
		
		Node prev = null, next = null;
		
		while(curr!=null) {
			
			next = curr.next;
			curr.next = prev;
			prev=curr;
			curr =next;
		}
		
		head=prev;
		
		
	}
	
	public Node createnew(Node n, int data) {
		
		Node ptr = null, temp =null;
		
		
		temp = new Node(data);
		temp.next = null;
		
		if (n==null) {
			
			n =temp;
		} else {
			
			ptr = n;
			
			while (ptr.next!=null)
				ptr = ptr.next;
			
			ptr.next = temp;
		}
		
		
		return n;
	}
	
	public Node sorting(Node n1,Node n2) {
		
		Node p,q,s;
		linkedlist list3 = new linkedlist();
		Node root3 = null;
		
		int data;
		p =n1;q=n2;
		while (p!=null && q!=null) {
		if (p.data<q.data) {
			s = p;
			p = p.next;
			data = s.data;
			root3 = list3.createnew(root3, data);
		} else {
			s = q;
			q = q.next;
			data = s.data;
			root3 = list3.createnew(root3, data);
		}
	
		
		}
		
		while (p!=null) {
			data = p.data;
			root3 = list3.createnew(root3, data);
			p = p.next;
		}
		
		while (q!=null) {
			
			data = q.data;
			root3 = list3.createnew(root3, data);
			q = q.next;
		}
		
		
		return root3;
	}
	
	public Node addtwo(Node n3, Node n4) {
		
		Node root4 = null;
		
		Node p =n3,q=n4;
		int s;
		
		while (p!=null && q!=null) {
			
			s = p.data+q.data;
			p =p.next;
			q = q.next;
			linkedlist list5 = new linkedlist();
			root4 = list5.createnew(root4, s);
		}
		
		return root4;
	}

}
