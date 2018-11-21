package com.gl.basics;

public class Address {
	private String zip;
	private String city;

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [zip=" + zip + ", city=" + city + "]";
	}
}
