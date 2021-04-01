package com.dasari.featurs8.streams;

import java.util.Arrays;
import java.util.List;

public class AsListSimullator {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(23, 6, 53, 534, 83, 43);
		filterdata(numbers);
		limit(numbers);
		skip(numbers);
		
	}

	private static void skip(List<Integer> numbers) {
		numbers.stream().skip(2).forEach(System.out::println);
		System.out.println("======================================");
		
	}

	private static void limit(List<Integer> numbers) {
		numbers.stream().limit(2).forEach(System.out::println);
		System.out.println("======================================");
		
	}

	private static void filterdata(List<Integer> numbers) {
		numbers.stream().filter(num -> num > 53).forEach(System.out::println);
		System.out.println("======================================");

	}

}
