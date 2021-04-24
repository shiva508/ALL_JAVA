package com.dasari.featurs8.stream.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class UsingCollectMethodAndCollectors {
	public static void main(String[] args) {
		List<FamilyNumber> familyList = Arrays.asList(new FamilyNumber("Shiva", 27), new FamilyNumber("Satish", 28),
				new FamilyNumber("Ravi", 19), new FamilyNumber("Gopi", 28));
		System.out.println("++++++++++++++++++++++++++");
		// old
		List<FamilyNumber> familyList1= new ArrayList<FamilyNumber>();
		familyList.stream().filter(family->family.getAge()>21).forEach(family->familyList1.add(family));
		System.out.println(familyList1);
		System.out.println("++++++++++++++++++++++++++");
		// improved
		List<FamilyNumber> familyList2 = familyList.stream().filter(family->family.getAge()>21).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(familyList2);
		System.out.println("++++++++++++++++++++++++++");
		// improved 2
		List<FamilyNumber> familyList3 = familyList.stream().filter(family->family.getAge()>21).collect(Collectors.toList());
		System.out.println(familyList3);
		System.out.println("++++++++++++++++++++++++++");
		// groupingBy()
		Map<Integer, List<FamilyNumber>> familyList4 = familyList.stream().collect(Collectors.groupingBy(FamilyNumber::getAge));
		System.out.println("Group By:" + familyList4);
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++");
		Map<Integer, List<String>> familyListbyNameofpeople=familyList.stream().collect(Collectors.groupingBy(FamilyNumber::getAge, Collectors.mapping(FamilyNumber::getName, Collectors.toList())));
		System.out.println("Group By:" + familyListbyNameofpeople);
		System.out.println("++++++++++++++++++++++++++");
		//more combination
		Comparator<FamilyNumber> comparator=Comparator.comparing(FamilyNumber::getAge);
		Map<Character, Optional<FamilyNumber>> oldestPersonInEachAlphabet=familyList.stream()
																					.collect(Collectors.groupingBy(familyNumber->familyNumber.getName().charAt(0), 
																							Collectors.reducing(BinaryOperator.maxBy(comparator))));
		System.out.println("Group By:" + oldestPersonInEachAlphabet);
		System.out.println("++++++++++++++++++++++++++");
		Map<Character, List<FamilyNumber>> personInEachAlphabet=familyList.stream().collect(Collectors.groupingBy(familyNumber->familyNumber.getName().charAt(0)));
		System.out.println(""+personInEachAlphabet);
		System.out.println("++++++++++++++++++++++++++");
		//improved
		
		
	}
}
