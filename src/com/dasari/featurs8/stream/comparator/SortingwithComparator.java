package com.dasari.featurs8.stream.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortingwithComparator {
	public static void printPeople(
			final String message, final List<FamilyNumber> familyNumber) {
			System.out.println(message);
			familyNumber.forEach(System.out::println);
			}
	public static void main(String[] args) {
		List<FamilyNumber> familyList = Arrays.asList(new FamilyNumber("Shiva", 27), new FamilyNumber("Satish", 28),
				new FamilyNumber("Ravi", 19), new FamilyNumber("AA", 99));
		FamilyNumber familyNumber1 = new FamilyNumber("a", 11);
		// Without functional interface
		Function<FamilyNumber, Integer> familyNumberFunction = new Function<FamilyNumber, Integer>() {
			@Override
			public Integer apply(FamilyNumber familyNumber) {
				return familyNumber.getAge();
			}
		};

		Function<FamilyNumber, String> familyNumberFunctionInterface = familyNumber -> familyNumber.getName();
		System.out.println(familyNumberFunction.apply(familyNumber1));
		List<FamilyNumber> familyNumberList = familyList.stream()
				.sorted((familyNumberOne, familyNumberTwo) -> familyNumberOne.ageDifference(familyNumberTwo))
				.collect(Collectors.toList());
		System.out.println("++++++++++++++++++++++++++");
		System.out.println(familyNumberList);
		System.out.println("++++++++++++++++++++++++++");
		// Improved
		List<FamilyNumber> familyNumberListImproved = familyList.stream().sorted(FamilyNumber::ageDifference)
				.collect(Collectors.toList());
		System.out.println(familyNumberListImproved);
		System.out.println("++++++++++++++++++++++++++");
		// difficult to improvise
		Comparator<FamilyNumber> assendingOrder = (FamilyNumber fn1, FamilyNumber fn2) -> fn1.ageDifference(fn2);
		Comparator<FamilyNumber> descendingOrder = assendingOrder.reversed();
		// assending
		List<FamilyNumber> familyNumberList3 = familyList.stream().sorted(assendingOrder).collect(Collectors.toList());
		System.out.println(familyNumberList3);
		System.out.println("++++++++++++++++++++++++++");
		// Descending
		List<FamilyNumber> familyNumberList4 = familyList.stream().sorted(descendingOrder).collect(Collectors.toList());
		System.out.println(familyNumberList4);
		System.out.println("++++++++++++++++++++++++++");
		// sorting by name
		List<FamilyNumber> familyNumberList5 = familyList.stream().sorted(
				(familyNumber, familyNumber2) -> familyNumber.getName().compareToIgnoreCase(familyNumber2.getName()))
				.collect(Collectors.toList());
		System.out.println(familyNumberList5);
		System.out.println("++++++++++++++++++++++++++");
		// MIN-AGE PREDICATE

		Predicate<FamilyNumber> predicateFamilyNumber = new Predicate<FamilyNumber>() {
			@Override
			public boolean test(FamilyNumber familyNumber) {
				return familyNumber.getAge()>21;
			}
		};
		Predicate<FamilyNumber> predicateFamilyNumberImproved = familyNumber->familyNumber.getAge()>21;
		boolean filteredData=familyList.stream().allMatch(predicateFamilyNumberImproved);
		System.out.println(filteredData);
		System.out.println("++++++++++++++++++++++++++");
		familyList.stream().max(FamilyNumber::ageDifference).ifPresent(eldest->System.out.println(eldest));
		System.out.println("++++++++++++++++++++++++++");
		//refactor
		Function<FamilyNumber, String> byName=familyNumber->familyNumber.getName();
		List<FamilyNumber>familyNumberList6=familyList.stream().sorted(Comparator.comparing(byName)).collect(Collectors.toList());
		printPeople("This is sorted list",familyNumberList6);
		Function<FamilyNumber, Integer> byAge=familyNumber->familyNumber.getAge();
		List<FamilyNumber>familyNumberList7=familyList.stream().sorted(Comparator.comparing(byAge)).collect(Collectors.toList());
		printPeople("This is sorted list",familyNumberList7);
		System.out.println("++++++++++++++++++++++++++");
		List<FamilyNumber>familyNumberList8=familyList.stream().sorted(Comparator.comparing(byName).thenComparing(byAge)).collect(Collectors.toList());
		printPeople("This is sorted list",familyNumberList8);
		System.out.println("++++++++++++++++++++++++++");
		
		

	}
}
