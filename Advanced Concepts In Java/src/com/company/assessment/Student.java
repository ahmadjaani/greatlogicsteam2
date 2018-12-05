package com.company.assessment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {
	private HashMap<String, String> stuNames;
	private Scanner scanner = new Scanner(System.in);

	public void setNames() {
		// fill code here
		stuNames = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Student ID and Name : " + (i + 1) + " Student");
			stuNames.put(scanner.next(), scanner.next());
		}
	}

	public void printNames() {
		// fill code here
		Collection<String> names = stuNames.values();
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

	public void getName(String key) {
		System.out.println(stuNames.get(key));
	}

	public void printNamesKeySet() {
		Set<String> setOfKeys = stuNames.keySet();
		Iterator<String> itr = setOfKeys.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

	public void remove(String key) {
		System.out.println(stuNames.remove(key));
	}

	public void printSize() {
		System.out.println(stuNames.size());
	}
}