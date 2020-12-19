package com.dasari.facebook.assingnment;

public class Checken {
	private Integer age;
	private Double weight;
	private Integer IDNumber;

	public Checken() {
	}

	public Integer getAge() {
		return age;
	}

	public Checken setAge(Integer age) {
		this.age = age;
		return this;
	}

	public Double getWeight() {
		return weight;
	}

	public Checken setWeight(Double weight) {
		this.weight = weight;
		return this;
	}

	public Integer getIDNumber() {
		return IDNumber;
	}

	public Checken setIDNumber(Integer iDNumber) {
		IDNumber = iDNumber;
		return this;
	}

	@Override
	public String toString() {
		return "Checken [age=" + age + ", weight=" + weight + ", IDNumber=" + IDNumber + "]";
	}

}
