package com.dasari.util.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClient {
	public static Integer MAX_SIZE = 20;

	public static void main(String[] args) {
		ArrayList<Integer> arrayListData = new ArrayList<>(MAX_SIZE);
		arrayListData.add(10);
		arrayListData.add(12);
		arrayListData.add(6);
		arrayListData.set(0, MAX_SIZE);
		arrayListData.remove(0);
		arrayListData.add(508);
		arrayListData.add(504);
		arrayListData.retainAll(List.of(508,504));
		System.out.println(arrayListData);
		List<Integer> synchronizedList= Collections.synchronizedList(arrayListData);
	}

}
