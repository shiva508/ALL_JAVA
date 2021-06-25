package com.dasari.interview.reverseofnumber;

public class ReverseOfAnumberClient {
	public static void main(String[] args) {
		whileLoopReverseOfNumber();
	}

	private static void whileLoopReverseOfNumber() {
		int inputNumber = 12345;
		int reverseOfNumber = 0;
		while (inputNumber != 0) {
			int remainder = inputNumber % 10;
			reverseOfNumber = reverseOfNumber * 10 + remainder;
			inputNumber = inputNumber / 10;
		}
		System.out.println(reverseOfNumber);

	}

}
