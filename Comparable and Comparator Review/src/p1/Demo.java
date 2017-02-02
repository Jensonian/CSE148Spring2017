package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(1, 300);
		BankAccount ba2 = new BankAccount(2, 200);
		BankAccount[] array = new BankAccount[2];
		array[0] = ba1;
		array[1] = ba2;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(ba2);
		list.add(ba1);
		Collections.sort(list);
		System.out.println(list);
	}

}
