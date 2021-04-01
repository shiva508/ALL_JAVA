package com.dasari.featurs9.collection.takewhile;

import java.util.Arrays;
import java.util.List;

public class TakeWhileSimulator {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 6, 53, 534, 83, 43);
		takeWhile(numbers);
	}

	private static void takeWhile(List<Integer> numbers) {
		numbers.stream().takeWhile(num->num<53).forEach(System.out::println);
		System.out.println("======================================");
		
	}
}
