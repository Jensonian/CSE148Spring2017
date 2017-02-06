package hw_review;

import java.util.Scanner;

/*
 * 1. Variable scope or visibility: in blocks
 * visibility is in the block of code defined by curly braces
 */
public class Demo {
	static double subtotal = 0;
	static String dash = "-----------------------";
	static Scanner kb = new Scanner(System.in);
	static String[] items = new String[5];
	static int[] quantities = new int[5];
	static double[] subsubtotal = new double[5];
	static final double COFFEE_PRICE = 1.75;
	static final double TEA_PRICE = 1.25;
	static final double MILK_PRICE = 1.75;
	static final double WATER_PRICE = 1.75;
	static final double OJ_PRICE = 1.75;

	public static void main(String[] args) {
//		getMenu();
		getOrder();
		getReceipt();

	}

	public static void getMenu() {
		System.out.println("\n\nHere is your menu!\n");
	}

	public static void getOrder() {
		do {
			getMenu();
			System.out.println("Enter your item:");
			String order = kb.nextLine();
			
			if (order.equals("0")) {
				break;
			}

			System.out.println("Enter your quantity: ");
			int quantity = kb.nextInt();
			
			kb.nextLine(); // consume the extra enter key
			if (order.equals("1")) {
				subtotal += (COFFEE_PRICE * quantity);
				items[0] = "Coffee";
				quantities[0] = quantity;
				subsubtotal[0] = quantity * COFFEE_PRICE;
				System.out.println("Coffee,\tsubtotal is: " + subtotal);
			} else if (order.equals("2")) {
				subtotal += (TEA_PRICE * quantity); 
				items[1] = "Tea";
				quantities[1] = quantity;
				subsubtotal[1] = quantity * TEA_PRICE;
				System.out.println("Tea,\tsubtotal is: " + subtotal);
			} else if (order.equals("3")) {
				subtotal += (1.25 * quantity);
				items[2] = "Milk";
				quantities[2] = quantity;
				subsubtotal[2] = quantity * MILK_PRICE;
				System.out.println("Milk, \tsubtotal is: " + subtotal);
			} else if (order.equals("4")) {
				subtotal += (0.75 * quantity);
				items[3] = "Water";
				quantities[3] = quantity;
				subsubtotal[3] = quantity * WATER_PRICE;
				System.out.println("Water, \tsubtotal is: " + subtotal);
			} else if (order.equals("5")) {
				subtotal += (2.75 * quantity);
				items[4] = "O.J.";
				quantities[4] = quantity;
				subsubtotal[4] = quantity * OJ_PRICE;
				System.out.println("O. J., \tsubtotal is: " + subtotal);
			} else {
				System.out.println("Enter a valid item.");
			}
		} while (true);
	}

	public static void getReceipt() {
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i] + "\t" + quantities[i] + "\t" + subsubtotal[i]);
			}
			
		}
		
		System.out.printf("The subtotal is: %5.2f", subtotal);
	}
}
