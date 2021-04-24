package com.dasari.arrays.singledimentional.clone;

public class CloningOfArrays {
	public static void main(String[] args) {
		int intArray[] = { 1, 3, 4 };
		int cloneAyyay[] = intArray.clone();
		System.out.println(cloneAyyay == intArray);
		for (int i = 0; i < cloneAyyay.length; i++) {
			System.out.print(cloneAyyay[i]);
		}
	}
}
