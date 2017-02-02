package interface_Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Collection<String> coll1 = new ArrayList<>();
		Collection<String> coll2 = new TreeSet<>();
		int n = coll1.size();
		coll1.add("Adam");
		coll2.add("Billy");
		String s = coll1.toString();
		System.out.println(coll2);
		coll1.remove("Adam");
		boolean b = coll2.remove("Billy");
		boolean a = coll1.contains("Adam");
		
		for(String str : coll1) {
			System.out.println(str);
		}
		
		Iterator<String> iter = coll1.iterator();
		
	}

}
