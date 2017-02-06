package p4;

public class Student {
	
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public void curve(double d) {
		gpa +=  d;
	}
	
	public double curveGpa(double d) {
		gpa += d;
		return gpa;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa > 4.0) {
			System.out.println("Stop, the gpa is not valid");
			return;
		}
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
