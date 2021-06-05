package com.dasari.fundamentals.WHILE;

public class WhileClient {
	public static void main(String[] args) {
		unReachableStateMent();
		unReachableStateMentWithNumber();
	}

	private static void unReachableStateMentWithNumber() {
		int a = 408, b = 508;
		// final int a = 408, b = 508; UN-REACHABLE ON ADDING FINAL
		while (a > b) {
			System.out.println("REACHABLE");
		}
	}

	private static void unReachableStateMent() {
		// while (false) {Un-Reachable statement
		while (true) {
			System.out.println("");
		}
		// System.out.println("UN-REACHABLE");
	}
}
