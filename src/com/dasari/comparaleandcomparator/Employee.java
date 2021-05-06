package com.dasari.comparaleandcomparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
    private String name;
    private int age;
    private long salary;
    
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
	public static Comparator<Employee> salaryComp=new Comparator<Employee>() {
		@Override
		public int compare(Employee obj1, Employee obj2) {
			return (int) (obj1.getSalary()-obj2.getSalary());
		}
	};
	
	public static Comparator<Employee> nameComp=(obj1,obj2)->obj1.getName().compareTo(obj2.getName());
	public static Comparator<Employee> groupComparator=Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
	
	
}
