package com.dasari.arrays;

public class ArraysExample {

	public static void main(String[] args) {
		initilization();
		aliasingIssue();
		twoDaimentenalArray();
		int a=3&5;
		int b=3|5;
		System.out.println(a);
		System.out.println(b);
	}

	private static void twoDaimentenalArray() {
		int arrayLength=3;
		int twoDimentenal[][];
		twoDimentenal=new int[arrayLength][arrayLength];
		
	}

	private static void aliasingIssue() {
		// declare the array name & type
		int arrayLength = 8;
		int marks[];
		// Create the array
		marks = new int[arrayLength];
		// Short form
		int marks1[] = new int[arrayLength];
		// Lazy initialization
		int marks2[] = { 1, 2, 4 };
		marks1 = marks2;
		marks1[1] = 408;
		System.out.println(marks2[1]);
	}

	public static void initilization() {
		int arrayLength = 8;
		int marks[];
		// Create the array
		marks = new int[arrayLength];
		// Short form
		int marks1[] = new int[arrayLength];
		// Lazy initialization
		int marks2[] = { 1, 2, 4 };
	}
}
