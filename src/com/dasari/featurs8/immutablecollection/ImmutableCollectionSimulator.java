package com.dasari.featurs8.immutablecollection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class ImmutableCollectionSimulator {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(408, 508);
		numbers.stream().filter(num->num>400).mapToInt(num->num).sum();
		numbers.stream().filter(num->num>400).mapToInt(Integer::intValue).sum();
		numbers.stream().filter(num->num>400).collect(Collectors.summingInt(Integer::intValue));
		numbers.stream().reduce(0, (x,y)->x+y);
		numbers.stream().reduce(0, Integer::sum);
		Set<String> set=Set.of("Shiva","Nithya");
		Map<String, Integer> map=Map.of("1",1);
	}
}
