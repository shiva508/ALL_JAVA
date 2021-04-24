package com.dasari.arrays.singledimentional.model;

public class BookArrayModel {
	public static void main(String[] args) {
		Book booksArrayList[] = null;
		Book[] booksArrayListUpdated = processingBooks(booksArrayList, 10);
		System.out.println(booksArrayListUpdated.length);
	}

	private static Book[] processingBooks(Book[] booksArrayList, int arrayLength) {
		booksArrayList = new Book[arrayLength];
		booksArrayList[0] = new Book("Time Comes", "120");
		booksArrayList[9] = new Book("Time Never Comes", "100");
		int count = 0;
		for (int j = 0; j < booksArrayList.length; j++) {
			if (booksArrayList[j] != null) {
				count = count + 1;
			}
			System.out.println(booksArrayList[j]);
		}
		System.out.println("Final Count:" + count);
		return booksArrayList;

	}

}
