package com.company.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo4 {
	public static void main(String[] args) {
		Set<Customer> setOfCustomers = new HashSet<>();

		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();

		c1.setId(1122);
		c1.setName("ramana");
		c2.setId(1133);
		c2.setName("shyama");
		c3.setId(1144);
		c3.setName("bala");
		c4.setId(1155);
		c4.setName("paul");
		c5.setId(1166);
		c5.setName("maya");

		setOfCustomers.add(c5);
		setOfCustomers.add(c4);
		setOfCustomers.add(c3);
		setOfCustomers.add(c2);
		setOfCustomers.add(c1);

		/*
		 * List<Customer> al = new ArrayList<>(setOfCustomers); Collections.sort(al);
		 */

		TreeSet<Customer> ts = new TreeSet<>(new NameComparator());
		ts.addAll(setOfCustomers);

		Iterator<Customer> itr = ts.iterator();
		while (itr.hasNext()) {
			Customer customer = (Customer) itr.next();
			System.out.println(customer);
		}
	}
}