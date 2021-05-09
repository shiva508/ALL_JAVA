package com.dasari.book.array;

public class OrderedArray {
	private long[] a;
	private int nElems;

	public OrderedArray(int maxArrayLegth) {
		a = new long[maxArrayLegth];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public int find(long searchKeyword) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKeyword) {
				return curIn;
			} else if (lowerBound > upperBound) {
				return nElems;
			} else {
				if (a[curIn] < searchKeyword) {
					lowerBound = curIn + 1;
				} else {
					upperBound = curIn - 1;
				}
			}
		}
	}

}
