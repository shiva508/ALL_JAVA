package com.dasari.generics.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableTest {

	public static void main(String[] args) {
		List<Names> namesList = new ArrayList<>();
		namesList.add(new Names("Shva", 30));
		namesList.add(new Names("Ravi", 19));
		namesList.add(new Names("Satish", 31));
		namesList.add(new Names("Satish", 31));
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println(namesList);
		System.out.println(namesList.stream().
				distinct()
				.collect(Collectors.toList()));
		System.out.println(namesList.stream()
				.filter(data->Collections
						.frequency(namesList, data.getAge())==1)
				.collect(Collectors.toList()));
		
	}

}
