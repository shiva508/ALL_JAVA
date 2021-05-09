package com.dasari.book.array;

import java.util.Iterator;

public class ArrayApp {
	public static void main(String[] args) {
		long[] arr;
		arr = new long[100];
		int nElems = 0;
		int j;
		long searchKey;
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;

		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==================================");
		searchKey = 66;
		for (int i = 0; i < nElems; i++) {
			if (searchKey == arr[i]) {
				break;
			}
			if (nElems == i) {
				System.out.println("can not find" + searchKey);
			} else {
				System.out.println("find" + searchKey);
			}
		}
		System.out.println("==================================");
		long deleted = 11;
		int deleteElementIndex=0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] == deleted) {
				deleteElementIndex=i;
				nElems--;
				break;
			}
		}
		System.out.println("==================================");
		for (int i = deleteElementIndex; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println("==================================");
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
