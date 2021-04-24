package com.dasari.arrays.multiDimensional.clone;

public class MultiDimensionalCloneSimulator {
	public static void main(String[] args) {
		int multiArray[][] = { { 1, 2 }, { 3, 4 } };

		int cloneArray[][] = multiArray.clone();
		System.out.println(multiArray == cloneArray);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(cloneArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
