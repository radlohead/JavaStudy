package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("minho", 36);
		m1.put("hacosa", 10);
		System.out.println(m1.get("minho"));
		
		iteratorUsingForEach(m1);
		iteratorUsingIterator(m1);
	}
	
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
