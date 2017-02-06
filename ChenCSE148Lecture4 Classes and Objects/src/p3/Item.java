package p3;

public class Item {
	String description;
	int quantity;
	double subtotal;

	public Item(String description, int quantity, double subtotal) {
		super();
		this.description = description;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return description + "," + quantity + "," + subtotal;
	}

}
