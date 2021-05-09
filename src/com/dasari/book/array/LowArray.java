package com.dasari.book.array;

public class LowArray {
	private long[] arr;

	public LowArray(int maxArrayLength) {
		arr = new long[maxArrayLength];
	}

	public void setArrayValue(int index, long value) {
		arr[index] = value;
	}

	public long getArrayValue(int index) {
		return arr[index];
	}

	public int arrayLength() {
		return arr.length;
	}

	public long[] getAllArrayValues() {
		return arr;
	}
}
