package com.company.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo2 {
	public static void main(String[] args) {
		List<Customer> list = new LinkedList<>();

		Customer c1 = new Customer();
		c1.setId(1122);
		c1.setName("ramana");

		Customer c2 = new Customer();
		c2.setId(2233);
		c2.setName("samba");

		list.add(c1);
		list.add(c2);

		List<Customer> list2 = new LinkedList<>();

		Customer c3 = new Customer();
		c3.setId(4455);
		c3.setName("murali");

		Customer c4 = new Customer();
		c4.setId(4466);
		c4.setName("surya");

		list2.add(c3);
		list2.add(c4);

		// Adding one collection inside another collection

		list.addAll(list2);

//		list.remove(c4);

		list.removeAll(list2);

		Iterator<Customer> itr = list.iterator();
		while (itr.hasNext()) {
			Customer customer = (Customer) itr.next();
			/*
			 * if (customer.getName().equals("samba")) itr.remove();
			 */
			System.out.println(customer);
		}

//		System.out.println("After removal " + list);
	}
}