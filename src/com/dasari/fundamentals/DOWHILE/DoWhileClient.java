package com.dasari.fundamentals.DOWHILE;

public class DoWhileClient {
	public static void main(String[] args) {
		doWhileStatement();
	}

	private static void doWhileStatement() {
		int COUNTER = 0;
		do {
			COUNTER++;
			System.out.println("COUNTER:" + COUNTER);
		} while (COUNTER < 10);
	}
}
