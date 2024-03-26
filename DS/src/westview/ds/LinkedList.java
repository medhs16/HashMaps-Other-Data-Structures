package westview.ds;

import java.util.ArrayList;

public class LinkedList {
	Node head;
	private int size;
	public LinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	public void add(Node n) {
		if (head == null) {
			head = n;
		}
		else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
		}
		size++;
	}
	public Node remove(int n) {
		Node temp = head, prev = null; 
		int i = 0;  
        // If head node itself holds the key to be deleted 
        if (temp != null && i == n) { 
            head = temp.next; // Changed head 
            return head; 
        } 
  
        // Search for the key to be deleted, keep track of 
        // the previous node as we need to change temp.next 
        while (temp != null && i != n) { 
            prev = temp; 
            temp = temp.next; 
        }
        
  
        // If key was not present in linked list 
        if (temp == null) 
            return null; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
        return head;
	}
	private Node remove(Node curr, int i, int n) {
		if (i==n) return curr;
		else {			curr = head;
			return remove(curr, i-1, n);
		}
	}
	public Node get(int index) {
		Node current = head; 
        int count = 0; /* index of Node we are 
                          currently looking at */
        while (current != null) 
        { 
            if (count == index) 
                return current; 
            count++; 
            current = current.next; 
        } 
  
        /* if we get to this line, the caller was asking 
        for a non-existent element so we assert fail */
        assert (false); 
        return null; 
	}

	public int size() {
		return size;
	}

}
