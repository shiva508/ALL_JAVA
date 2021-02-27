package com.dasari.algoritham.arrays;

import java.util.Random;

public class ArrayStructures {

	private int[] numArray = new int[50];
	private int arraySize = 10;

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			numArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printArray() {
		for (int i = 0; i < arraySize; i++) {
			System.out.println("----------");
			System.out.print("| " + i + " | ");
			System.out.println(numArray[i] + " | ");
		}
	}

	public boolean isVlaueAvailableInArray(int value) {
		boolean isValueAvailable = false;
		for (int i = 0; i < arraySize; i++) {
			if (numArray[i] == value) {
				System.out.println("" + numArray[i]);
				isValueAvailable = true;
				break;

			}
		}
		return isValueAvailable;
	}

	public void deleteArrayValue(int index) {
		for(int i=index;i<(index-1);i++) {
			numArray[i]=numArray[i+1];
		}
		arraySize--;
	}

	public int getArrayvalueByIndex(int index) {
		if (arraySize > index) {
			return numArray[index];
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		ArrayStructures arrayStructures = new ArrayStructures();
		arrayStructures.generateRandomArray();
		arrayStructures.printArray();
		System.out.println(arrayStructures.getArrayvalueByIndex(4));
		System.out.println(arrayStructures.isVlaueAvailableInArray(50));
		System.out.println(arrayStructures.isVlaueAvailableInArray(15));
		arrayStructures.deleteArrayValue(1);
		arrayStructures.printArray();
		
	}
}
