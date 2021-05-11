package com.dasari.arrays.matrix;

import java.util.Scanner;

public class MatrixSimullator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plese enter number of rows");
		int row = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Plese enter number of columns");
		int col = scanner2.nextInt();

		int matrix[][] = new int[row][col];
		System.out.println("Plese enter number of rows");
		Scanner scanner3 = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = scanner3.nextInt();
			}
		}
		System.out.println("Displaying matrix\n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
