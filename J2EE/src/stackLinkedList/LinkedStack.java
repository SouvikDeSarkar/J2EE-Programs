package stackLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
	private LinkedList<Students> stack;
	
	public LinkedStack() {
		stack = new LinkedList<Students>();		
	}
	
	public void push(Students students) {
		stack.push(students);
	}
	
	public Students pop() {
		return stack.pop();
	}
	
	public Students peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Students> iterator = stack.listIterator();
		if(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
