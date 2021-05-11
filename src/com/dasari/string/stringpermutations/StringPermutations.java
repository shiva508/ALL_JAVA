package com.dasari.string.stringpermutations;

public class StringPermutations {

	public static void main(String[] args) {
		String testText="XYZ";
		stringPermitationProcesser(testText);
	}

	private static void stringPermitationProcesser(String testText) {
		char testTextArr[]=testText.toCharArray();
		
		
		System.out.println(testText);
		swapText(testText, 0, null);
	}

	private static String swapText(String testText,Integer current,Integer nextNodeLength) {
		char temp=testText.charAt(current+1);
		
		return testText;
	}
	
	
}
