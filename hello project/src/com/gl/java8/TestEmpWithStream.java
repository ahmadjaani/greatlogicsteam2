package com.gl.java8;

public class TestEmpWithStream {
	public static void main(String[] args) {
		double totalIncome = Employee.persons().stream().mapToDouble(Employee::getIncome).sum();
		System.out.println(totalIncome);
	}
}
