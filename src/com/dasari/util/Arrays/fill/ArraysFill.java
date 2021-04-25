package com.dasari.util.Arrays.fill;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		 int intKey = 408; 
		 Arrays.fill(intArr, intKey);
		 System.out.println(Arrays.toString(intArr));
	}
}
