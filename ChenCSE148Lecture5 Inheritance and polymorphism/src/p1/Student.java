package p1;

import java.io.Serializable;
import java.util.Scanner;

// by adding extends Person, the Student class (i.e.Subclass) gets 
	//everything that is not private from the super class (i.e. Person class)

public class Student extends Person implements Serializable{
	private double gpa;
	private transient Scanner kb = new Scanner(System.in);

	public Student(String name, double gpa) {
		super(name);
		this.gpa = checkGPA(gpa); // this means this object
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = checkGPA(gpa);
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + "]";
	}

	private double checkGPA(double gpa){
		Scanner kb = new Scanner(System.in);
		if(gpa > 4.0 || gpa < 0.0) {
			do {
				System.out.println("Invalid GPA, enter a new one: ");
				gpa = kb.nextDouble();
				if(gpa >= 0.0 && gpa <= 4.0){
					return gpa;
				}
			} while (true);
		} else {
			return gpa;
		}
	}

}
