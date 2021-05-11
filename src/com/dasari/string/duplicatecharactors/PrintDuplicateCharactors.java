package com.dasari.string.duplicatecharactors;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class PrintDuplicateCharactors {

	public static void main(String[] args) {
		process("String  word");
	}
public static void process(String  word) {
	char[] chars=word.toCharArray();
	Map<Character, Integer> duplicate=new HashMap<Character, Integer>();
	duplicate(chars, duplicate);
}
/**
 * @param chars
 * @param duplicate
 */
public static void duplicate(char[] chars, Map<Character, Integer> duplicate) {
	for (Character c : chars) {
		if(!Character.isWhitespace(c)) {
			if(duplicate.containsKey(c)) {
				duplicate.put(c, duplicate.get(c)+1);
			}else {
				duplicate.put(c, 1);
			}	
		}
	}
	duplicate.forEach((k,v)->System.out.println(k+"-"+v));
	Character ada=duplicate.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	duplicate.entrySet().stream().filter(map->map.getKey().equals(ada)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	System.out.println("Highest repeted char:"+ada);
}

}
