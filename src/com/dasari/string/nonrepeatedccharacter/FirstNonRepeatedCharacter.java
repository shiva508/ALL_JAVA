package com.dasari.string.nonrepeatedccharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String text="WELCOME";
		getFirstNonRepeatedChar(text);
		firstNonRepeatingChar(text);
	}

	private static void firstNonRepeatingChar(String text) {
		
	}

	private static void getFirstNonRepeatedChar(String text) {
		Map<Character, Integer> count=new LinkedHashMap<Character, Integer>();
		text.toCharArray();
		for ( Character character: text.toCharArray()) {
			if(count.containsKey(character)) {
				count.put(character, count.get(character)+1);
			}else {
				count.put(character, 1);
			}
		}
		int itre=0;
			System.out.println("Before java8");
		for(Entry<Character, Integer> set:count.entrySet()) {
			if(itre<=0) {
				if(set.getValue()==1) {
					itre=itre+1;
					System.out.println(set.getKey()+"-"+set.getValue());
				}
			}
		}
		System.out.println("From java 8");
		Optional<Entry<Character, Integer>>filteredData=count.entrySet().stream().filter(map->map.getValue()==1).findFirst();
		Entry<Character, Integer>filteredDataOutput=filteredData.get();
		System.out.println(filteredDataOutput.getKey()+"-"+filteredDataOutput.getValue());
		System.out.println(	count.entrySet().stream().filter(map->map.getValue()==1).findFirst());
	}

}
