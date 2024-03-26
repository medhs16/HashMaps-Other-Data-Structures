package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		
		//an empty stack should return a size 0
		assert(myStack.size()==0);//nothing added
		
		//can we try to pop
		assert(myStack.pop() == null);//empty
		
		//write an assertion about the peek method
		//that should be true when it's empty
		assert(myStack.peek()== null);//empty
		
		//push to the Stack twice
		//make an assertion about what should be true
		myStack.push(7);
		myStack.push(11);
		assert(myStack.size()==2);
		assert(myStack.peek()==11);
		
		//destructive stuff
		assert(myStack.pop()==11);
		
		//check the size change and that the new top is expected
		assert(myStack.peek()==7);//top is now 7
		assert(myStack.size()==1);
	}

}
