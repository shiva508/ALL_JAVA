package com.dasari.util.Arrays.copyOf;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		int intArray[] = { 10, 20, 15, 22, 35 };
		System.out.println("Before copy");
		System.out.println(Arrays.toString(intArray));
		System.out.println("After copy");
		System.out.println(	Arrays.toString(Arrays.copyOf(intArray, 8)));

	}

}
