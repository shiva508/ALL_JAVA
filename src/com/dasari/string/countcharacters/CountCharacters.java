package com.dasari.string.countcharacters;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		String testText="dgswadgtDTWT ESD adsatdsghdfhWF";
countOfCharactersUsingsingleChar(testText,"a");
countOfCharactersUsingHashmap(testText);
	}

	private static void countOfCharactersUsingHashmap(String testText) {
		char testTextArr[]=testText.toCharArray();
		Map<Character, Integer> map=new  LinkedHashMap<Character, Integer>();
		for (char c : testTextArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		map.forEach((k,v)->System.out.println(k+"-"+v));
	}

	private static void countOfCharactersUsingsingleChar(String testText, String string) {
		char testTextArr[]=testText.toCharArray();
		int count=0;
		for (char c : testTextArr) {
			if(string.equalsIgnoreCase(Character.toString(c))) {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
