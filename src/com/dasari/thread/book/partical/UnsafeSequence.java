package com.dasari.thread.book.partical;

public class UnsafeSequence {
	private int value;

	public int getValue() {
		return value++;
	}
}
