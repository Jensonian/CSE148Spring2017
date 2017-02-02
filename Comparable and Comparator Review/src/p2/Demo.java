package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		Country c1 = new Country("Dgentina", 5000);
		Country c2 = new Country("Arazil", 4000);
		Country c3 = new Country("China", 60000);
		CountryComparator countryComp = new CountryComparator();
		Country[] array = new Country[3];
		array[0] = c1;
		array[1] = c3;
		array[2] = c2;
		ArrayList<Country> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		Arrays.sort(array, countryComp);
		Collections.sort(list, countryComp);
		
		System.out.println(Arrays.toString(array));
		System.out.println(list);
	}

}
