package com.company.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("great logics");
		set.add("amazon.in");
		set.add("great coders");
		set.add(new StringBuffer("amazon.in"));
		set.add(new Customer());
		set.add(null);
		set.add(null);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
	}
}