package Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Java_Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang");
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":"+value);
		}
	}
}
