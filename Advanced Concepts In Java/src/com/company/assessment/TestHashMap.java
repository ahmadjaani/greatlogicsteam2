package com.company.assessment;

public class TestHashMap {
	public static void main(String[] args) {
		Student student = new Student();
		student.setNames();
		/*student.printNames();
		student.printNamesKeySet();
		student.printSize();*/
		student.getName("22");
		student.remove("22");
	}
}
