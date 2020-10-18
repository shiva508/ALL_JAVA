package com.dasari.interview;

public class FindMaxValue {

	public static void main(String[] args) {
		int [] inputs= {2,30,93,47,5};
	 int maximumValue=findMaxValue(inputs);
	 System.out.println(maximumValue);

	}

	public static int findMaxValue(int[] inputs) {
		int maxValue=0;
		for (int input : inputs) {
			if(maxValue<input) {
				maxValue=input;
			}
		}
		return maxValue;
	}

}
