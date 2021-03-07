package com.dasari.book.insertionsort;

public class InsertionSortSimulator {
	public static void main(String[] args) {
		int inputArray[] = { 4, 10, 7, 90, 8 };
		processInsertionSort(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

	private static void processInsertionSort(int[] inputArray) {
		Integer maxLength = inputArray.length;
		for (int i = 1; i < maxLength; i++) {
			int value = inputArray[i];
			System.out.println("value:"+value);
			int hole = i;
			System.out.println("hole:"+hole);
			System.out.println(hole+">"+0+"&&"+value+"<"+inputArray[hole-1]);
			while (hole > 0 && (value < inputArray[hole-1])) {
				inputArray[hole] = inputArray[hole-1];
				System.out.println(inputArray[hole] +"="+ inputArray[hole-1]);
				hole = hole - 1;
				System.out.println(hole+"="+(hole - 1));
			}
			inputArray[hole]=value;
		}
	}
}
