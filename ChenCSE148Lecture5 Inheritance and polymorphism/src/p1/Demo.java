package p1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("John", "111");
//		System.out.println(p1);
//		System.out.println("------------");
//		Student s1 = new Student("David", "222", 3.5);
//		s1.setName("Jane");
//		System.out.println(s1.getName());
//		System.out.println(s1);
//		
//		Faculty f1 = new Faculty("Alex", "333", 300000);
//		f1.setName("Julie");
////		f1.setId("444");
//		System.out.println(f1);
		// polymorphism: same variable type references different object type of subclasses
//		Person p1 = new Person("Adam", "111");
		Person s1 = new Student("Billy", 3.5);
		System.out.println(s1.getIdNumber()); // --> 2
		Person f1 = new Faculty("Cathy", 40000);
		System.out.println(s1.getIdNumber()); // --> 3
		System.out.println(f1.getIdNumber()); // --> 3
		
		
		Person s2 = new Student("Billy", 3.5);
		Person f2 = new Faculty("Cathy", 40000);
		
		ArrayList<Person> myList = new ArrayList<>();
		myList.add(s1);
		myList.add(s2);
		myList.add(f2);
		myList.add(f1);
		try {
			FileOutputStream fos = new FileOutputStream("data.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(myList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(s1.getIdNumber()); //--> 5
//		System.out.println(s1);
//		System.out.println(f1);
//		System.out.println(s2);
//		System.out.println(f2);
//		Person[] pArray = new Person[5];
////		pArray[0] = p1;
//		pArray[1] = s1;
//		pArray[2] = f1;
//		
////		System.out.println(p1 instanceof Student);
//		System.out.println(s1 instanceof Student);
//		System.out.println(f1 instanceof Student);
//		
		
 	}

}
