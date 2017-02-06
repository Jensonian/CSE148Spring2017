package p2;

public class Building {
	int numOfRoom;
	String address;
	boolean hasElevator;

	public Building(int numOfRoom, String address, boolean hasElevator) {
		super();
		this.numOfRoom = numOfRoom;
		this.address = address;
		this.hasElevator = hasElevator;
	}

	public Building() {
		super();
	}

	public Building(int numOfRoom, String address) {
		super();
		this.numOfRoom = numOfRoom;
		this.address = address;
	}

	public int getNumOfRoom() {
		return numOfRoom;
	}

	public void setNumOfRoom(int numOfRoom) {
		this.numOfRoom = numOfRoom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isHasElevator() {
		return hasElevator;
	}

	public void setHasElevator(boolean hasElevator) {
		this.hasElevator = hasElevator;
	}

	@Override
	public String toString() {
		return "Building [numOfRoom=" + numOfRoom + ", address=" + address + ", hasElevator=" + hasElevator + "]";
	}

}
