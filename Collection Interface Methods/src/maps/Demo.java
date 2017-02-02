package maps;

import java.util.Map;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		Map<String, Integer> scores = new TreeMap<>();
		scores.put("Harry", 90);
		scores.put("Sally", 95);
		scores.put("Sally", 100);
		int n = scores.get("Sally");
		Integer integer1 = scores.get("Diana"); // returns null
		System.out.println(scores);
		
		for(String key : scores.keySet()) {
			Integer value = scores.get(key);
		}
		
		scores.remove("Sally");
	}

}
