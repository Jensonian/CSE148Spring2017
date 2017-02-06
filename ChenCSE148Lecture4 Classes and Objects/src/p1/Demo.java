package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", "111","631-123-4567", 
				"1 Main Street", 4.0, true);
		s1.setName("David");
		System.out.println(s1.getGpa());
		s1.setAddress("2 Main Street");
		
		System.out.println(s1.toString());
		Student s2 = new Student();
		System.out.println(s2);
		Student s3 = new Student("Jane", "222");
		System.out.println(s3);
		
		s2.setName("Julie");
		System.out.println("S2's name is now: " + s2.getName());
	}

}
