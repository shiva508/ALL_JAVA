package com.dasari.featurs9.collectionchanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionSimulator {
	public static void main(String[] args) {
		mutableList();
		List<String> immutableList=List.of("Name1","Name2");
		System.out.println(immutableList);
		Map imutableMap=Map.of(1, "one", 2, "two", 3, "three");
		System.out.println(imutableMap);
	}

	private static void mutableList() {
		List<String> muttableList=new ArrayList<>();
	}
}
