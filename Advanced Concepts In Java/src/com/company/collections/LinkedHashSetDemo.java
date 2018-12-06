package com.company.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("zimbabwe");
		set.add("west indies");
		set.add("new zealand");
		set.add("maldiev");
		set.add("brazil");

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
	}
}
