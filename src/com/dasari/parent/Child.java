package com.dasari.parent;

public class Child implements ParentInterface{
	User user;
	
	public Child(User user) {
		super();
		this.user = user;
	}

	@Override
	public String petPassword() {
		return this.user .getUsername();
	}

}
