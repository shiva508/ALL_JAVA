package com.dasari.string.reversestringmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverseExample {

	public static void main(String[] args) {
		String mytest="WELCOME";
		reverseStringUsingStringBuffer(mytest);
		reverseStringUsingToCharArray(mytest);
		reverseStringUsingGetBytes(mytest);
		reverseStringUsingToCharArrayTempVariable(mytest);
		reverseStringUsingUsingArrayList(mytest);
	}

	private static void reverseStringUsingUsingArrayList(String mytest) {
		char text[]=mytest.toCharArray();
		List<Character> cha=new ArrayList<>();
		for (Character character : text) {
			cha.add(character);
		}
		Collections.reverse(cha);
		cha.forEach(System.out::println);
	}

	private static void reverseStringUsingToCharArrayTempVariable(String mytest) {
	char tempVar[]=	mytest.toCharArray();
		int left,right=0;
		right=tempVar.length-1;
		for (left=0; left < right ; left++ ,right--) {
			char temp=tempVar[left];
			tempVar[left]=tempVar[right];
			tempVar[right]=temp;
		}
		for (char c : tempVar) {
			System.out.println(c);
		}
	}

	private static void reverseStringUsingGetBytes(String mytest) {
		byte bytes[]=mytest.getBytes();
		byte result[]=new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			result[i]=bytes[bytes.length-i-1];
		}
		System.out.println(new String(result));
	}

	private static void reverseStringUsingToCharArray(String mytest) {
	char test[]=	mytest.toCharArray();
	StringBuffer buffer=new StringBuffer();
	for (int i = test.length-1; i >=0; i--) {
		buffer.append(test[i]);
	}
	System.out.println(buffer.toString());
	}

	private static void reverseStringUsingStringBuffer(String mytest) {
		String reverse=new StringBuffer(mytest).reverse().toString();
		System.out.println(reverse);
		
	}

}
