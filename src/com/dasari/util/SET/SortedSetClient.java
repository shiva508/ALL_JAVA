package com.dasari.util.SET;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClient {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("Shiva");
		sortedSet.add("Nithya");
		sortedSet.add("Madhu");
		sortedSet.add("Sai");
		sortedSet.add("Indhu");
		sortedSet.add("Geetha");
		System.out.println(sortedSet);
		SortedSet<BookComparable> bookComparables=new TreeSet<>();
		bookComparables.add(new BookComparable().setBookName("The Monk Who Sold His Ferrary").setNumberOfPages(200).setPrice(300.00).setUuid("THWSHF"));
		bookComparables.add(new BookComparable().setBookName("The Power Of Now").setNumberOfPages(150).setPrice(1200.00).setUuid("TPON"));
		bookComparables.add(new BookComparable().setBookName("Start With Why").setNumberOfPages(400).setPrice(800.00).setUuid("SWW"));
		bookComparables.forEach(book->{
			System.out.println(book);
		});
		System.out.println("=========================================================");
		SortedSet<BookComparator> bookComparator=new TreeSet<>(new BookCustomComparator());
		bookComparator.add(new BookComparator().setBookName("The Monk Who Sold His Ferrary").setNumberOfPages(200).setPrice(300.00).setUuid("THWSHF"));
		bookComparator.add(new BookComparator().setBookName("The Power Of Now").setNumberOfPages(150).setPrice(1200.00).setUuid("TPON"));
		bookComparator.add(new BookComparator().setBookName("Start With Why").setNumberOfPages(400).setPrice(800.00).setUuid("SWW"));
		bookComparator.forEach(book->{
			System.out.println(book);
		});
		
	}
}
