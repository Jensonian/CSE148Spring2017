package p4;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args)  {
//		Grader grader = new Grader("scores.txt");
//		grader.readFile();
//		System.out.println(grader.getHighestScore4Exam(3));
//		Student[] students = grader.getStudents();
//		for (int j = 0; j < students.length; j++) {
//			System.out.println("\n" + students[j].getlName() + ":");
//			System.out.println(students[j].getAverage());
//			System.out.println(students[j].getHighest());
//			System.out.println(students[j].getLowest());
//		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		System.out.println();
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		
	}

}