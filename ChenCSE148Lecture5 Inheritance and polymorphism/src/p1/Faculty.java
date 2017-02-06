package p1;

public class Faculty extends Person {
	private double salary;

	public Faculty(String name, String id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [" + super.toString() + ", salary=" + salary + "]";
	}

}
