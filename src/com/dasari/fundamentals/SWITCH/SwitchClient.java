package com.dasari.fundamentals.SWITCH;

public class SwitchClient {
	public static void main(String[] args) {
		switchConstantExpression();
	}

	private static void switchConstantExpression() {
		int LOW = 408;
		//int HIGH = 508;
		final int  HIGH = 508;
		switch (LOW) {
		case 101: 
			System.out.println("101");
		case HIGH:
			System.out.println("HIGH");
		default:
			throw new IllegalArgumentException("Unexpected value: " + LOW);
		}
	}
}
