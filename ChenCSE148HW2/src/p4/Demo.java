package p4;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John", 3.1);
//		s.Name = "Jane";
//		s.gpa = 4.5;
		s.setGpa(4.0);
		s.setName("Jane");
		System.out.println(s);
		System.out.println(s.curveGpa(0.2));
		System.out.printf("%-10s\t%4.2f", s.getName(), s.getGpa());
	}

}
