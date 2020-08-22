package com.dasari.parent;

public class ParentTest {

	public static void main(String[] args) {
		User user=new User();
		user.setUsername("dsJ");
		Child child=new Child(user);
		System.out.println(child.petPassword());
	}

}
