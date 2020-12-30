package stacksArray;

import java.util.EmptyStackException;

public class ArrayStack {
	

	private Students[] stack;
	private int top;
	
	public ArrayStack(int capasity) {
		stack = new Students[capasity];	
	}
	
	public void push(Students students) {
		if(top == stack.length) {
			Students[] newArray = new Students[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top++] = students;
	}
	
	public Students pop() {
		if(isEmpty())
			throw new EmptyStackException();
		
		Students students = stack[--top];
		stack[top] = null;
		return students;		
	}
	
	public Students peek() {
		if(isEmpty())
			throw new EmptyStackException();
		
		return stack[top-1];		
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void printStack() {
		for(int i = top-1; i >= 0; i--) {
			System.out.println(" " + stack[i] + " ");
		}
	}
	
}
