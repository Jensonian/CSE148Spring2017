package comparables;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		BankAccount ba1 = new BankAccount(1, 100);
		BankAccount ba2 = new BankAccount(2, 130);
		BankAccount ba3 = new BankAccount(4, 10);
		BankAccount ba4 = new BankAccount(3, 50);
		
		BankAccount[] accounts = new BankAccount[4];
		accounts[0] = ba1;
		accounts[1] = ba2;
		accounts[2] = ba3;
		accounts[3] = ba4;
		
		Arrays.sort(accounts);
		
		System.out.println(Arrays.toString(accounts));
		
	}

}
