package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

// super class contains all the common fields and methods
public abstract class Person implements Serializable {
	// instance variables
	private String name;
	private String id;
	
	// static variable (aka class level variable)
	private static int idNumber = 1;

	public Person(String name) {
		super();
		this.name = name;
		
		File file = new File("id.txt");
		
			try {
				Scanner input = new Scanner(file);
				idNumber = input.nextInt();
			} catch (FileNotFoundException e1) {
			}
			
		
		this.id = String.valueOf(idNumber++);
		
		try {
			PrintWriter pw = new PrintWriter("id.txt");
			pw.write(idNumber + "");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int getIdNumber() {
		return idNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
