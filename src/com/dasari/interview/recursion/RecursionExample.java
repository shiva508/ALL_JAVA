package com.dasari.interview.recursion;

public class RecursionExample {
	public static int count = 0;
	public static int factorial = 4;

	public static void main(String[] args) {
		process();
		String testText="Shiva";
		int facto = factorialProcessor(factorial);
		System.out.println(facto);
		stringProcessor(testText,testText.length()-1);
	}

	private static String stringProcessor(String testText, int length) {
	if(length==0) {
		System.out.println(testText);
		return testText;
	}
	System.out.println(testText.charAt(length));
	return stringProcessor(testText.substring(0, length),length-1);
		
	}

	private static int factorialProcessor(int factorial2) {
		if (factorial2 == 1) {
			return factorial2;
		}
		return factorial2 * factorialProcessor(factorial2 - 1);

	}

	private static void process() {
		count++;
		if (count <= 5) {
			System.out.println("Hi" + count);
			process();
		}
	}
}
