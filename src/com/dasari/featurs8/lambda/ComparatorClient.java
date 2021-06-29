package com.dasari.featurs8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class ComparatorClient {

	class LengthComparator implements Comparator<String> {
		@Override
		public int compare(String first, String second) {
			return Integer.compare(first.length(), second.length());
		}
	}

	public static void main(String[] args) {
		List<String> listOfNames=Arrays.asList("Shiva","Nithya","Data","Element");
		System.out.println(listOfNames);
		beforeJava8(listOfNames);
		
		//lambda
		
		withJava8(listOfNames);
		
		//lambda inline 
		
		withJava8Inline(listOfNames);
		BiFunction<String, String, Integer> biFun=(first,second)->Integer.compare(first.length(), second.length());	
	}

	private static void withJava8Inline(List<String> listOfNames) {
		listOfNames.stream().sorted((first,second)->Integer.compare(first.length(), second.length()));
	}

	private static void withJava8(List<String> listOfNames) {
		listOfNames.stream().sorted((first,second)->{
			return Integer.compare(first.length(), second.length());
		});
	}

	private static void beforeJava8(List<String> listOfNames) {
		ComparatorClient client=new ComparatorClient();
		Collections.sort(listOfNames, client.new LengthComparator());
		System.out.println(listOfNames);
	}

}
