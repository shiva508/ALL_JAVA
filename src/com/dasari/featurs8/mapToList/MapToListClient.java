package com.dasari.featurs8.mapToList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListClient {
	public static void main(String[] args) {
		Map<Integer, String> studentDetails = Map.of(503, "Madhu", 504, "Nithya", 508, "Shiva");
		List<Integer> ids = studentDetails.keySet().stream().collect(Collectors.toList());
		List<String> names=studentDetails.values().stream().collect(Collectors.toList());
	}
}
