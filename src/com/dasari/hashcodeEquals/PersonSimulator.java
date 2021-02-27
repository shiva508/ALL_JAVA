package com.dasari.hashcodeEquals;

public class PersonSimulator {
	public static void main(String[] args) {
		Person person = new Person();
		person.setPersonid(1).setPersonName("Shiva");
		Person person2 = new Person();
		person2.setPersonid(1).setPersonName("Shiva");
		System.out.println("===:"+(person==person2));
		System.out.println("Equals:"+(person.equals(person2)));
	}
}
