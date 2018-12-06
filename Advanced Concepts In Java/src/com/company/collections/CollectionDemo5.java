package com.company.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo5 {
	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<>();
		maps.put("radha", "ramana");
		maps.put("virat", "kohli");
		maps.put("india", "new delhi");
		maps.put("pakistan", "islamabad");
		maps.put(null, "crimea");

		Set<Entry<String, String>> entries = maps.entrySet();

		Iterator<Entry<String, String>> itr = entries.iterator();

		while (itr.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) itr
					.next();
			System.out.println(entry);
		}

	}
}