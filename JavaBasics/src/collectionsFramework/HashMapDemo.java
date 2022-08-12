package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> td = new HashMap<String,Integer>();
		
		//store the items in the HashMap
		td.put("Tim", 123456);
		td.put("Sam", 234567);
		td.put("George", 345678);
		td.put("Brad", 456789);
		td.put("Paul", 567890);
		
		//retrieve the items from HashMap
		for (Map.Entry m: td.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		
	}

}
