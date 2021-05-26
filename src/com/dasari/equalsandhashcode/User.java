package com.dasari.equalsandhashcode;

public class User {
	private String name;
	private int age;
	private String adharNumber;

	public User() {
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public User setAge(int age) {
		this.age = age;
		return this;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public User setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adharNumber == null) ? 0 : adharNumber.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User user = (User) obj;

		return user.getName().equals(name) && user.getAge() == age && user.getAdharNumber().equals(adharNumber);
	}

}
