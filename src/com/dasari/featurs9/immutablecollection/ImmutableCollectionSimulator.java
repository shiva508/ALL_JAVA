package com.dasari.featurs9.immutablecollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionSimulator {
	public static void main(String[] args) {
		// CREATE EMPTY LIST
		List immutableList = List.of();
		List immutableIntegerList = List.of(1, 2, 3, 4);
		Map immutableMap = Map.of(1, "one", 2, "two");
		Set immutableSet = Set.of("Shiva");
	}
}
