package singleLinkedList;

public class StudentLinkedList {
	private StudentNode head;
	private int size;
	
	public void addToFront(Student student) {
		StudentNode node = new StudentNode(student);
		node.setNext(head);
		head = node;
		size++;
	}
	public StudentNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		StudentNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		StudentNode current = head;
		System.out.print("Head  ->  ");
		while(current != null) {
			System.out.print(current);
			System.out.println(" -> ");
			current = current.getNext();
		}
		System.out.println("NULL");
	}

}
