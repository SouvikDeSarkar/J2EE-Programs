package singleLinkedList;

public class Main {
	
	public static void main(String[]args) {
	Student sds = new Student("Souvik",  "De Sarkar", 5683);
	Student rs = new Student("Rohit",  "Singh", 2953);
	Student rb = new Student("Rituraj",  "Banerjee", 9510);
	Student ad = new Student("Arka",  "Dey", 3478);
	
	StudentLinkedList list = new StudentLinkedList();
	
	System.out.println(list.isEmpty());
	
	list.addToFront(sds);
	list.addToFront(rs);
	list.addToFront(rb);
	list.addToFront(ad);
	
	System.out.println(list.getSize());
	
	list.printList();
	
	list.removeFromFront();
	System.out.println(list.getSize());
	list.printList();
	
	}

}
