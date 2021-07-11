package com.dasari.util.SET;

import java.util.Comparator;

public class BookCustomComparator implements Comparator<BookComparator> {

	@Override
	public int compare(BookComparator bc1, BookComparator bc2) {
		if (bc1.getPrice() < bc2.getPrice()) {
			return 1;
		} else if (bc1.getPrice() > bc2.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}
