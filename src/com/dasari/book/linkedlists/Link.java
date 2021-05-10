package com.dasari.book.linkedlists;

public class Link {
	public int iData;
	public double dData;
	public Link next;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}

	public String display() {
		return "Link [iData=" + iData + ", dData=" + dData + "]";
	}

}
