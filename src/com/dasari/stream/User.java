package com.dasari.stream;

public class User {
	private String name;
	private Integer age;
	private boolean active;

	public User() {

	}

	

	public User(String name, Integer age, boolean active) {
		super();
		this.name = name;
		this.age = age;
		this.active = active;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
