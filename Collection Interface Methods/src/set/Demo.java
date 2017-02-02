package set;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set<String> names;
		names = new HashSet<>();
		names.add("Romeo");
		if(names.contains("Freddy")) {
			System.out.println("There is Freddy");
		}
		
		System.out.println(names);
		
		for(String n : names) {
			System.out.println(n);
		}
		
		names.remove("Romeo");
	}

}
