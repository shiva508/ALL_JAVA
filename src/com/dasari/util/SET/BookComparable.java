package com.dasari.util.SET;

public class BookComparable implements Comparable<BookComparable> {
	private String bookName;
	private String uuid;
	private Double price;
	private Integer numberOfPages;

	public BookComparable() {

	}

	public String getBookName() {
		return bookName;
	}

	public BookComparable setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}

	public String getUuid() {
		return uuid;
	}

	public BookComparable setUuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public BookComparable setPrice(Double price) {
		this.price = price;
		return this;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public BookComparable setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
		return this;
	}

	@Override
	public int compareTo(BookComparable bc) {

		if (this.getPrice() == bc.getPrice()) {
			return 0;
		} else if (this.getPrice() > bc.getPrice()) {
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "BookComparable [bookName=" + bookName + ", uuid=" + uuid + ", price=" + price + ", numberOfPages="
				+ numberOfPages + "]";
	}

}
