package westview.ds;

import java.util.ArrayList;

public class Queue<T> {
	
	private ArrayList<T> line;
	
	//add a constructor
	public Queue() {
		//the initial size of our array is 20
		//instantiate the data list
		line = new ArrayList<T>(); 
	}
	
	//preview what is at the bottom of the line
		public T peek() {
			
			//return the value at the bottom of the line
			//don't remove it
			if (line.size() == 0) {
				return null;
			}
			return line.get(0);
			
		}
		
		//add a size method that returns the number of elements in the Line
		public int size() {
			return line.size();
		}
		
		//add a setter called push
		//that will push to the bottom of the line
		public void enQueue(T x) {
			//add the element to the bottom of the line
			line.add(0,x);
		}
		
		//add a getter called pop
		//that will remove from the top of the line
		//return null if empty
		public T deQueue() {
			
			//what to return
			//return the top of the Line (remove the element)
			if (line.size() == 0) {
				return null;
			}
			return line.remove(line.size()-1);
		}

}
