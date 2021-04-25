package com.dasari.featurs8.stream.manipulation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingCollectionToSingleValue {
	public static void main(String[] args) {
		List<String> studentsNames = Arrays.asList("Ravi", "Satish", "Kavya", "Mounika", "Rajeswari", "Gopi", "Shiva");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("++++++++++++++++++++++++++");
		Integer totalLength = studentsNames.stream().mapToInt(String::length).sum();
		System.out.println("Total number of characters in all names: " + totalLength);
		System.out.println("++++++++++++++++++++++++++");
		final Optional<String> maxlengtghName = studentsNames.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		maxlengtghName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
		System.out.println("++++++++++++++++++++++++++");
		// add extra parameter
		final String babuOrLonger = studentsNames.stream().reduce("Shiva",
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		System.out.println(babuOrLonger);
		System.out.println("++++++++++++++++++++++++++");
		Optional<Integer> maxNumber = numbers.stream().reduce((num1, num2) -> num1 >= num2 ? num1 : num2);
		System.out.println(numbers.stream().reduce((num1, num2) -> num1 >= num2 ? num1 : num2));

	}
}
