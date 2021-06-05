package com.dasari.fundamentals.SWITCH;

public class SwitchClient {
	public static void main(String[] args) {
		switchConstantExpression();
		switchCaseLableConstants();
	}

	private static void switchCaseLableConstants() {
		int LOW = 10;
		switch (LOW + 1) {
		case 10:
			System.out.println("10");
			break;
		case 10 + 1:
			System.out.println("10+1");
			break;
		case 10 + 10:
			System.out.println("10+10");
			break;
		}
	}

	private static void switchConstantExpression() {
		int LOW = 408;
		// int HIGH = 508;
		final int HIGH = 508;
		switch (LOW) {
		case 101:
			System.out.println("101");
			break;
		case HIGH:
			System.out.println("HIGH");
			break;
		}
	}
}
