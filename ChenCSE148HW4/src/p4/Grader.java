package p4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader {
	private String fileName;
	private Scanner in;
	private Student[] students;
	
	public Grader(String fileName) {
		this.fileName = fileName;
		int count = 0;
		openFile();
		while (in.hasNextLine()) {
			in.nextLine();
			count++;
		}
		students = new Student[count];
		in.close();
	}
	
	public void openFile() {
		File file = new File(fileName);
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void readFile() {
		int count = 0;
		openFile();
		while(in.hasNextLine()) {
			String[] tokens = in.nextLine().split("[ ;,]");
			int[] scores = new int[tokens.length - 2];
			for(int i = 2; i < tokens.length; i++) {
				scores[i-2] = Integer.parseInt(tokens[i]);
			}
			Student s = new Student(tokens[0], tokens[1], scores);
			students[count++] = s;
		}
		in.close();
	}
	
	public int getHighestScore4Exam(int n) {
		int highest = students[0].getScores()[n-1];
		for(int i = 1; i < students.length; i++) {
			if(highest < students[i].getScores()[n-1]){
				highest = students[i].getScores()[n-1];
			}
		}
		return highest;
	}
	
	public Student[] getStudents() {
		return students;
	}
	

}
