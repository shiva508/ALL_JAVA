package com.dasari.book.basic;

public class Counter {
	protected int count;

	public Counter() {
		count = 0;
	}

	public void setCountValue(int value) {
		this.count = value;
	}

	public int getIncrementedValue() {
		return count++;
	}
	
	public int getDecreamentValue() {
		return count--;
	}
	
}
