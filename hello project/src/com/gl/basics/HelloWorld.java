package com.gl.basics;

import java.util.Scanner;

public class HelloWorld {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {// entry point

		Address address = new Address();
		System.out.println("Enter City");
		address.setCity(sc.next());
		System.out.println("Enter ZipCode");
		address.setZip(sc.next());

		Account account = new Account();
		System.out.println("Enter acc no");
		account.setAcno(sc.nextLong());
		System.out.println("Enter ifsc code");
		account.setIfsc(sc.next());

		Customer customer = new Customer();
		System.out.println("Enter ID");
		customer.setId(sc.nextInt());
		customer.setAccount(account);
		customer.setAddress(address);

		System.out.println(customer);
	}
}
