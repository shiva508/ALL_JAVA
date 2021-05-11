package com.dasari.arrays.findingMissingNumber;

public class FindingMissingSingleNumber {

	public static void main(String[] args) {
		int intArray[] = { 1,2,3,5,6,7};
		int total=totalOfArrayElements(intArray);
		// 7 is max number from an array
		int maxNumber=processMaxNumberOfArray(intArray);
		int sumOfTotal=processSumofNumbers(maxNumber);
		int difference=sumOfTotal-total;
		System.out.println("Missing Number:"+difference);
		int missingNumber=getMissingNumberInArray(intArray,intArray.length);
		System.out.println("Missing Number:"+missingNumber);

	}
	private static int processMaxNumberOfArray(int[] intArray) {
		int MAX=0;
		for (int i = 0; i < intArray.length; i++) {
			if(MAX<intArray[i]) {
				MAX=intArray[i];
			}
		}
		return MAX;
	}
	private static int getMissingNumberInArray(int[] intArray, int i) {
		int X1=intArray[0];
		//1) XOR all the array elements, let the result of XOR be X1.
		int X2=1;
		//2) XOR all numbers from 1 to n, let XOR be X2.
		//3) XOR of X1 and X2 gives the missing number.
		for (int j = 1; j < i; j++) {
			X1=X1^intArray[j];
		}
		for (int j = 2; j<=i+1; j++) {
			X2=X2^j;
		}
		return (X1^X2);
	}
	private static int processSumofNumbers(int length) {
		int sumOfTotal=(length*(length+1))/2;
		return sumOfTotal;
	}

	private static int totalOfArrayElements(int[] intArray) {
		int total = 0;
		for (int i = 0; i < intArray.length; i++) {
			total = total + intArray[i];
		}
		return total;
	}
}
