package com.company.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("zambia");
		set.add("azerbaijan");
		set.add("brunei");
		set.add("mozambik");
		set.add("tunisia");
		set.add("india");
		set.add("pak");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}
}
