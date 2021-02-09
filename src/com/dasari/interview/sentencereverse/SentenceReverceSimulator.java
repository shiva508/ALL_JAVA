package com.dasari.interview.sentencereverse;

public class SentenceReverceSimulator {

	public static void main(String[] args) {
		char sentenceArray[] = { 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a',
				'c', 't', 'i', 'c', 'e' };
		changeSentanceChager(sentenceArray);
	}

	public static char[] changeSentanceChager(char[] sentenceArray) {
		if (sentenceArray == null || sentenceArray.length == 0) {
			return null;
		}
		int lengthOfCharArray = sentenceArray.length;
		char[] sentance = {};
		System.out.println("Length:" + lengthOfCharArray);
		for (int i = 0; i < lengthOfCharArray; i++) {
			if (sentenceArray[i] == ' ') {
				sentance = appendDataToCharArray(sentenceArray, lengthOfCharArray, i);
			}
		}
		return null;
	}

	private static char[] appendDataToCharArray(char[] sentenceArray, int lengthOfCharArray, int i) {

		return null;
	}
}
