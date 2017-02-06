package hw_review;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		kb.nextLine();// consuming the extra enter key in buffer
		System.out.println("Enter a String: ");
		String str = kb.nextLine();
		
		System.out.println(str + ":\t" + number);
	}

}
