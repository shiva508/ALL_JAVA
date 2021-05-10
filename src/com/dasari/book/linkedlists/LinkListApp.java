package com.dasari.book.linkedlists;

public class LinkListApp {
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insertFirst(508, 408);
		linkList.insertFirst(108, 208);
		linkList.insertFirst(808, 708);
		linkList.displayList();
		linkList.delete(108);
		//linkList.deleteLink();
		System.out.println("======================");
		linkList.displayList();
	}
}
