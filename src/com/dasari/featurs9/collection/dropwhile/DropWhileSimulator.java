package com.dasari.featurs9.collection.dropwhile;

import java.util.Arrays;
import java.util.List;

public class DropWhileSimulator {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 6, 53, 534, 83, 43);
		dropWhile(numbers);
	}

	private static void dropWhile(List<Integer> numbers) {
		numbers.stream().dropWhile(num->num<53).forEach(System.out::println);
	}
}
