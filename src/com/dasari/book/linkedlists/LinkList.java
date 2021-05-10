package com.dasari.book.linkedlists;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteLink() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		Link current = first;
		while (current != null) {
			System.out.println(current.display());
			current = current.next;
		}
	}

	public Link find(int key) {
		Link current = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}

	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}

}
