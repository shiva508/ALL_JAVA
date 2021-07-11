package com.dasari.util.SET;

import java.util.Comparator;

public class BookComparator {
	private String bookName;
	private String uuid;
	private Double price;
	private Integer numberOfPages;

	public BookComparator() {

	}

	public String getBookName() {
		return bookName;
	}

	public BookComparator setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}

	public String getUuid() {
		return uuid;
	}

	public BookComparator setUuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public BookComparator setPrice(Double price) {
		this.price = price;
		return this;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public BookComparator setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
		return this;
	}

	@Override
	public String toString() {
		return "BookComparator [bookName=" + bookName + ", uuid=" + uuid + ", price=" + price + ", numberOfPages="
				+ numberOfPages + "]";
	}

}
