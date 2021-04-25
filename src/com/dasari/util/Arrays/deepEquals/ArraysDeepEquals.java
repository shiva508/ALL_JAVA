package com.dasari.util.Arrays.deepEquals;

import java.util.Arrays;

public class ArraysDeepEquals {

	public static void main(String[] args) {
		int intArray[][] = {{ 10, 20, 15, 22, 35 }};
		int intArray1[][] = {{ 10, 20, 15, 22, 35 ,1}};
		System.out.println(Arrays.deepEquals(intArray, intArray1));
	}
}
