package inbuiltLinkedList;

import java.util.LinkedList;

import doublyLinkedList.Student;

public class Main {

	public static void main(String[] args) {
		Student sds = new Student("Souvik",  "De Sarkar", 5683);
		Student rs = new Student("Rohit",  "Singh", 2953);
		Student rb = new Student("Rituraj",  "Banerjee", 9510);
		Student ad = new Student("Arka",  "Dey", 3478);
		
		LinkedList<Student> list = new LinkedList<>();
		list.addFirst(sds);
		list.addFirst(rs);
		list.addFirst(rb);
		list.addFirst(ad);
		
		for(Student student: list) {
			System.out.println(student);
		}
		

	}

}
