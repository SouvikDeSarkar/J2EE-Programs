package doublyLinkedList;


public class Main {

	public static void main(String[] args) {
		Student sds = new Student("Souvik",  "De Sarkar", 5683);
		Student rs = new Student("Rohit",  "Singh", 2953);
		Student rb = new Student("Rituraj",  "Banerjee", 9510);
		Student ad = new Student("Arka",  "Dey", 3478);
		
		StudentDoublyLinkedList list = new StudentDoublyLinkedList();
		
		list.addToFront(sds);
		list.addToFront(rs);
		list.addToFront(rb);
		list.addToFront(ad);
		list.printList();
		System.out.println(list.getSize());
		
		Student adend = new Student("Adrija", "End", 3490);
		list.addToEnd(adend);
		list.printList();
		System.out.println(list.getSize());
		
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		
		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());
		

	}

}
