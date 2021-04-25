package com.dasari.featurs8.stream.manipulation;

import java.util.Arrays;
import java.util.List;

public class JoiningElements {
	public static void main(String[] args) {
		List<String> studentsNames = Arrays.asList("Ravi", "Satish", "Kavya", "Mounika", "Rajeswari", "Gopi", "Shiva");
		// java-7
		System.out.println("++++++++++++++++++++++++++");
		for (String name : studentsNames) {
			System.out.println(name + ",");
		}
		System.out.println("++++++++++++++++++++++++++");
		int maxLength = studentsNames.size()-1;
		for (int i = 0; i < studentsNames.size(); i++) {
			if (i == maxLength) {
				System.out.println(studentsNames.get(i));
			} else {
				System.out.print(studentsNames.get(i) + ", ");
			}
		}
		System.out.println("\n++++++++++++++++++++++++++");
		System.out.println(String.join(",", studentsNames));
	}
}
