package stacksArray;

public class Main {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Students(" Souvik ",  " De Sarkar ", 5683));
		stack.push(new Students(" Rohit  ",  " Singh ", 6720));
		stack.push(new Students(" Rituraj ",  " Banerjee ", 8134));
		stack.push(new Students(" Arka ",  " Dey ", 2975));
		stack.push(new Students(" Adrija ",  " Sanyal ", 1705));
		
		stack.printStack();
		System.out.println("Answer after performing PEEK operation");
		System.out.println(stack.peek());
		
		System.out.println("Popped   =>  " + stack.pop());
		System.out.println(stack.peek());
		

	}

}
