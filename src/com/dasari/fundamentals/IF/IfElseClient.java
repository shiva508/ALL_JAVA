package com.dasari.fundamentals.IF;

public class IfElseClient {
	public static void main(String[] args) {
		withNumberComparision();
		withBooleanComparision();
		withBooleanEqualsComparision();
		withDeclarative();
		withDeclarativeWithBraces();
	}

	private static void withDeclarativeWithBraces() {
		if (true) {
			int x = 508;
		}

	}

	private static void withDeclarative() {
		if (true)
			System.out.println(" I AM NOT DECLARATVE");
		//

	}

	private static void withBooleanEqualsComparision() {
		Boolean IS_TRUE = true;
		if (IS_TRUE == false) {
			System.out.println("IF");
		} else {
			System.out.println("ELSE");
		}

	}

	private static void withBooleanComparision() {
		Boolean IS_TRUE = false;
		if (IS_TRUE = true) {
			System.out.println("IF");
		} else {
			System.out.println("ELSE");
		}

	}

	private static void withNumberComparision() {
		int ROLL_NUM = 408;
		if (ROLL_NUM == 20) {
			System.out.println("IF");
		} else {
			System.out.println("ELSE");
		}

	}
}
