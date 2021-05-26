package com.dasari.equalsandhashcode;

public class UserSimulator {
	public static void main(String[] args) {
		User user1 = new User().setName("mkyong").setAge(29).setAdharNumber("111222333");
		User user2 = new User().setName("mkyong").setAge(29).setAdharNumber("111222333");
		System.out.println(user1.equals(user2));
	}
}
