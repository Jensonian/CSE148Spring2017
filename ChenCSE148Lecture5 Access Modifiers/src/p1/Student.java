package p1;

/*Access modifiers: controls who have what access to fields and methods
 * public: everyone in the world has access to the fields or methods directly
 * private: only methods in the same class can have access to the fields or methods
 * default (no modifier), aka package access: all methods inside the same package can access
 * protected: any methods who are in the subclasses can have access
 * a private field without corresponding setter becomes immutable
 */

public class Student {

	private String name;
	private double gpa;
	
	public Student() {
	
	}
	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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
		this.gpa = gpa;
	}
	
	
}
