package com.dasari.featurs8.stream.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ManipulatingCollection {
	public static void main(String[] args) {
		// upto java7
		final List<String> uppercaseNames = new ArrayList<String>();
		List<String> uppercaseNames1 = new ArrayList<String>();
		List<String> studentsNames = Arrays.asList("Ravi", "Satish", "Kavya", "Mounika", "Rajeswari", "Gopi", "Shiva");
		for (String name : studentsNames) {
			// uppercaseNames.add(name);// add to manupulated list
			System.out.println(name.toUpperCase());
			System.out.println(name.toLowerCase());
		}
		System.out.println("++++++++++++++++++++++++++");
		studentsNames.forEach(name->uppercaseNames.add(name.toUpperCase()));
		System.out.println(uppercaseNames);
		System.out.println("++++++++++++++++++++++++++");
		//Using Lambda Expressions-map mutabulity
		List<String> up=studentsNames.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		studentsNames.stream().map(name->name.toUpperCase()).forEach(upperCaseName->System.out.println(upperCaseName));
		System.out.println("++++++++++++++++++++++++++");
		List<Integer> num=studentsNames.stream().map(String::length).collect(Collectors.toList());
		studentsNames.stream().map(name->name.length()).forEach(upperCaseName->System.out.println(" "+upperCaseName));
		System.out.println("++++++++++++++++++++++++++");
		//Using Method References
	
		studentsNames.stream().map(String::toUpperCase).forEach(upperCaseName->System.out.println(" "+upperCaseName));
		System.out.println("++++++++++++++++++++++++++");
		//to other list
		uppercaseNames1=studentsNames.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseNames1+"New List");
	}
}
