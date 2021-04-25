package com.dasari.interview.sentencereverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String myName = "DASARI SHIVA";
		System.out.println("Converting String into Bytes");
		byte[] strAsByArray = myName.getBytes();
		byte[] result = new byte[strAsByArray.length];
		for (int i = 0; i < strAsByArray.length; i++) {
			result[i] = strAsByArray[strAsByArray.length - i - 1];
		}
		System.out.println(new String(result));
		System.out.println("Using built in reverse() method of the StringBuilder class");
		StringBuffer buffer=new StringBuffer();
		buffer.append(myName);
		System.out.println(buffer.reverse());
	
		System.out.println("Converting String to character array");
		char [] charArray=myName.toCharArray();
		
		for(int i=charArray.length-1;i>=0;--i) {
			System.out.println(charArray[i]);
		}
		System.out.println("Using ArrayList object:");
		char [] temArray=myName.toCharArray();
		List<Character> myList=new ArrayList<>();
		for (char c : temArray) {
			myList.add(c);
		}
		Iterator< Character> itr=myList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Java program to Reverse a String using swapping");
		char [] tempArray1=myName.toCharArray();
		int left,right=0;
		right=tempArray1.length-1;
		for(left=0;left<right;left++,right--) {
			char temp=tempArray1[left];
			tempArray1[left]=tempArray1[right];
			tempArray1[right]=temp;
		}
		
		for (char c : tempArray1) {
			System.out.println(c);
		}
	}
}
