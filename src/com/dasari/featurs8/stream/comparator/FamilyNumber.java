package com.dasari.featurs8.stream.comparator;

public class FamilyNumber {
	private String name;
	private Integer age;

	public FamilyNumber(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
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

	public int ageDifference(final FamilyNumber other) {
		return this.age - other.age;
	}
	@Override
	public String toString() {
		return "FamilyNumber [name=" + name + ", age=" + age + "]";
	}

}
