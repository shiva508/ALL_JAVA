package com.dasari.thread.book.partical;

public class Sequence {
	private int value;

	public synchronized int nextValue() {
		return value++;
	}
}
