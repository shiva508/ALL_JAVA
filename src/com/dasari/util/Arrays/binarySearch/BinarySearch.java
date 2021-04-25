package com.dasari.util.Arrays.binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int intArray[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArray);
		int intKey=22;
		System.out.println(intKey + " found at index = "+ Arrays.binarySearch(intArray, intKey));
		System.out.println(intKey + " found at index = "+ Arrays .binarySearch(intArray, 1, 3, intKey)); 
	}
}
