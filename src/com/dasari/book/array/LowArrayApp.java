package com.dasari.book.array;

public class LowArrayApp {
	public static void main(String[] args) {
		LowArray arr;
		arr = new LowArray(100);
		int nElems = 0;
		int j;
		long searchKey;
		arr.setArrayValue(0,77);
		arr.setArrayValue(1,99);
		arr.setArrayValue(2,44);
		arr.setArrayValue(3,55);
		arr.setArrayValue(4,22);
		arr.setArrayValue(5,88);
		arr.setArrayValue(6,11);
		arr.setArrayValue(7,00);
		arr.setArrayValue(8,66);
		arr.setArrayValue(9,33);
		nElems = 10;

		for (int i = 0; i < nElems; i++) {
			System.out.println(arr.getArrayValue(i));
		}

		System.out.println("==================================");
		searchKey = 66;
		for (int i = 0; i < nElems; i++) {
			if (searchKey == arr.getArrayValue(i)) {
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
			if (arr.getArrayValue(i) == deleted) {
				deleteElementIndex=i;
				nElems--;
				break;
			}
		}
		System.out.println("==================================");
		for (int i = deleteElementIndex; i < arr.arrayLength()-1; i++) {
			arr.setArrayValue(i, arr.getArrayValue(i+1));
		}
		System.out.println("==================================");
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr.getArrayValue(i));
		}
	}
}
