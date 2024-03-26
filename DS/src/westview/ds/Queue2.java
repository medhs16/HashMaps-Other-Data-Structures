package westview.ds;

import java.util.ArrayList;

public class Queue2<T> {
	
	//use Stack(s) - you must use 2 Stacks to implement
	Stack front;
	Stack back;
	public Queue2() {
		// TODO Auto-generated constructor stub
		front = new Stack();
		back = new Stack();
		
	}
	
	public T peek() {
		
		//return the value at the front of the queue
		//don't remove it
		if (front.size() == 0 && back.size() == 0) {
			return null;
		}
		else if (back.size() == 0) {
			return (T) front.peek();
		}
		else {
			for (int i = 0; i < front.size(); i++) {
				back.push(front.pop());
			}
			return (T) back.peek();
		}
	}
	
	//add a size method that returns the number of elements in the Line
	public int size() {
		return front.size()+back.size();
	}
	
	public boolean empty() {
		if (front.size()+ back.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		if (front.size() == 0 && back.size() == 0) {
			return null;
		}
		else if (back.size() == 0) {
			return (String) front.peek();
		}
		else {
			for (int i = 0; i < front.size(); i++) {
				back.push(front.pop());
			}
			return (String) back.peek();
		}
	}
	//add a setter called push
	//that will push to the bottom of the line
	public void enQueue(Stack<T> x) {
		//add the element to the bottom of the line
		front.push(x);
	}
	
	//add a getter called pop
	//that will remove from the top of the line
	//return null if empty
	public T deQueue() {
		if (back.size() != 0) {
			return (T) back.pop();
		}
		else {
			for (int i = 0; i < front.size(); i++) {
				back.push(front.pop());
			}
			return (T) back.pop();
		}
		
		//what to return
		//return the top of the Line (remove the element)
		
	}

}
