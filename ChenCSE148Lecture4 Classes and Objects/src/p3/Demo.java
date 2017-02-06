package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Item[] allItems = new Item[20];
		int nItem = 0;
		final double ITEM_PRICE = 1.75;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Enter item description: ");
			String itemDescription = kb.nextLine();
			if(itemDescription.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println("Enter item quantity: ");
			int quantity = kb.nextInt();
			kb.nextLine(); // to consume the enter key in the buffer
			double subtotal = ITEM_PRICE * quantity;
			allItems[nItem++] = new Item(itemDescription, quantity, subtotal);
			
		} while(true);
		
		String format = "%-10s%-10d$%5.2f\n\n";
		// display all items
		for(int i = 0; i < nItem; i++) {
			String rawString = allItems[i].toString();
			String[] tokens = rawString.split(",");
			String description = tokens[0];
			int quant = Integer.parseInt(tokens[1]);
			double subtotal = Double.parseDouble(tokens[2]);
			System.out.printf(format, description, quant, subtotal);
		}
		
	}

}
