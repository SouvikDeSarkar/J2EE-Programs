package stackLinkedList;

public class Main {
	public static void main(String[] args) {
		Students sds = new Students("Souvik",  "De Sarkar", 5683);
		Students rs = new Students("Rohit",  "Singh", 2953);
		Students rb = new Students("Rituraj",  "Banerjee", 9510);
		Students ad = new Students("Arka",  "Dey", 3478);
		
		LinkedStack stack = new LinkedStack();
		stack.push(sds);
		stack.push(rs);
		stack.push(rb);
		stack.push(ad);
		
		stack.printStack();
		
		
		System.out.println("Answer after performing PEEK operation");
		System.out.println(stack.peek());
		
		System.out.println("Popped   =>  " + stack.pop());
		System.out.println(stack.peek());
		

	}

}
