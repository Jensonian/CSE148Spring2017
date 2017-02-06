package p1;

// by adding extends Person, the Student class (i.e.Subclass) gets 
	//everything that is not private from the super class (i.e. Person class)

public class Student extends Person {
	private double gpa;

	public Student(String name, String id, double gpa) {
		super(name, id);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + "]";
	}

	
	

}
