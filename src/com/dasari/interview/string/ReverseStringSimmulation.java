package com.dasari.interview.string;

public class ReverseStringSimmulation {
	public static void main(String[] args) {
		String name = "Dasari Shiva";
		reverseStringWithOutStringInbuiltFunctions(name);

		reverseStringWithoutStringBufferFunctions(name);
	}

	private static void reverseStringWithoutStringBufferFunctions(String name) {
		char nameCharArray[] = name.toCharArray();
		String reverseName="";
		for (int i = nameCharArray.length-1; i >= 0; i--) {
			reverseName=reverseName+nameCharArray[i];
		}
		System.out.println(reverseName);
	}

	private static void reverseStringWithOutStringInbuiltFunctions(String name) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		buffer = buffer.reverse();
		System.out.println(buffer);
	}
}
