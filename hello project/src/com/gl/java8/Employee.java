package com.gl.java8;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Employee {
	public static enum Gender {
		MALE, FEMALE
	}

	private long id;
	private String name;
	private Gender gender;
	private LocalDate dob;
	private double income;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", income=" + income
				+ "]";
	}

	public Employee(long id, String name, Gender gender, LocalDate dob, double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.income = income;
	}

	public static List<Employee> persons() {
		Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(2014, Month.FEBRUARY, 1), 2345.0);
		Employee p2 = new Employee(2, "James", Gender.MALE, LocalDate.of(2016, Month.JANUARY, 3), 2346.0);
		Employee p3 = new Employee(3, "Doner", Gender.MALE, LocalDate.of(2017, Month.MARCH, 5), 2347.0);
		Employee p4 = new Employee(4, "Rameez", Gender.MALE, LocalDate.of(2018, Month.APRIL, 6), 2348.0);
		Employee p5 = new Employee(5, "sultan", Gender.MALE, LocalDate.of(2019, Month.DECEMBER, 7), 2349.0);
		List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5);
		return persons;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}
