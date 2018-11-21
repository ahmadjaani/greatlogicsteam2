package com.gl.basics;

public class Customer {
	private int id;
	private Address address;
	private Account account;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", address=" + address + ", account=" + account + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
