package p2;

public class Demo {

	public static void main(String[] args) {
		Building b1 = new Building();
		System.out.println(b1);
		Building b2 = new Building(50, "Ammerman Campus", true);
		b2.setNumOfRoom(100);
		System.out.println(b2);
		System.out.println(b2.getAddress());
		Building b3 = new Building(50, "Ammerman Campus");
		System.out.println(b3);
	}

}
