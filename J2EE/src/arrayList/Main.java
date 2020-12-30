package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		For creating array list
		List<Students> studentList = new ArrayList<>(); 
//		for adding elements into the array list
		studentList.add(new Students("Souvik", "De Sarkar", 5683));
		studentList.add(new Students("Rohit", "Singh", 2953));
		studentList.add(new Students("Rituraj", "Banerjee", 5683));
		studentList.add(new Students("Arka", "Dey", 5683));
		
//		For selecting and printing all the elements in the studentList
//		studentList.forEach(Students -> System.out.println(Students));
		
//		For printing specific element in an array list
//		System.out.println(studentList.get(2));
		
//		For checking if array list is empty
//		System.out.println(studentList.isEmpty());
		
//		For changing specific element details
//		studentList.set(2, new Students("Shreya",  "Mandol", 9156));
		
//		For adding elements in specific position the rest will be shifted to next position
//		studentList.add(2, new Students("Shreya",  "Mandol", 9156));
		
//		For showing the current size, not the total size
//		System.out.println(studentList.size());
		
//		For converting array list to array
//		Students[] studentListArray = new Students[studentList.size()];
//		studentList.toArray(studentListArray);
//		for(Students students: studentListArray) {
//			System.out.println(students);
//		}
//		OR
//		Students[] studentListArray = studentList.toArray(new Students[studentList.size()]);
//		for(Students students: studentListArray) {
//			System.out.println(students);
//		}
		
//		For checking if a particuar element is present in the array list
//		System.out.println(studentList.contains(new Students("Rohit", "Singh", 2953)));
		
//		For finding out particular element's index
//		System.out.println(studentList.indexOf(new Students("Rohit", "Singh", 2953)));		
		
//		For removing an element in the array list
//		studentList.remove(3);
//		studentList.forEach(Students -> System.out.println(Students));
		
	}

}
