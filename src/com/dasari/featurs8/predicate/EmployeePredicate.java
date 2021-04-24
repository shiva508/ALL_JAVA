package com.dasari.featurs8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
	public static Predicate<Employee> age21MalePredicate(Integer age, String gender) {
		return e -> e.getAge() > 21 && e.getGender().equalsIgnoreCase(gender);
	}

	public static Predicate<Employee> age18FemalePredicate(Integer age, String gender) {
		return e -> e.getAge() == 18 && e.getGender().equals(gender);
	}

	public static Predicate<Employee> ageMoreThan(Integer age) {
		return e -> e.getAge() > age;
	}

	public static List<Employee> filtering(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.toList());
	}
}
