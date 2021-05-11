package com.dasari.string.vowelcounter;

import java.util.regex.Pattern;

public class VowelCounter {

	public static void main(String[] args) {
		String testText="Shiva";
		vowelConterProcessor(testText);
		vowelConterProcessorUsingSwitch(testText);

	}

	private static void vowelConterProcessorUsingSwitch(String testText) {
		int vowelCount=0;
		char[] textChar=testText .toCharArray();
		for (char c : textChar) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount=vowelCount+1;
				break;

			default:
				break;
			}
		}
		System.out.println(vowelCount);
	}

	private static void vowelConterProcessor(String testText) {
		int vowelCount=0;
		int consonentsCount=0;
		char[] textChar=testText .toCharArray();
		for (char c : textChar) {
			if (Pattern.matches("[aeiou]", Character.toString(c))) {
				vowelCount=vowelCount+1;
			} else {
				consonentsCount=consonentsCount+1;
			}
		}
		System.out.println(vowelCount+"-"+consonentsCount);
	}

}
