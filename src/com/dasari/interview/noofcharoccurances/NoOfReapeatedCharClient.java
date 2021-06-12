package com.dasari.interview.noofcharoccurances;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfReapeatedCharClient {
	public static void main(String[] args) {
		String data = "aaaabbbcccccdddddd";
		usingBruthForce();
		usingMap(data);
		usingJava8Map(data);
		usingJava8CodePoints(data);
	}

	private static void usingJava8CodePoints(String data) {
		Map<String, Long> duplicateData = data.codePoints().mapToObj(ch -> String.valueOf(Character.toChars(ch)))
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

	}

	private static void usingJava8Map(String data) {

		Map<Character, Integer> charCount = new HashMap<>();
		int length = data.length();
		for (int i = 0; i < length; i++) {
			Character character = data.charAt(i);
			charCount.compute(character, (key, value) -> (value == null) ? 1 : value + 1);
		}
		System.out.println(charCount);
	}

	private static void usingMap(String data) {
		Map<Character, Integer> charCount = new HashMap<>();
		int length = data.length();
		for (int i = 0; i < length; i++) {
			if (charCount.containsKey(data.charAt(i))) {
				charCount.put(data.charAt(i), charCount.get(data.charAt(i)) + 1);
			} else {
				charCount.put(data.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}

	private static void usingBruthForce() {

	}
}
