package p2;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country>{

	@Override
	public int compare(Country o1, Country o2) {
//		return o1.getName().compareTo(o2.getName());
		return Double.compare(o1.getArea(), o2.getArea());
	}

}
