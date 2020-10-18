package com.dasari.generics.comparable;

public class Names implements Comparable<Names> {
	private String name;
	private Integer age;

	public Names(String name, Integer age) {
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

	@Override
	public String toString() {
		return "Names [name=" + name + ", age=" + age + "]";
	}
	//age > ageDestination.getAge())--->ascending order
	//age < ageDestination.getAge())--->descending order
	@Override
	public int compareTo(Names ageDestination) {
		if (age == ageDestination.getAge()) {
			return 0;
		} else if (age > ageDestination.getAge()) {
			return 1;
		} else {
			return -1;
		}

	}

}
