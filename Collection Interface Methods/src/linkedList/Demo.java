package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addLast("Harry");
		list.addFirst("Johnny");
		list.getFirst();
		list.getLast();
		String removed = list.removeFirst();
		ListIterator<String> iter = list.listIterator();
		String s = iter.next();
		iter.previous();
		iter.set("Julie");
		iter.hasNext();
		if(iter.hasPrevious()) {
			s = iter.previous();
		}
		
		iter.add("Cathy");
		iter.next();
		iter.remove();
		
	}

}
