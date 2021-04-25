package com.dasari.featurs8.stream.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindingElements {
	public static Predicate<String> containsCheck(String letter) {
		return name -> name.contains(letter);
	}

	public static void main(String[] args) {
		// upto java7
		final List<String> contiansS = new ArrayList<String>();
		List<String> contiansR = new ArrayList<String>();
		List<String> contiansA = new ArrayList<String>();
		List<String> contiansT = new ArrayList<String>();
		List<String> contiansH = new ArrayList<String>();
		List<String> studentsNames = Arrays.asList("Ravi", "Satish", "Kavya", "Mounika", "Rajeswari", "Gopi", "Shiva");
		for (String name : studentsNames) {
			if (name.contains("S")) {
				contiansS.add(name);
			}
		}
		System.out.println(contiansS);
		System.out.println("++++++++++++++++++++++++++");
		// java 8- filter
		contiansR = studentsNames.stream().filter(name -> name.contains("R")).collect(Collectors.toList());
		System.out.println(contiansR);
		System.out.println("++++++++++++++++++++++++++");
		// Removing duplicate code:contains("R")

		// predicate
		Predicate<String> containsA = name -> name.contains("a");
		contiansA = studentsNames.stream().filter(containsA).collect(Collectors.toList());
		// Removing Duplication with Lexical Scoping
		contiansT = studentsNames.stream().filter(containsCheck("t")).collect(Collectors.toList());
		System.out.println(contiansT);
		System.out.println("++++++++++++++++++++++++++");
		// Refactoring to Narrow the Scopes
		final Function<String, Predicate<String>> containsDynamicvData=(String word)->{
			Predicate<String> containsWord=name->name.contains(word);
			return containsWord;
		};
		//can reduce above method
		final Function<String, Predicate<String>> containsDynamicvData1=word->name->name.contains(word);
		
		contiansH=studentsNames.stream().filter(containsDynamicvData1.apply("h")).collect(Collectors.toList());
		System.out.println(contiansH);
		System.out.println("++++++++++++++++++++++++++");
	}
}
