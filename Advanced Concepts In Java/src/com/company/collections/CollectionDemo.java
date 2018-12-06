package com.company.collections;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		List collection = new ArrayList(20);

		collection.add("great great");
		collection.add(123);
		collection.add(new String("wrogn"));
		collection.add(new StringBuilder("sine"));
		collection.add(null);

		System.out.println(collection.remove(null));

		/*
		 * Iterator itr = collection.iterator(); while (itr.hasNext()) { Object object =
		 * (Object) itr.next(); System.out.println(object); }
		 */
	}
}