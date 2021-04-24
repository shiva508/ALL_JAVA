package com.dasari.featurs8.iteratingstring;

public class IteratingString {
	public static void getstring(int cha) {
		System.out.println((char) (cha));
	}

	public static void main(String[] args) {
		final String str = "w00t";
		System.out.println("++++++++++++++++++++++++++");
		str.chars().forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++");
		str.chars().forEach(IteratingString::getstring);
		System.out.println("++++++++++++++++++++++++++");
		str.chars().mapToObj(cha->Character.valueOf((char)cha)).forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++");
		str.chars().filter(ch->Character.isDigit(ch)).forEach(IteratingString::getstring);
		System.out.println("++++++++++++++++++++++++++");
		str.chars().filter(Character::isDigit).forEach(IteratingString::getstring);
	}
}
