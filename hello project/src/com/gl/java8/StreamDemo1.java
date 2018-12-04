package com.gl.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Hi");

		Stream<String> sequentialStream = set.stream();
		sequentialStream.forEach(System.out::println);
		Stream<String> parallelStream = set.stream();
		parallelStream.forEach(System.out::println);
	}
}