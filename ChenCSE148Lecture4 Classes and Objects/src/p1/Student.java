package p1;

public class Student { // class, a template, is used to create objects

	// fields, attributes, instance variables
	String name;
	String id;
	String phone;
	String address;
	double gpa;
	boolean gender;

	public Student(String name, String id, String phone, String address, double gpa, boolean gender) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
		this.gpa = gpa;
		this.gender = gender;
	}

	public Student() {
	}

	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
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

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phone=" + phone + ", address=" + address + ", gpa=" + gpa
				+ ", gender=" + gender + "]";
	}

}
