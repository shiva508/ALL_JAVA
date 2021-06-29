package com.dasari.util.ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClient {
	public static Integer MAX_SIZE = 20;

	public static void main(String[] args) {
		List<Integer> arrayListData = new ArrayList<>(MAX_SIZE);
		arrayListData.add(10);
		arrayListData.set(1, 12);
		System.out.println(arrayListData);
	}

}
