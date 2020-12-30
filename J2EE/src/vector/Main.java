package vector;

import java.util.List;
import java.util.Vector;


public class Main {

	public static void main(String[] args) {
		List<Students> studentList = new Vector<>();
		studentList.add(new Students("Souvik", "De Sarkar", 5683));
		studentList.add(new Students("Rohit", "Singh", 2953));
		studentList.add(new Students("Rituraj", "Banerjee", 5683));
		studentList.add(new Students("Arka", "Dey", 5683));
	}

}
