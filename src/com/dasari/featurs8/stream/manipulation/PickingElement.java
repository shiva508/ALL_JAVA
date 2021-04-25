package com.dasari.featurs8.stream.manipulation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickingElement {
	// Optional
	public static void getNameByLetter(final List<String> names, final String startingLetter) {
		final Optional<String> result = names.stream().filter(name -> name.contains(startingLetter)).findFirst();
		System.out
				.println(String.format("A name starting with %s: %s", startingLetter, result.orElse("No name found")));

	}

	public static void main(String[] args) {
		List<String> studentsNames = Arrays.asList("Ravi", "Satish", "Kavya", "Mounika", "Rajeswari", "Gopi", "Shiva");
		getNameByLetter(studentsNames, "S");
	}

}
