package com.dasari.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3 };
		Arrays.asList(intArray);
		List<Integer> asList = Arrays.asList(new Integer(1), new Integer(2), new Integer(3));
		asList.forEach(System.out::println);
	}

}
