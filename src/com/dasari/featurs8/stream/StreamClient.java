package com.dasari.featurs8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClient {
	public static void main(String[] args) {

		List<String> stringList=Arrays.asList("508","504","501");
		Stream<String> stream=stringList.stream();
		stream.forEach(System.out::println);
		System.out.println("===============================");
		int intArray[]= {408,423};
		
		List<Integer> arrayToList=Arrays.stream(intArray).boxed().collect(Collectors.toList());
	}
}
