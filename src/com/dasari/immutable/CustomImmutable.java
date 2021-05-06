package com.dasari.immutable;

public final class CustomImmutable {
	private final String name;
	private final Integer age;
	public CustomImmutable(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	
}
